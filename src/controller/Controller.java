package controller;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import model.client.Authentication;
import model.server.RequestManager;
import view.MainWindow;


public class Controller {
    private Authentication auth;
    private RequestManager reqManager;
    private MainWindow mainWindow;
    
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

    // Obtener el resumen del nombre encriptado o Firma
    public void encryptNameHash(){
        String encryptedNameHash = this.auth.getEncryptedNameHash();
        System.out.println("Firma: "+encryptedNameHash+"\n");
    }

    // Obtener el nombre encriptado
    public void encryptName(){
        String encryptedName = this.auth.getEncryptedName();
        System.out.println("Nombre encriptado: "+encryptedName +"\n");
        // TODO: 
        // Actualizar el campo de nombre encriptado en la vista.
    }
    
    // Mandar el nombre encriptado y el resumen encriptado
    public void sendData(){
        String encryptedNameHash = this.auth.getEncryptedNameHash();
        String encryptedName = this.auth.getEncryptedName();
        this.reqManager.handleRequest(encryptedNameHash, encryptedName);
    }

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
    public void decryptName(){
        String decryptedName = this.reqManager.decryptName();
        System.out.println("Nombre desencriptado: "+decryptedName+"\n");
    }


    public void decryptHashName(){
        String decryptedHashName = this.reqManager.decryptHashName();
        System.out.println("Firma desencriptada: "+decryptedHashName+"\n");
    }
    

    public void renderHashs(){
        String decryptedHashName = this.reqManager.decryptHashName();
        String hashName = this.reqManager.getHashName();
        System.out.println("\nResumen de Nombre: "+hashName);
        System.out.println("Firma desencriptada: "+decryptedHashName+"\n");
    }
    public void checkMessage(){
        String response = this.reqManager.checkMessage();
        response = this.auth.rsa.decrypt(response);
        if(response.equals("MENSAJE CORRECTO")){
            this.fetchGrade();
        }else{
            // El menjaje sufrió algún cambio
            System.out.println(response+"\n");
        }
        
    }

    public void fetchGrade(){
        String response = this.reqManager.getEncryptedGrade();
        response = this.auth.rsa.decrypt(response);
        if(response.equals("ESTUDIANTE NO REGISTRADO")){
            System.out.println(response);
        }else{
            System.out.println("Calificacion: "+response+"\n");
        }   
    }

    public void encryptGrade(){
        String encryptedGrade = this.reqManager.getEncryptedGrade();
        System.out.println("Calificación encriptada: "+encryptedGrade+"\n");
    }

    public void sendGrade(){
        String encryptedGrade = this.reqManager.getEncryptedGrade();
        System.out.println("Calificación encriptada Recibida: "+encryptedGrade+"\n");
    }

    public void decryptGrade(){
        String encryptedGrade = this.reqManager.getEncryptedGrade();
        String grade = this.auth.rsa.decrypt(encryptedGrade);
        System.out.println("Calificación desencriptada: "+grade+"\n");
    }
    // SERVIDOR

}

