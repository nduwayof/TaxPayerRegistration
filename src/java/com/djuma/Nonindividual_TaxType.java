/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.NonIndividual.*;
import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class Nonindividual_TaxType {
   private int nonIndividualId;
 private int taxTypeId;
 private long id;


    public int getTaxTypeId() {
        return taxTypeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTaxTypeId(int taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public Nonindividual_TaxType(int nonIndividualId, int taxTypeId) {
        this.nonIndividualId = nonIndividualId;
        this.taxTypeId = taxTypeId;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public Nonindividual_TaxType() {
    }

   
 public void SaveTaxType(){
    try{
        PreparedStatement djuma= SetCon.getCon().prepareStatement("insert into nonIndividual_taxtype values(id,?,?)");
        djuma.setInt(1, nonIndividualId);
        djuma.setInt(2, taxTypeId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
 public static List<Nonindividual_TaxType>list(){
 List<Nonindividual_TaxType>l=new ArrayList<Nonindividual_TaxType>();
 try{
 PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_taxtype");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        Nonindividual_TaxType n=new Nonindividual_TaxType();
        n.setId(rs.getLong(1));
        n.setNonIndividualId(rs.getInt(2));
        n.setTaxTypeId(rs.getInt(3));
        l.add(n);
        }
 }catch(Exception e){
 
 }
 return l;
 }
}
