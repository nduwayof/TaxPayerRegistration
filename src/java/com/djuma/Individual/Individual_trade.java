/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

/**
 *
 * @author SULAIMAN
 */
public class Individual_trade {
   private int tradeId;
   private String tradeName;
   private String tradeAddress;
   private String tradeDistrict;
   private String tradeProvince;
   private String commercialRegistrationNo;
   private String startDate;
   private String entreprisePhoneNo;
   private String entrepriseFaxNo;
   private String individualId;

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeAddress() {
        return tradeAddress;
    }

    public void setTradeAddress(String tradeAddress) {
        this.tradeAddress = tradeAddress;
    }

    public String getTradeDistrict() {
        return tradeDistrict;
    }

    public void setTradeDistrict(String tradeDistrict) {
        this.tradeDistrict = tradeDistrict;
    }

    public String getTradeProvince() {
        return tradeProvince;
    }

    public void setTradeProvince(String tradeProvince) {
        this.tradeProvince = tradeProvince;
    }

    public String getCommercialRegistrationNo() {
        return commercialRegistrationNo;
    }

    public void setCommercialRegistrationNo(String commercialRegistrationNo) {
        this.commercialRegistrationNo = commercialRegistrationNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEntreprisePhoneNo() {
        return entreprisePhoneNo;
    }

    public void setEntreprisePhoneNo(String entreprisePhoneNo) {
        this.entreprisePhoneNo = entreprisePhoneNo;
    }

    public String getEntrepriseFaxNo() {
        return entrepriseFaxNo;
    }

    public void setEntrepriseFaxNo(String entrepriseFaxNo) {
        this.entrepriseFaxNo = entrepriseFaxNo;
    }

    public String getIndividualId() {
        return individualId;
    }

    public void setIndividualId(String individualId) {
        this.individualId = individualId;
    }

    public Individual_trade(String tradeName, String tradeAddress, String tradeDistrict, String tradeProvince, String commercialRegistrationNo, String startDate, String entreprisePhoneNo, String entrepriseFaxNo, String individualId) {
        this.tradeName = tradeName;
        this.tradeAddress = tradeAddress;
        this.tradeDistrict = tradeDistrict;
        this.tradeProvince = tradeProvince;
        this.commercialRegistrationNo = commercialRegistrationNo;
        this.startDate = startDate;
        this.entreprisePhoneNo = entreprisePhoneNo;
        this.entrepriseFaxNo = entrepriseFaxNo;
        this.individualId = individualId;
    }
   
   
}
