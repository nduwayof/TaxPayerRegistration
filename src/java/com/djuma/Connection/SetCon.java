/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SULAIMAN
 */
public class SetCon {
    private static final String db="jdbc:mysql://localhost/rebero";
    private static final String user="root";
    private static final String password="flyman";
    
    public static Connection getCon(){
    Connection djuma=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    djuma=DriverManager.getConnection(db,user,password);
    }catch(Exception e){
    e.printStackTrace();
    }
    return  djuma;
    }
}
