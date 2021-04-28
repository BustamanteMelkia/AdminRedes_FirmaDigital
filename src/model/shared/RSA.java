package model.shared;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA {
    private PrivateKey privateKey;
    private PublicKey publicKey;
    
    public RSA(){
    }
    
    public void setPrivateKey(String key) 
        throws  
            NoSuchAlgorithmException, 
            InvalidKeySpecException {
        
        byte[] encodedPrivateKey = stringToBytes(key);
        
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
        
        this.privateKey = privateKey;
    }
    
    public void setPublicKeyString(String key) 
        throws 
            NoSuchAlgorithmException, 
            InvalidKeySpecException {
        
        byte[] encodedPublicKey = stringToBytes(key);
        
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encodedPublicKey);
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
        
        this.publicKey = publicKey;
    }
    
    public String getPrivateKeyString(){
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(this.privateKey.getEncoded());
        return bytesToString(pkcs8EncodedKeySpec.getEncoded());
    }
    
    public String getPublicKeyString(){
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(this.publicKey.getEncoded());
        return bytesToString(x509EncodedKeySpec.getEncoded());
    }
    
    public void genKeyPair(int size) 
        throws 
            NoSuchAlgorithmException,
            NoSuchPaddingException, 
            InvalidKeyException, 
            IllegalBlockSizeException, 
            BadPaddingException  {
        
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(size);
        KeyPair kp = kpg.genKeyPair();
        
        
        this.privateKey = kp.getPrivate();
        this.publicKey = kp.getPublic();
    }
    
    public String encrypt(String plain) {

        byte[] encryptedBytes = null; 
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, this.publicKey);
            encryptedBytes = cipher.doFinal(plain.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (NoSuchPaddingException ex) {
            System.out.println(ex.getMessage());
        }catch (InvalidKeyException ex) {
            System.out.println(ex.getMessage());
        }catch (IllegalBlockSizeException ex) {
            System.out.println(ex.getMessage());
        } catch (BadPaddingException ex) {
            System.out.println(ex.getMessage());
        }

        return bytesToString(encryptedBytes);

    }
    public String decrypt(String result) {

        byte[] decryptedBytes = null;

        Cipher cipher;
        try {
            cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, this.privateKey);
            decryptedBytes = cipher.doFinal(stringToBytes(result));
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (NoSuchPaddingException ex) {
            System.out.println(ex.getMessage());
        }catch (InvalidKeyException ex) {
            System.out.println(ex.getMessage());
        }catch (IllegalBlockSizeException ex) {
            System.out.println(ex.getMessage());
        } catch (BadPaddingException ex) {
            System.out.println(ex.getMessage());
        }finally{
            return new String(decryptedBytes);
        }
    }
    
    public String bytesToString(byte[] b) {
        byte[] b2 = new byte[b.length + 1];
        b2[0] = 1;
        System.arraycopy(b, 0, b2, 1, b.length);
        return new BigInteger(b2).toString(36);
    }
    private byte[] stringToBytes(String str) {
        byte[] b2 = new BigInteger(str, 36).toByteArray();
        return Arrays.copyOfRange(b2, 1, b2.length);
    }
    
    public void saveToDiskPrivateKey(String path) throws IOException {
        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            out.write(this.getPrivateKeyString());
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void saveToDiskPublicKey(String path) {
        try {
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            out.write(this.getPublicKeyString());
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void openFromDiskPublicKey(String path) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String content = this.readFileAsString(path);
        this.setPublicKeyString(content);
    }
    
    public void openFromDiskPrivateKey(String path) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        String content = this.readFileAsString(path);
        this.setPrivateKey(content);
    }
    
    
    private String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader( new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
}
