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
    private String error;
    private boolean valid = true;

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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Login() {
    }

    public String getLoggedIn() {
        String msg = "";
        try {

            boolean checkUsername = false;
            boolean checkPassword = false;
            String role = "";
            int id = 0;
            for (User u : User.listUser()) {
                if (u.getUsername().equalsIgnoreCase(username)) {
                    checkUsername = true;
                }
            }
            if (checkUsername) {
                for (User u : User.listUser()) {
                    if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equalsIgnoreCase(User.md5(password))) {
                        checkPassword = true;
                        role = u.getRole();
                        id = u.getId();
                    }
                }
                if (checkPassword) {
                    msg = "Success#" + role + "#" + id;
                } else {
                    error = "Username or Password is incorrect";
                    msg = error;
                    valid = false;
                }
            } else {
                error = "Username or Password is incorrect";
                msg = error;
                valid = false;
            }
        } catch (Exception e) {
            error = e.getMessage();
            valid = false;
        }
        return msg;
    }

}
