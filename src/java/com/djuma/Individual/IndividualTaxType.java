/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class IndividualTaxType {
 private int individualId;
 private int taxTypeId;

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

    public IndividualTaxType() {
    }
 public void SaveTaxType(){
    try{
        PreparedStatement djuma= SetCon.getCon().prepareStatement("insert into individual_taxtype values(id,?,?)");
        djuma.setInt(1, individualId);
        djuma.setInt(2, taxTypeId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
}
