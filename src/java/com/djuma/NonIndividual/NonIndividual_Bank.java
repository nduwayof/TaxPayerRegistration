/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.NonIndividual;

import com.djuma.Connection.SetCon;
import com.djuma.Individual.Individual_Bank;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class NonIndividual_Bank {
    private Long bankId;
    private String principalBankName;
    private String  branchName;
    private String branchAddress;
    private String branchSector;
    private String branchDistrict;
    private String bankAccountNo;
    private String currency;
    private int nonIndividualId;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
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

    public NonIndividual_Bank() {
    }

    public NonIndividual_Bank(String principalBankName, String branchName, String branchAddress, String branchSector, String branchDistrict, String bankAccountNo, String currency, int nonIndividualId) {
        this.principalBankName = principalBankName;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.branchSector = branchSector;
        this.branchDistrict = branchDistrict;
        this.bankAccountNo = bankAccountNo;
        this.currency = currency;
        this.nonIndividualId = nonIndividualId;
    }

    
    public void SaveBank(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_bank values(id,?,?,?,?,?,?,?,?)");
        djuma.setString(1, principalBankName);
        djuma.setString(2, branchName);
        djuma.setString(3, branchAddress);
        djuma.setString(4, branchSector);
        djuma.setString(5, branchDistrict);
        djuma.setString(6, bankAccountNo);
        djuma.setString(7, currency);
        djuma.setInt(8, nonIndividualId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
    
    public static List<Individual_Bank>listBank(){
     List<Individual_Bank>list=new ArrayList<Individual_Bank>();
     try{
     PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_bank");
         ResultSet rs=djuma.executeQuery();
         while(rs.next()){
         Individual_Bank b=new Individual_Bank();
         b.setBankId(rs.getLong(1));
         b.setPrincipalBankName(rs.getString(2));
         b.setBranchName(rs.getString(3));
         b.setBranchAddress(rs.getString(4));
         b.setBranchSector(rs.getString(5));
         b.setBranchDistrict(rs.getString(6));
         b.setBankAccountNo(rs.getString(7));
         b.setCurrency(rs.getString(8));
         b.setIndividualId(rs.getInt(9));
         list.add(b);
         }
     }catch(Exception e){
     }
     
     return list;
    }
    
     public static List<Individual_Bank>listBankPerIndividual(int indId){
     List<Individual_Bank>list=new ArrayList<Individual_Bank>();
     try{
     PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_bank where nonIndividualId=?");
     djuma.setInt(1, indId);
         ResultSet rs=djuma.executeQuery();
         while(rs.next()){
         Individual_Bank b=new Individual_Bank();
         b.setBankId(rs.getLong(1));
         b.setPrincipalBankName(rs.getString(2));
         b.setBranchName(rs.getString(3));
         b.setBranchAddress(rs.getString(4));
         b.setBranchSector(rs.getString(5));
         b.setBranchDistrict(rs.getString(6));
         b.setBankAccountNo(rs.getString(7));
         b.setCurrency(rs.getString(8));
         b.setIndividualId(rs.getInt(9));
         list.add(b);
         }
     }catch(Exception e){
     }
     
     return list;
    }
    
}
