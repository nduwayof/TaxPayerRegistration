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
public class Individual_representative {
    private Long representativeId;
    private String  taxpayerRepresentativeName;
    private String  representativeTitle;
    private String representativePhoneNo;
    private String contactName;
    private String contactTitle;
    private String contactPhoneNo;
    private int individualId;

    public Long getRepresentativeId() {
        return representativeId;
    }

    public void setRepresentativeId(Long representativeId) {
        this.representativeId = representativeId;
    }

    

    public String getTaxpayerRepresentativeName() {
        return taxpayerRepresentativeName;
    }

    public void setTaxpayerRepresentativeName(String taxpayerRepresentativeName) {
        this.taxpayerRepresentativeName = taxpayerRepresentativeName;
    }

    public String getRepresentativeTitle() {
        return representativeTitle;
    }

    public void setRepresentativeTitle(String representativeTitle) {
        this.representativeTitle = representativeTitle;
    }

    public String getRepresentativePhoneNo() {
        return representativePhoneNo;
    }

    public void setRepresentativePhoneNo(String representativePhoneNo) {
        this.representativePhoneNo = representativePhoneNo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public Individual_representative(String taxpayerRepresentativeName, String representativeTitle, String representativePhoneNo, String contactName, String contactTitle, String contactPhoneNo, int individualId) {
        this.taxpayerRepresentativeName = taxpayerRepresentativeName;
        this.representativeTitle = representativeTitle;
        this.representativePhoneNo = representativePhoneNo;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.contactPhoneNo = contactPhoneNo;
        this.individualId = individualId;
    }

    public Individual_representative() {
    }
   public void saveRepresentative(){
   try{
       PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_representative values(id,?,?,?,?,?,?,?)");
       djuma.setString(1, taxpayerRepresentativeName);
       djuma.setString(2, representativeTitle);
       djuma.setString(3, representativePhoneNo);
       djuma.setString(4, contactName);
       djuma.setString(5, contactTitle);
       djuma.setString(6, contactPhoneNo);
       djuma.setInt(7, individualId);
       djuma.execute();
   }catch(Exception e){}
   
   
   } 
    public static List<Individual_representative>list(){
    List<Individual_representative>l=new ArrayList<Individual_representative>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_representative");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        Individual_representative in=new Individual_representative();
        in.setRepresentativeId(rs.getLong(1));
        in.setTaxpayerRepresentativeName(rs.getString(2));
        in.setRepresentativeTitle(rs.getString(3));
        in.setRepresentativePhoneNo(rs.getString(4));
        in.setContactName(rs.getString(5));
        in.setContactTitle(rs.getString(6));
        in.setContactPhoneNo(rs.getString(7));
        in.setIndividualId(rs.getInt(8));
        l.add(in);
        }
    }catch(Exception e){
    
    }
    return l;
    }    
}
