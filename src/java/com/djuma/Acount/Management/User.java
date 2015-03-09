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
public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private String username;
    private String password;
    private String confirmPassword;
    private String errorPassword;
    private String info;
    private String errorUsername;
    private boolean valid=true;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getErrorPassword() {
        return errorPassword;
    }

    public void setErrorPassword(String errorPassword) {
        this.errorPassword = errorPassword;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getErrorUsername() {
        return errorUsername;
    }

    public void setErrorUsername(String errorUsername) {
        this.errorUsername = errorUsername;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public User() {
    }
    
}
