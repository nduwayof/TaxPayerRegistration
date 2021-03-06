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
public class Individual_trade {
   private Long tradeId;
   private String tradeName;
   private String tradeAddress;
   private String tradeDistrict;
   private String tradeProvince;
   private String commercialRegistrationNo;
   private String startDate;
   private String entreprisePhoneNo;
   private String entrepriseFaxNo;
   private int individualId;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
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

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public Individual_trade(String tradeName, String tradeAddress, String tradeDistrict, String tradeProvince, String commercialRegistrationNo, String startDate, String entreprisePhoneNo, String entrepriseFaxNo, int individualId) {
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

    
    public Individual_trade() {
    }
    
   public void saveTrade(){
   try{
       PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_trade values(id,?,?,?,?,?,?,?,?,?)");
       djuma.setString(1, tradeName);
       djuma.setString(2, tradeAddress);
       djuma.setString(3, tradeDistrict);
       djuma.setString(4, tradeProvince);
       djuma.setString(5, commercialRegistrationNo);
       djuma.setString(6, startDate);
       djuma.setString(7, entreprisePhoneNo);
       djuma.setString(8, entrepriseFaxNo);
       djuma.setInt(9, individualId);
       djuma.execute();
   }catch(Exception e){}
   
   }
   public static List<Individual_trade>listIndividaulTrade(){
   List<Individual_trade>list=new ArrayList<Individual_trade>();
   try{
   PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_trade");
       ResultSet rs=djuma.executeQuery();
       while(rs.next()){
       Individual_trade in=new Individual_trade();
       in.setTradeId(rs.getLong(1));
       in.setTradeName(rs.getString(2));
       in.setTradeAddress(rs.getString(3));
       in.setTradeDistrict(rs.getString(4));
       in.setTradeProvince(rs.getString(5));
       in.setCommercialRegistrationNo(rs.getString(6));
       in.setStartDate(rs.getString(7));
       in.setEntreprisePhoneNo(rs.getString(8));
       in.setEntrepriseFaxNo(rs.getString(9));
       in.setIndividualId(rs.getInt(10));
       list.add(in);
       }
   }catch(Exception e){
   
   }
   return list;
   }
   
}
