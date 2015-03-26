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
public class IndividualTaxPayerType {

    private int individualId;
    private int taxPayerTypeId;

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public int getTaxPayerTypeId() {
        return taxPayerTypeId;
    }

    public void setTaxPayerTypeId(int taxPayerTypeId) {
        this.taxPayerTypeId = taxPayerTypeId;
    }

    public IndividualTaxPayerType(int individualId, int taxPayerTypeId) {
        this.individualId = individualId;
        this.taxPayerTypeId = taxPayerTypeId;
    }

    public IndividualTaxPayerType() {
    }

    public void SaveTaxPayerType() {
        try {
            PreparedStatement djuma = SetCon.getCon().prepareStatement("insert into individual_taxpayertype values(id,?,?)");
            djuma.setInt(1, individualId);
            djuma.setInt(2, taxPayerTypeId);
            djuma.execute();
        } catch (Exception e) {

        }

    }

}
