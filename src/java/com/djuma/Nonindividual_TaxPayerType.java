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
public class Nonindividual_TaxPayerType {
    private int nonIndividualId;
 private int taxPayerTypeId;


    public int getTaxPayerTypeId() {
        return taxPayerTypeId;
    }

    public void setTaxPayerTypeId(int taxPayerTypeId) {
        this.taxPayerTypeId = taxPayerTypeId;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public Nonindividual_TaxPayerType() {
    }

    public Nonindividual_TaxPayerType(int nonIndividualId, int taxPayerTypeId) {
        this.nonIndividualId = nonIndividualId;
        this.taxPayerTypeId = taxPayerTypeId;
    }

    
    
    public void SaveTaxPayerType(){
    try{
        PreparedStatement djuma= SetCon.getCon().prepareStatement("insert into nonIndividual_taxpayertype values(id,?,?)");
        djuma.setInt(1, nonIndividualId);
        djuma.setInt(2, taxPayerTypeId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
}
