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
public class NonIndividual_Address {
 private long addressId;
 private String plotNo;
 private String street;
 private String sector;
 private String district;
 private String province;
 private String mailingAddress;
 private String mailHouseNo;
 private String mailStreet;
 private String mailPoBox;
 private String mailCity;
 private String mailSector;
 private String mailDistrict;
 private String mailProvince;
 private int nonIndividualId;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    
    

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailHouseNo() {
        return mailHouseNo;
    }

    public void setMailHouseNo(String mailHouseNo) {
        this.mailHouseNo = mailHouseNo;
    }

    public String getMailStreet() {
        return mailStreet;
    }

    public void setMailStreet(String mailStreet) {
        this.mailStreet = mailStreet;
    }

    public String getMailPoBox() {
        return mailPoBox;
    }

    public void setMailPoBox(String mailPoBox) {
        this.mailPoBox = mailPoBox;
    }

    public String getMailCity() {
        return mailCity;
    }

    public void setMailCity(String mailCity) {
        this.mailCity = mailCity;
    }

    public String getMailSector() {
        return mailSector;
    }

    public void setMailSector(String mailSector) {
        this.mailSector = mailSector;
    }

    public String getMailDistrict() {
        return mailDistrict;
    }

    public void setMailDistrict(String mailDistrict) {
        this.mailDistrict = mailDistrict;
    }

    public String getMailProvince() {
        return mailProvince;
    }

    public void setMailProvince(String mailProvince) {
        this.mailProvince = mailProvince;
    }

    public int getIndividualId() {
        return nonIndividualId;
    }

    public void setIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Address(String plotNo, String street, String sector, String district, String province, String mailingAddress, String mailHouseNo, String mailStreet, String mailPoBox, String mailCity, String mailSector, String mailDistrict, String mailProvince, int nonIndividualId) {
        this.plotNo = plotNo;
        this.street = street;
        this.sector = sector;
        this.district = district;
        this.province = province;
        this.mailingAddress = mailingAddress;
        this.mailHouseNo = mailHouseNo;
        this.mailStreet = mailStreet;
        this.mailPoBox = mailPoBox;
        this.mailCity = mailCity;
        this.mailSector = mailSector;
        this.mailDistrict = mailDistrict;
        this.mailProvince = mailProvince;
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Address() {
    }

    
 public void saveAddress(){
 try{
     PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_address values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
     djuma.setString(1, plotNo);
     djuma.setString(2, street);
     djuma.setString(3, sector);
     djuma.setString(4, district);
     djuma.setString(5, province);
     djuma.setString(6, mailingAddress);
     djuma.setString(7, mailHouseNo);
     djuma.setString(8, mailStreet);
     djuma.setString(9, mailPoBox);
     djuma.setString(10, mailCity);
     djuma.setString(11, mailSector);
     djuma.setString(12, mailDistrict);
     djuma.setString(13, mailProvince);
     djuma.setInt(14, nonIndividualId);
     djuma.execute();
 }catch(Exception e){
 
 } 

 }
 
 public static List<NonIndividual_Address>list(){
 List<NonIndividual_Address>l=new ArrayList<NonIndividual_Address>();
 
 try{
 PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_address");
     ResultSet rs=djuma.executeQuery();
     while(rs.next()){
     NonIndividual_Address n=new NonIndividual_Address();
     n.setAddressId(rs.getLong(1));
     n.setPlotNo(rs.getString(2));
     n.setStreet(rs.getString(3));
     n.setSector(rs.getString(4));
     n.setDistrict(rs.getString(5));
     n.setProvince(rs.getString(6));
     n.setMailingAddress(rs.getString(7));
     n.setMailHouseNo(rs.getString(8));
     n.setMailStreet(rs.getString(9));
     n.setMailPoBox(rs.getString(10));
     n.setMailCity(rs.getString(11));
     n.setMailSector(rs.getString(12));
     n.setMailDistrict(rs.getString(13));
     n.setMailProvince(rs.getString(14));
     n.setNonIndividualId(rs.getInt(15));
     l.add(n);
     }
 }catch(Exception e){}
 return l;
 
 }
}
