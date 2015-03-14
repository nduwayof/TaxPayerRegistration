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
public class Individual_Bank {
    private int bankId;
    private String principalBankName;
    private String  branchName;
    private String branchAddress;
    private String branchSector;
    private String branchDistrict;
    private String bankAccountNo;
    private String currency;
    private int individualId;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getPrincipalBankName() {
        return principalBankName;
    }

    public void setPrincipalBankName(String principalBankName) {
        this.principalBankName = principalBankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getBranchSector() {
        return branchSector;
    }

    public void setBranchSector(String branchSector) {
        this.branchSector = branchSector;
    }

    public String getBranchDistrict() {
        return branchDistrict;
    }

    public void setBranchDistrict(String branchDistrict) {
        this.branchDistrict = branchDistrict;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public Individual_Bank(String principalBankName, String branchName, String branchAddress, String branchSector, String branchDistrict, String bankAccountNo, String currency, int individualId) {
        this.principalBankName = principalBankName;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.branchSector = branchSector;
        this.branchDistrict = branchDistrict;
        this.bankAccountNo = bankAccountNo;
        this.currency = currency;
        this.individualId = individualId;
    }
    
    
}
