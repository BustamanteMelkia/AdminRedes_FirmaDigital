/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.MainWindow;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        Controller controller = new Controller(mainWindow);
        mainWindow.setVisible(true);
        
        controller.getNameHash();
        controller.encryptNameHash();
        controller.encryptName();;
        controller.sendData();
        controller.decryptName();
        controller.decryptHashName();
        controller.renderHashs();
        controller.checkMessage();
        controller.encryptGrade();
        controller.sendGrade();
        controller.decryptGrade();
    }
}
