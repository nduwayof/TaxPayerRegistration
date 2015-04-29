/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Acount.Management;

import com.djuma.Connection.SetCon;
import com.djuma.Individual.Individual;
import com.djuma.NonIndividual;
import com.djuma.NonIndividual_Activity;
import com.djuma.NonIndividual_Address;
import com.djuma.Nonindividual_TaxPayerType;

import com.djuma.Sector.Industry;
import com.djuma.Sector.Sector;
import com.djuma.Sector.Sub_Sector;
import com.djuma.Tax.TaxPayerType;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        
        
          
     
      
       try{
        SimpleDateFormat j=new SimpleDateFormat("yyyy-MM-dd");
        Date dat1=j.parse("2015-04-18");
        Date dat2=j.parse("2015-04-18");
       for(Individual in: Individual.listIndividual()){
           Date d1=j.parse(in.getDoneAt().toString());
       if(d1.getTime()>=dat1.getTime()&&d1.getTime()<=dat2.getTime()){
       System.out.println(in.getIndividualId());
       }
       }
       }catch(Exception e){}
       
       NonIndividual_Address n=new NonIndividual_Address();
       n.setPlotNo("112R");
       n.setDistrict("Kacyiru");
       n.setProvince("Kigali");
       n.setNonIndividualId(15);
       //n.saveAddress();
         // Nonindividual_TaxPayerType.SaveNonIndividualTaxPayerType(30000000, 22);
          Nonindividual_TaxPayerType ni=new Nonindividual_TaxPayerType();
          ni.setNonIndividualId(26);
         // ni.SaveTaxPayerType(50000000);
    }
    
       
    
    
}
