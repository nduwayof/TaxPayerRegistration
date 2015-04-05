/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Acount.Management;

import com.djuma.Connection.SetCon;
import com.djuma.Individual.Individual;
import com.djuma.Individual.IndividualTaxPayerType;

import com.djuma.Sector.Industry;
import com.djuma.Sector.Sector;
import com.djuma.Sector.Sub_Sector;
import com.djuma.Tax.TaxPayerType;
import java.sql.PreparedStatement;
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
        TaxPayerType t=new TaxPayerType();
        t.setTaxpayerType("Micro");
        //t.save();
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
       // for(Industry in:Industry.listIndistry()){
        //System.out.println(in.getName());
        //}
       // for(Individual in: Individual.listIndividual()){
         //   if(in.getIndividualId()==29){
        //System.out.println(in.getPhoto());
          //  }
        //}
        
//        for(int j=1; j<=4;j++){
//            try{
//            PreparedStatement djuma=SetCon.getCon().prepareStatement("update taxtype set description=? where id=?");
//            djuma.setString(1, "");
//            djuma.setInt(2, j);
//            djuma.execute();
//            }catch(Exception e){
//            
//            }
//        }
        
        
           for(TaxPayerType t1: TaxPayerType.listTaxPayerType()){
                   if(t1.getId()==2){ 
                    for(IndividualTaxPayerType it: IndividualTaxPayerType.listsizeOfTaxForIndividual()){
                    if(it.getTaxPayerTypeId()==t1.getId()){
                for(Individual in: Individual.listIndividual()) {
                   if(in.getIndividualId()==it.getIndividualId()&&in.isHasInfo()&&in.isDeRegistered()==false){
                     System.out.println(in.getTinNumber());
                   }
                }
           }
                   }
                   }
     
    }
           
           
    }
    
}
