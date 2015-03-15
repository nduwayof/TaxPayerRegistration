/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Acount.Management;

import com.djuma.Individual.Individual;
import com.djuma.Sector.Industry;
import com.djuma.Sector.Sector;
import com.djuma.Sector.Sub_Sector;
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
        
        Industry i=new Industry();
        i.setName("Agriculture");
        //i.saveIndustry();
        Sector s=new Sector();
        s.setName("Forestry");
        s.setIndustryId(1);
        //s.saveSector();
        Sub_Sector su=new Sub_Sector();
        su.setName("");
        su.setSectorId(1);
        //su.saveSubSector();
        for(Industry in:Industry.listIndistry()){
        System.out.println(in.getName());
        }
     
    }
}
