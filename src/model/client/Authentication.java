package model.client;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import model.shared.Md5;
import model.shared.RSA;

public class Authentication {
    private final String clientPrivKeyFile = "./tmp/client_rsa.pri";
    private final String serverPublKeyFile = "./tmp/server_rsa.pub";
    public RSA rsa;
    
    private String studentName;
    
    public Authentication(){
        this.studentName = "";
        this.rsa = new RSA();
        this.loadKeys();
    }
    public Authentication(String studentName){
        this.studentName = studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return this.studentName;
    }
    /**
     * Encriptar el nombre del estudiante.
     * @return nombre del estudiante encriptado
     */
    public String getEncryptedName(){
        String encryptedName="";
        encryptedName = this.rsa.encrypt(this.studentName);
        return encryptedName;
    }     

    /**
     * Calcular el resumen del nombre del estudiante
     * @return Resumen del nombre.
     */
    public String getNameHash(){
        String studentNameHash = Md5.getMd5(this.studentName);
        return studentNameHash;
    }
    
    /**
     * Encriptar el resumen del nombre.
     * @return Resumen del nombre encriptado.
     */
    public String getEncryptedNameHash(){
        String encryptedNameHash="";
        encryptedNameHash = this.rsa.encrypt(this.getNameHash());
        return encryptedNameHash;
    }

    private void loadKeys() {
        try {
            this.rsa.openFromDiskPrivateKey(this.clientPrivKeyFile);
            this.rsa.openFromDiskPublicKey(this.serverPublKeyFile); 
        } catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
