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
public class Individual_representative {
    private int representativeId;
    private String  taxpayerRepresentativeName;
    private String  representativeTitle;
    private String representativePhoneNo;
    private String contactName;
    private String contactTitle;
    private String contactPhoneNo;
    private int individualId;

    public int getRepresentativeId() {
        return representativeId;
    }

    public void setRepresentativeId(int representativeId) {
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
    
    
}
