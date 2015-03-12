/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Acount.Management;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SULAIMAN
 */
public class test {
    public static void main(String...args){
//        try{
//    Scanner p=new Scanner(System.in);
//String username="";
//String password="";
//String role="";
//    System.out.println("Enter username");
//    username=p.nextLine();
//    System.out.println("Enter the password");
//    password=p.nextLine();
//    System.out.println("Enter the role");
//   role= p.nextLine();
//    User u=new User();
//    u.setUsername(username);
//    u.setPassword(password);
//    u.setConfirmPassword(password);
//    u.setRole(role);
//    u.setDoneBy("djuma");
//    u.createUser();
//    System.out.println("Success");
//        }catch(Exception e){
//        System.out.println(e.getMessage());
//        }
        
        double a=100.9456;
        DecimalFormat j=new DecimalFormat("##");
        System.out.println(j.format(a));
    }
}
