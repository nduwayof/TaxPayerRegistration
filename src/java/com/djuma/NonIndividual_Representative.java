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
public class NonIndividual_Representative {

    private long representativeId;
    private String taxpayerRepresentativeName;
    private String representativeTitle;
    private String representativePhoneNo;
    private String contactName;
    private String contactTitle;
    private String contactPhoneNo;
    private int nonIndividualId;

    public long getRepresentativeId() {
        return representativeId;
    }

    public void setRepresentativeId(long representativeId) {
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

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Representative() {
    }

    public NonIndividual_Representative(String taxpayerRepresentativeName, String representativeTitle, String representativePhoneNo, String contactName, String contactTitle, String contactPhoneNo, int nonIndividualId) {
        this.taxpayerRepresentativeName = taxpayerRepresentativeName;
        this.representativeTitle = representativeTitle;
        this.representativePhoneNo = representativePhoneNo;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.contactPhoneNo = contactPhoneNo;
        this.nonIndividualId = nonIndividualId;
    }

    public void saveRepresentative() {
        try {
            PreparedStatement djuma = SetCon.getCon().prepareStatement("insert into nonIndividual_representative values(id,?,?,?,?,?,?,?)");
            djuma.setString(1, taxpayerRepresentativeName);
            djuma.setString(2, representativeTitle);
            djuma.setString(3, representativePhoneNo);
            djuma.setString(4, contactName);
            djuma.setString(5, contactTitle);
            djuma.setString(6, contactPhoneNo);
            djuma.setInt(7, nonIndividualId);
            djuma.execute();
        } catch (Exception e) {
        }

    }
    
    public static List<NonIndividual_Representative>list(){
    List<NonIndividual_Representative>l=new ArrayList<NonIndividual_Representative>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_representative ");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        NonIndividual_Representative n=new NonIndividual_Representative();
        n.setRepresentativeId(rs.getLong(1));
        n.setTaxpayerRepresentativeName(rs.getString(2));
        n.setRepresentativeTitle(rs.getString(3));
        n.setRepresentativePhoneNo(rs.getString(4));
        n.setContactName(rs.getString(5));
        n.setContactTitle(rs.getString(6));
        n.setContactPhoneNo(rs.getString(7));
        n.setNonIndividualId(rs.getInt(8));
        l.add(n);
        }
    }catch(Exception e){
    
    }
    return l;
    }
}
