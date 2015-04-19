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
public class Individual_Address {
 private Long addressId;
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
 private int individualId;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
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
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }
    

    public Individual_Address(String plotNo, String street, String sector, String district, String province, String mailingAddress, String mailHouseNo, String mailStreet, String mailPoBox, String mailCity, String mailSector, String mailDistrict, String mailProvince, int individualId) {
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
        this.individualId = individualId;
    }

    public Individual_Address() {
    }
 public void saveAddress(){
 try{
     PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_address values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
     djuma.setInt(14, individualId);
     djuma.execute();
 }catch(Exception e){}
 
 }
 
 public static List<Individual_Address>listOfIndividualAddress(){
 List<Individual_Address>list=new ArrayList<Individual_Address>();
 try{
 PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_address");
     ResultSet rs=djuma.executeQuery();
     while(rs.next()){
     Individual_Address in=new Individual_Address();
     in.setAddressId(rs.getLong(1));
     in.setPlotNo(rs.getString(2));
     in.setStreet(rs.getString(3));
     in.setSector(rs.getString(4));
     in.setDistrict(rs.getString(5));
     in.setProvince(rs.getString(6));
     in.setMailingAddress(rs.getString(7));
     in.setMailHouseNo(rs.getString(8));
     in.setMailStreet(rs.getString(9));
     in.setMailPoBox(rs.getString(10));
     in.setMailCity(rs.getString(11));
     in.setMailSector(rs.getString(12));
     in.setMailDistrict(rs.getString(13));
     in.setMailProvince(rs.getString(14));
     in.setIndividualId(rs.getInt(15));
     list.add(in);
     }
 }catch(Exception e){}
 return list;
 
 }
}
