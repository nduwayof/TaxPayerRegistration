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
public class NonIndividual_Parent {
    private long parentId;
    private String foreignParentName;
    private String foreignAddress;
    private String foreignTown;
    private String foreignProvince ;
    private String foreignCountry;
    private String foreingPhoneNo;
    private String foreignFaxNumber;
    private int nonIndividualId;

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
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
   
   public static List<NonIndividual_Parent>list(){
   List<NonIndividual_Parent>l=new ArrayList<NonIndividual_Parent>();
   try{
   PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from NonIndividual_Parent");
       ResultSet rs=djuma.executeQuery();
       while(rs.next()){
       NonIndividual_Parent n=new NonIndividual_Parent();
       n.setParentId(rs.getLong(1));
       n.setForeignParentName(rs.getString(2));
       n.setForeignAddress(rs.getString(3));
       n.setForeignTown(rs.getString(4));
       n.setForeignProvince(rs.getString(5));
       n.setForeignCountry(rs.getString(6));
       n.setForeingPhoneNo(rs.getString(7));
       n.setForeignFaxNumber(rs.getString(8));
       n.setNonIndividualId(rs.getInt(9));
       l.add(n);
       }
   
   }catch(Exception e){
   
   }
   return l;
   }
    
}
