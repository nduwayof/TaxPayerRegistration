/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Connection.SetCon;
import com.djuma.Tax.TaxPayerType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class Individual_TaxPayerType {
    private int id;
    private int individualId;
    private int taxpayerTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public int getTaxpayerTypeId() {
        return taxpayerTypeId;
    }

    public void setTaxpayerTypeId(int taxpayerTypeId) {
        this.taxpayerTypeId = taxpayerTypeId;
    }

    public Individual_TaxPayerType() {
    }
    
    public void SaveTaxType(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_taxpayertype values(id,?,?)");
        djuma.setInt(1, individualId);
        djuma.setInt(2, taxpayerTypeId);
        djuma.execute();
    }catch(Exception e){}
    
    }
    public static List<Individual_TaxPayerType>list(){
    List<Individual_TaxPayerType>l=new ArrayList<Individual_TaxPayerType>();
    
   try{
   PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_taxpayertype");
       ResultSet rs=djuma.executeQuery();
   while(rs.next()){
   Individual_TaxPayerType in=new Individual_TaxPayerType();
   in.setId(rs.getInt(1));
   in.setIndividualId(rs.getInt(2));
   in.setTaxpayerTypeId(rs.getInt(3));
   l.add(in);
   }
   }catch(Exception e){
   
   }
    return l;
    }
    
    public static void SaveTaxPayerType(double estmatedAnnualTurnOver, int individualId){
    int smallId=0;
       int mediumId=0;
       int largeId=0;
       int microId=0;
       for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
       if(t.getTaxpayerType().equalsIgnoreCase("small")||t.getTaxpayerType().contains("small")){
       smallId=t.getId();
       }else if(t.getTaxpayerType().equalsIgnoreCase("medium")||t.getTaxpayerType().contains("medium")){
       mediumId=t.getId();
       }else if(t.getTaxpayerType().equalsIgnoreCase("large")||t.getTaxpayerType().contains("large")){
       largeId=t.getId();
       }else if(t.getTaxpayerType().equalsIgnoreCase("micro")||t.getTaxpayerType().contains("micro")){
       microId=t.getId();
       }
       }
               Individual_TaxPayerType ix=new Individual_TaxPayerType();
               ix.setIndividualId(individualId);
        if(estmatedAnnualTurnOver>=2000000&& estmatedAnnualTurnOver<=12000000){
            ix.setTaxpayerTypeId(microId);
        ix.SaveTaxType();
        }else if(estmatedAnnualTurnOver>=12000001&& estmatedAnnualTurnOver<=50000000){
        ix.setTaxpayerTypeId(smallId);
        ix.SaveTaxType();
        }else if(estmatedAnnualTurnOver>=50000001&&estmatedAnnualTurnOver<= 400000000){
        ix.setTaxpayerTypeId(mediumId);
        ix.SaveTaxType();
        }else if(estmatedAnnualTurnOver>=400000001){
        ix.setTaxpayerTypeId(largeId);
        ix.SaveTaxType();
        }
    }
}
