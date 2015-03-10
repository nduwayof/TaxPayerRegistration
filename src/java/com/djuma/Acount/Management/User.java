/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Acount.Management;

import com.djuma.Connection.SetCon;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class User {

    private int id;
    private String firstName = "";
    private String lastName = "";
    private String gender = "";
    private String username = "";
    private String password = "";
    private String confirmPassword = "";
    private String errorPassword;
    private String info;
    private String errorUsername;
    private Timestamp doneAt = new Timestamp(new Date().getTime());
    private String doneBy = "";
    private String role = "";
    private boolean deletedStatus = false;
    private boolean valid = true;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Timestamp getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(Timestamp doneAt) {
        this.doneAt = doneAt;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public boolean isDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public User() {
    }

    public void createUser() {
        try {
            boolean checkUsername = false;
            for (User u : User.listUser()) {
                if (u.getUsername().equalsIgnoreCase(username)) {
                    checkUsername = true;
                }
            }
            if (checkUsername) {
                errorUsername = "Such username already exists. Try Another one";
                valid = false;
            } else {
                if (!password.equalsIgnoreCase(confirmPassword)) {
                    errorPassword = "Password mismatch";
                } else {
                    if (valid) {
                        PreparedStatement st = SetCon.getCon().prepareStatement("insert into user values(id,?,?,?,?,?,?,?,?,?)");
                        st.setString(1, firstName);
                        st.setString(2, lastName);
                        st.setString(3, gender);
                        st.setString(4, username);
                        st.setString(5, md5(password));
                        st.setTimestamp(6, doneAt);
                        st.setString(7, doneBy);
                        st.setBoolean(8, deletedStatus);

                        st.setString(9, role);
                        st.execute();
                        info = "New is Successfull Added";
                    }
                }
            }

        } catch (Exception e) {

        }

    }

    public static List<User> listUser() {
        List<User> list = new ArrayList<User>();
        try {
            PreparedStatement st = SetCon.getCon().prepareStatement("select * from user");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt(1));
                u.setFirstName(rs.getString(2));
                u.setLastName(rs.getString(3));
                u.setGender(rs.getString(4));
                u.setUsername(rs.getString(5));
                u.setPassword(rs.getString(6));
                u.setDeletedStatus(rs.getBoolean(9));
                u.setRole(rs.getString(10));
                list.add(u);
            }
        } catch (Exception e) {

        }
        return list;

    }

    public static String md5(String msg) {
        String encMsg = "";
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        }
        md5.update(msg.getBytes());
        for (int b : md5.digest()) {
            b = b & 0xFF;
            if (b < 16) {
                encMsg += "0";
            }
            encMsg += Integer.toString(b, 16).toUpperCase();
        }
        return encMsg;
    }

}
