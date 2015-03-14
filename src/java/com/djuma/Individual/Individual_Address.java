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
public class Individual_Address {
 private int addressId;
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

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
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
 
}
