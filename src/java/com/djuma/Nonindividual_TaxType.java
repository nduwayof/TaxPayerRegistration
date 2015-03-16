/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.NonIndividual.*;
import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class Nonindividual_TaxType {
   private int nonIndividualId;
 private int taxTypeId;


    public int getTaxTypeId() {
        return taxTypeId;
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

   
 public void SaveTaxType(){
    try{
        PreparedStatement djuma= SetCon.getCon().prepareStatement("insert into nonIndividual_taxtype values(id,?,?)");
        djuma.setInt(1, nonIndividualId);
        djuma.setInt(2, taxTypeId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    } 
}
