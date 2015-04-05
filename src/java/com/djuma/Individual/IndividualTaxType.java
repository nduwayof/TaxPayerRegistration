/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class IndividualTaxType {
 private int individualId;
 private int taxTypeId;
 private boolean optionVat;

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public int getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(int taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public IndividualTaxType(int individualId, int taxTypeId) {
        this.individualId = individualId;
        this.taxTypeId = taxTypeId;
    }

   
    

    public boolean isOptionVat() {
        return optionVat;
    }

    public void setOptionVat(boolean optionVat) {
        this.optionVat = optionVat;
    }

    public IndividualTaxType() {
    }
 public void SaveTaxType(){
    try{
        PreparedStatement djuma= SetCon.getCon().prepareStatement("insert into individual_taxtype values(id,?,?,?)");
        djuma.setInt(1, individualId);
        djuma.setInt(2, taxTypeId);
        djuma.setBoolean(3, optionVat);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
  public static List<IndividualTaxType>listTypeOfTaxForIndividual(){
    List<IndividualTaxType>list=new ArrayList<IndividualTaxType>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_taxType");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        IndividualTaxType in=new IndividualTaxType();
        in.setIndividualId(rs.getInt(2));
        in.setTaxTypeId(rs.getInt(3));
        in.setOptionVat(rs.getBoolean(4));
        list.add(in);
        }
    }catch(Exception e){
    e.printStackTrace();
    }
    return list;
    }
  
  public static List<IndividualTaxType>listTypeOfTaxPerIndividual(int individualId){
    List<IndividualTaxType>list=new ArrayList<IndividualTaxType>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_taxType where individualId=?");
    djuma.setInt(1, individualId);
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        IndividualTaxType in=new IndividualTaxType();
        in.setIndividualId(rs.getInt(2));
        in.setTaxTypeId(rs.getInt(3));
        in.setOptionVat(rs.getBoolean(4));
        list.add(in);
        }
    }catch(Exception e){
    e.printStackTrace();
    }
    return list;
    }
    
}
