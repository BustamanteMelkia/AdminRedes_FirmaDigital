package model.client;

import model.shared.Md5;

public class Authentication {
    private String username;
    private String hashedUsername;
    
    private Authentication(String username){
        this.username = username;
    }
    public String getHashedUsername(){
        this.hashedUsername = Md5.getMd5(username);
        return this.hashedUsername;
    }
    
    public void login(){
        
    }
}
