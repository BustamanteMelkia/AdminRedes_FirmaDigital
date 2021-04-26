package model.server;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import model.shared.Md5;
import model.shared.RSA;

public class RequestManager {
    
    private final String clientPublKeyFile = "./tmp/client_rsa.pub";
    private final String serverPrivKeyFile = "./tmp/server_rsa.pri";
    private RSA rsa;
    
    public RequestManager(){
        this.rsa = new RSA();
        this.loadKeys();
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
     * Autenticar a un estudiante
     * @param encryptedNameHash: Resumen del nombre encriptado
     * @param encryptedName: Nombre encriptado
     */
    public void authenticateStudent(String encryptedNameHash, String encryptedName){
        try {
            String decryptedNameHash = this.rsa.decrypt(encryptedNameHash);
            String name = this.rsa.decrypt(encryptedName);
            String nameHash = Md5.getMd5(name);
            
            System.out.println("Resumen del nombre descifrado: "+decryptedNameHash);
            System.out.println("Resumen del nombre: "+nameHash);
            
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
        }
    }
}
