package controller;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import model.shared.RSA;
public class TestController {
    public static void main(String[] args) 
        throws 
        NoSuchAlgorithmException,
        NoSuchPaddingException, 
        InvalidKeyException, 
        IllegalBlockSizeException, 
        BadPaddingException,
        IOException,
        InvalidKeySpecException,
        NoSuchProviderException {
        
        String clientPrivKeyFile = "./tmp/client_rsa.pri";
        String clientPublKeyFile = "./tmp/client_rsa.pub";
        String serverPrivKeyFile = "./tmp/server_rsa.pri";
        String serverPublKeyFile = "./tmp/server_rsa.pub";
        RSA rsa = new RSA();
        rsa.openFromDiskPrivateKey(clientPrivKeyFile);
        rsa.openFromDiskPublicKey(clientPublKeyFile);


        String message = "MElkiaaaa";
        
        String msgEncriptado = rsa.encrypt(message);
        System.out.println("Mensaje encritado: "+msgEncriptado);

        String msgDescifrado = rsa.decrypt(msgEncriptado);
        System.out.println("Mensaje descifrado: "+msgDescifrado);
    }
}
