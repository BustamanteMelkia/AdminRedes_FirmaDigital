package model.server;

import controller.Controller;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import model.shared.Md5;
import model.shared.RSA;
import model.shared.Student;

public class RequestManager {
    
    private final String clientPublKeyFile = "./tmp/client_rsa.pub";
    private final String serverPrivKeyFile = "./tmp/server_rsa.pri";

    private RSA rsa;
    private StudentDao studentDao;
    private Controller controller;
    // Nombre encriptado recibido
    private String encryptedName;
    // Resumen del nombre encripdado recibido
    private String encryptedNameHash;
    
    public RequestManager(Controller controller){
        this.rsa = new RSA();
        this.loadKeys();
        this.studentDao = new StudentDao();
        this.controller = controller;
        this.encryptedName = "";
        this.encryptedNameHash = "";
    }
    
    private void loadKeys() {
        try {
            
            this.rsa.openFromDiskPrivateKey(this.serverPrivKeyFile);
            this.rsa.openFromDiskPublicKey(this.clientPublKeyFile);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidKeySpecException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    /**
     * Obtener el nombre encritado recibido
     * @return
     */
    public String getEncryptedName(){
        return this.encryptedName;
    }
    public String getEncryptedNameHash(){
        return this.encryptedNameHash;
    }
    
    
    public void handleRequest(String encryptedNameHash, String encryptedName){
        this.encryptedName = encryptedName;
        this.encryptedNameHash = encryptedNameHash;
        this.controller.renderReceivedName(encryptedName);
        this.controller.renderReceivedEncryptedHash(encryptedNameHash);
    }

    public String decryptName(){
        return this.rsa.decrypt(this.encryptedName);
    }

    public String decryptHashName(){
        return this.rsa.decrypt(this.encryptedNameHash);
    }

    public String getHashName(){
        return Md5.getMd5(this.decryptName());
    }

    public String checkMessage(){
        String decryptedNameHash = this.rsa.decrypt(this.encryptedNameHash);
        String name = this.rsa.decrypt(this.encryptedName);
        String nameHash = Md5.getMd5(name);
        if(decryptedNameHash.equals(nameHash)){
            return rsa.encrypt("MENSAJE CORRECTO");
        }else{
            return rsa.encrypt("EL MENSAJE FUE MANIPULADO");
        }
    }
    /**
     * Obtener la calificación encriptada del estudiante

     * @return Texto encriptado que puede tomar uno de los siguientes valores.
     *      1. Calificación del estudiante: si este existe.
     *      3. "ESTUDIANTE NO REGISTRADO": Si el estudiante no está registrado.
     */
    public String getEncryptedGrade(){
        String name = this.rsa.decrypt(this.encryptedName);
        Student student = this.studentDao.getStudent(name);
        String grade = student != null
            ?  this.rsa.encrypt(student.getGrade())
            :  this.rsa.encrypt("ESTUDIANTE NO REGISTRADO");
        
        return grade;
    }
}
