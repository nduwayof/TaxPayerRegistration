/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.NonIndividual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class NonIndividual_Parent {
    private int parentId;
    private String foreignParentName;
    private String foreignAddress;
    private String foreignTown;
    private String foreignProvince ;
    private String foreignCountry;
    private String foreingPhoneNo;
    private String foreignFaxNumber;
    private int nonIndividualId;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getForeignParentName() {
        return foreignParentName;
    }

    public void setForeignParentName(String foreignParentName) {
        this.foreignParentName = foreignParentName;
    }

    public String getForeignAddress() {
        return foreignAddress;
    }

    public void setForeignAddress(String foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    public String getForeignTown() {
        return foreignTown;
    }

    public void setForeignTown(String foreignTown) {
        this.foreignTown = foreignTown;
    }

    public String getForeignProvince() {
        return foreignProvince;
    }

    public void setForeignProvince(String foreignProvince) {
        this.foreignProvince = foreignProvince;
    }

    public String getForeignCountry() {
        return foreignCountry;
    }

    public void setForeignCountry(String foreignCountry) {
        this.foreignCountry = foreignCountry;
    }

    public String getForeingPhoneNo() {
        return foreingPhoneNo;
    }

    public void setForeingPhoneNo(String foreingPhoneNo) {
        this.foreingPhoneNo = foreingPhoneNo;
    }

    public String getForeignFaxNumber() {
        return foreignFaxNumber;
    }

    public void setForeignFaxNumber(String foreignFaxNumber) {
        this.foreignFaxNumber = foreignFaxNumber;
    }

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Parent(String foreignParentName, String foreignAddress, String foreignTown, String foreignProvince, String foreignCountry, String foreingPhoneNo, String foreignFaxNumber, int nonIndividualId) {
        this.foreignParentName = foreignParentName;
        this.foreignAddress = foreignAddress;
        this.foreignTown = foreignTown;
        this.foreignProvince = foreignProvince;
        this.foreignCountry = foreignCountry;
        this.foreingPhoneNo = foreingPhoneNo;
        this.foreignFaxNumber = foreignFaxNumber;
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Parent() {
    }
    
   public void saveParent(){
   try{
       PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into NonIndividual_Parent values(id,?,?,?,?,?,?,?,?)");
       djuma.setString(1, foreignParentName);
       djuma.setString(2, foreignAddress);
       djuma.setString(3, foreignTown);
       djuma.setString(4, foreignProvince);
       djuma.setString(5, foreignCountry);
       djuma.setString(6, foreingPhoneNo);
       djuma.setString(7, foreignFaxNumber);
       djuma.setInt(8, nonIndividualId);
       djuma.execute();
   }catch(Exception e){
   
   }
   }
    
}
