package model.client;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import model.shared.Md5;
import model.shared.RSA;

public class Authentication {
    private final String clientPrivKeyFile = "./tmp/client_rsa.pri";
    private final String serverPublKeyFile = "./tmp/server_rsa.pub";
    private RSA rsa;
    
    private String studentName;
    
    public Authentication(){
        this.studentName = "";
        this.rsa = new RSA();
        
    }
    public Authentication(String studentName){
        this.studentName = studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    // Resumen del nombre del estudiante
    public String getStudentNameHash(){
        String studentNameHash = Md5.getMd5(this.studentName);
        return studentNameHash;
    }
    // Resumen del nombre del estudiante encriptado
    public String getStudentNameHashEncrypted(){
        String encryptedNameHash="";
        try {
            encryptedNameHash = this.rsa.encrypt(this.getStudentNameHash());
            System.out.println("Resumen del nombre cifrado: "+encryptedNameHash);
            
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (NoSuchPaddingException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidKeyException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalBlockSizeException ex) {
            System.out.println(ex.getMessage());
        } catch (BadPaddingException ex) {
            System.out.println(ex.getMessage());
        }finally{
             return encryptedNameHash;
         }
    }
    
    
    
    // TODO: Send 
    public void login(){
        
    }
    
        
    private void loadKeys() {
        try {
            
            this.rsa.openFromDiskPrivateKey(this.clientPrivKeyFile);
            this.rsa.openFromDiskPublicKey(this.serverPublKeyFile);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (InvalidKeySpecException ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
