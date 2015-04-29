/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

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
public class Nonindividual_TaxPayerType {

    private int id;
    private int nonIndividualId;
    private int taxpayerTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public int getTaxpayerTypeId() {
        return taxpayerTypeId;
    }

    public void setTaxpayerTypeId(int taxpayerTypeId) {
        this.taxpayerTypeId = taxpayerTypeId;
    }

    public Nonindividual_TaxPayerType() {
    }

    public void SaveTaxPayerType(double estmatedAnnualTurnOver ) {
        try {
             int smallId = 0;
        int mediumId = 0;
        int largeId = 0;
        int microId = 0;
        for (TaxPayerType t : TaxPayerType.listTaxPayerType()) {
            if (t.getTaxpayerType().equalsIgnoreCase("small") || t.getTaxpayerType().contains("small")) {
                smallId = t.getId();
            } else if (t.getTaxpayerType().equalsIgnoreCase("medium") || t.getTaxpayerType().contains("medium")) {
                mediumId = t.getId();
            } else if (t.getTaxpayerType().equalsIgnoreCase("large") || t.getTaxpayerType().contains("large")) {
                largeId = t.getId();
            } else if (t.getTaxpayerType().equalsIgnoreCase("micro") || t.getTaxpayerType().contains("micro")) {
                microId = t.getId();
            }
        }
        
         if (estmatedAnnualTurnOver >= 2000000 && estmatedAnnualTurnOver <= 12000000) {
            taxpayerTypeId=microId;
        } else if (estmatedAnnualTurnOver >= 12000001 && estmatedAnnualTurnOver <= 50000000) {
            taxpayerTypeId=smallId;
        } else if (estmatedAnnualTurnOver >= 50000001 && estmatedAnnualTurnOver <= 400000000) {
            taxpayerTypeId=mediumId;
        } else if (estmatedAnnualTurnOver >= 400000001) {
           taxpayerTypeId=largeId;
        }
         
         
        
            
            PreparedStatement djuma = SetCon.getCon().prepareStatement("insert into nonIndividual_taxpayertype values(id,?,?)");
            djuma.setInt(1, nonIndividualId);
            djuma.setInt(2, taxpayerTypeId);
            djuma.execute();
        } catch (Exception e) {
        }
    }

    public static List<Nonindividual_TaxPayerType> list() {
        List<Nonindividual_TaxPayerType> l = new ArrayList<Nonindividual_TaxPayerType>();
        try {
            PreparedStatement djuma = SetCon.getCon().prepareStatement("select * from nonIndividual_taxpayertype ");
            ResultSet rs = djuma.executeQuery();

            while (rs.next()) {
                Nonindividual_TaxPayerType n = new Nonindividual_TaxPayerType();
                n.setId(rs.getInt(1));
                n.setNonIndividualId(rs.getInt(2));
                n.setTaxpayerTypeId(rs.getInt(3));
                l.add(n);
            }
        } catch (Exception e) {
        }
        return l;
    }

//    public static void SaveNonIndividualTaxPayerType(double estmatedAnnualTurnOver, int nonIndividualId) {
//        int smallId = 0;
//        int mediumId = 0;
//        int largeId = 0;
//        int microId = 0;
//        for (TaxPayerType t : TaxPayerType.listTaxPayerType()) {
//            if (t.getTaxpayerType().equalsIgnoreCase("samll") || t.getTaxpayerType().contains("small")) {
//                smallId = t.getId();
//            } else if (t.getTaxpayerType().equalsIgnoreCase("medium") || t.getTaxpayerType().contains("medium")) {
//                mediumId = t.getId();
//            } else if (t.getTaxpayerType().equalsIgnoreCase("large") || t.getTaxpayerType().contains("large")) {
//                largeId = t.getId();
//            } else if (t.getTaxpayerType().equalsIgnoreCase("micro") || t.getTaxpayerType().contains("micro")) {
//                microId = t.getId();
//            }
//        }
//        Nonindividual_TaxPayerType i = new Nonindividual_TaxPayerType();
//        i.setNonIndividualId(nonIndividualId);
//        if (estmatedAnnualTurnOver >= 2000000 && estmatedAnnualTurnOver < 12000000) {
//            i.setTaxpayerTypeId(microId);
//            i.SaveTaxPayerType();
//        } else if (estmatedAnnualTurnOver >= 12000001 && estmatedAnnualTurnOver <= 50000000) {
//            i.setTaxpayerTypeId(smallId);
//            i.SaveTaxPayerType();
//        } else if (estmatedAnnualTurnOver >= 50000001 && estmatedAnnualTurnOver <= 400000000) {
//            i.setTaxpayerTypeId(mediumId);
//            i.SaveTaxPayerType();
//        } else if (estmatedAnnualTurnOver >= 400000001) {
//            i.setTaxpayerTypeId(largeId);
//            i.SaveTaxPayerType();
//        }
//    }

}
