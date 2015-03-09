/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Acount.Management;

/**
 *
 * @author SULAIMAN
 */
public class Login {
    private String username;
    private String password;
    private String errorUsername;
    private String errorPassword;
    private boolean valid=true;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorUsername() {
        return errorUsername;
    }

    public void setErrorUsername(String errorUsername) {
        this.errorUsername = errorUsername;
    }

    public String getErrorPassword() {
        return errorPassword;
    }

    public void setErrorPassword(String errorPassword) {
        this.errorPassword = errorPassword;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Login() {
    }
    
    public String getLoggedIn(){
    String msg="";
    try{
    
    }catch(Exception e){
    
    }
    
    return msg;
    }
    
}
