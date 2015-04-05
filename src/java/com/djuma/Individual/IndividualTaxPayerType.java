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

    public static List<IndividualTaxPayerType> listsizeOfTaxForIndividual() {
        List<IndividualTaxPayerType> list = new ArrayList<IndividualTaxPayerType>();
        try {
            PreparedStatement djuma = SetCon.getCon().prepareStatement("select * from individual_taxPayerType");
            ResultSet rs = djuma.executeQuery();
            while (rs.next()) {
                IndividualTaxPayerType in = new IndividualTaxPayerType();
                in.setIndividualId(rs.getInt(2));
                in.setTaxPayerTypeId(rs.getInt(3));
                list.add(in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<IndividualTaxPayerType> listsizeOfTaxPerIndividual(int individualId) {
        List<IndividualTaxPayerType> list = new ArrayList<>();
        try {
            PreparedStatement djuma = SetCon.getCon().prepareStatement("select * from individual_taxPayerType where individualId=?");
            djuma.setInt(1, individualId);
            ResultSet rs = djuma.executeQuery();
            while (rs.next()) {
                IndividualTaxPayerType in = new IndividualTaxPayerType();
                in.setIndividualId(rs.getInt(2));
                in.setTaxPayerTypeId(rs.getInt(3));
                list.add(in);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
