package controller;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import model.client.Authentication;
import model.server.RequestManager;
import view.MainWindow;


public class Controller {
    private Authentication auth;
    private RequestManager reqManager;
    private MainWindow mainWindow;
    
    public Controller(){
        this.auth = new Authentication();
        this.reqManager = new RequestManager(this);
    }
    
    public Controller(MainWindow mainWindow){
        this.auth = new Authentication();
        this.reqManager = new RequestManager(this);
        this.mainWindow = mainWindow;
    }
    
    // Obtener el resumen del nombre
    public void getNameHash(){
        // TODO: 
        
        // Obtener el nombre del estudiante de la vista y asignarlo al atributo studentName de la clase Authentication:
        this.auth.setStudentName("Jean Paul Ayala Lozano");
        System.out.println("\nNombre: "+this.auth.getStudentName()+"\n");
        // Calcular el resumen del nombre:
        String nameHash = this.auth.getNameHash();
        System.out.println("Resumen (MD5) "+nameHash+"\n");
        
        
        // Actualizar el campo de resumen del nombre con el valor obtenido en el paso anterior:
        // View.nameHashField.setText(nameHash);
    }
/*********************************************************/
    // Obtener el resumen del nombre para la vista
    public String agetNameHash(String name){
        // TODO: 
        
        // Obtener el nombre del estudiante de la vista y asignarlo al atributo studentName de la clase Authentication:
        this.auth.setStudentName(name);
        System.out.println("\nNombre: "+this.auth.getStudentName()+"\n");
        // Calcular el resumen del nombre:
        String nameHash = this.auth.getNameHash();
        System.out.println("Resumen (MD5) "+nameHash+"\n");
        return nameHash;
        // Actualizar el campo de resumen del nombre con el valor obtenido en el paso anterior:
        // View.nameHashField.setText(nameHash);
    }
/*********************************************************/    
    // Obtener el resumen del nombre encriptado o Firma
    public String encryptNameHash(){
        String encryptedNameHash = this.auth.getEncryptedNameHash();
        System.out.println("Firma: "+encryptedNameHash+"\n");
        return encryptedNameHash;
    }
/*********************************************************/    
    // Obtener el resumen del nombre encriptado o Firma
    public String aencryptNameHash(String text){
        String encryptedNameHash = this.auth.agetEncryptedNameHash(text);
        System.out.println("Firma: "+encryptedNameHash+"\n");
        return encryptedNameHash;
    }
/*********************************************************/    
    // Obtener el nombre encriptado
    public String encryptName(){
        String encryptedName = this.auth.getEncryptedName();
        System.out.println("Nombre encriptado: "+encryptedName +"\n");
        // TODO: 
        return encryptedName;
        // Actualizar el campo de nombre encriptado en la vista.
    }
/*********************************************************/    
    // Obtener el nombre encriptado
    public String aencryptName(String text){
        String encryptedName = this.auth.agetEncryptedName(text);
        System.out.println("Nombre encriptado: "+encryptedName +"\n");
        // TODO: 
        // Actualizar el campo de nombre encriptado en la vista.
        return encryptedName;
    }
    // Mandar el nombre encriptado y el resumen encriptado
    public void sendData(){
        String encryptedNameHash = this.auth.getEncryptedNameHash();
        String encryptedName = this.auth.getEncryptedName();
        this.reqManager.handleRequest(encryptedNameHash, encryptedName);
    }
/******************************************************************************/
    public void asendData(String temp,String temp1){
        /*NOMBRE*/
        String encryptedNameHash = this.auth.agetEncryptedNameHash(temp);
        String encryptedName = this.auth.getEncryptedName();
        this.reqManager.handleRequest(encryptedNameHash, encryptedName);
    }
/******************************************************************************/
    /**
     * Renderizar el nombre encriptado recibido.
     * @param encryptedName
     */
    public void renderReceivedName(String encryptedName){
        System.out.println("Nombre recibido: "+ encryptedName+"\n");
    }

    /**
     * Renderizar el resumen del nombre encriptado recibido.
     */
    public void renderReceivedEncryptedHash(String encryptedNameHash){
        System.out.println("Firma recibida: "+ encryptedNameHash+"\n");
    }

    // Desencriptar el nombre encriptado recibido
    public String decryptName(){
        String decryptedName = this.reqManager.decryptName();
        System.out.println("Nombre desencriptado: "+decryptedName+"\n");
        return decryptedName;
    }


    public String decryptHashName(){
        String decryptedHashName = this.reqManager.decryptHashName();
        System.out.println("Firma desencriptada: "+decryptedHashName+"\n");
        return decryptedHashName;
    }
    

    public void renderHashs(){
        String decryptedHashName = this.reqManager.decryptHashName();
        String hashName = this.reqManager.getHashName();
        System.out.println("\nResumen de Nombre: "+hashName);
        System.out.println("Firma desencriptada: "+decryptedHashName+"\n");
    }
    
    public String renderHashs1(){
        String decryptedHashName = this.reqManager.decryptHashName();
        System.out.println("Firma desencriptada: "+decryptedHashName+"\n");
        return decryptedHashName;
    }
    public String renderHash2(){
        String hashName = this.reqManager.getHashName();
        System.out.println("\nResumen de Nombre: "+hashName);
        return hashName;
    }
    public String checkMessage(){
        String response = this.reqManager.checkMessage();
        response = this.auth.rsa.decrypt(response);
        if(response.equals("MENSAJE CORRECTO")){
            return this.fetchGrade();
        }else{
            // El menjaje sufrió algún cambio
            System.out.println(response+"\n");
            JOptionPane.showMessageDialog(null, "Mensaje manipulado");

        }
        return response;
    }

    public String fetchGrade(){
        String response = this.reqManager.getEncryptedGrade();
        response = this.auth.rsa.decrypt(response);
        if(response.equals("ESTUDIANTE NO REGISTRADO")){
            System.out.println(response);
            JOptionPane.showMessageDialog(null, "Estudiante no registrado");

        }else{
            System.out.println("Calificacion: "+response+"\n");
            return response;
        }   
        return null;
    }

    public String encryptGrade(){
        String encryptedGrade = this.reqManager.getEncryptedGrade();
        System.out.println("Calificación encriptada: "+encryptedGrade+"\n");
        return encryptedGrade;
    }

    public String sendGrade(){
        String encryptedGrade = this.reqManager.getEncryptedGrade();
        System.out.println("Calificación encriptada Recibida: "+encryptedGrade+"\n");
        return encryptedGrade;
    }

    public String decryptGrade(){
        String encryptedGrade = this.reqManager.getEncryptedGrade();
        String grade = this.auth.rsa.decrypt(encryptedGrade);
        System.out.println("Calificación desencriptada: "+grade+"\n");
        return grade;
    }
    // SERVIDOR

}

