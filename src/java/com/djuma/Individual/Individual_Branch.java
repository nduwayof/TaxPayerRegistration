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
public class Individual_Branch {
    private int branchId;
    private String nameOfBranch;
    private String branchAddress;
    private String branchCity;
    private String branchProvince;
    private int individualId;

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public void setNameOfBranch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getBranchCity() {
        return branchCity;
    }

    public void setBranchCity(String branchCity) {
        this.branchCity = branchCity;
    }

    public String getBranchProvince() {
        return branchProvince;
    }

    public void setBranchProvince(String branchProvince) {
        this.branchProvince = branchProvince;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public Individual_Branch(String nameOfBranch, String branchAddress, String branchCity, String branchProvince, int individualId) {
        this.nameOfBranch = nameOfBranch;
        this.branchAddress = branchAddress;
        this.branchCity = branchCity;
        this.branchProvince = branchProvince;
        this.individualId = individualId;
    }

    public Individual_Branch() {
    }
    
    public void saveBranch(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_branches values(id,?,?,?,?,?)");
        djuma.setString(1, nameOfBranch);
        djuma.setString(2, branchAddress);
        djuma.setString(3, branchCity);
        djuma.setString(4, branchProvince);
        djuma.setInt(5, individualId);
        djuma.execute();
    }catch(Exception e){
    
    
    }
    }
    public static List<Individual_Branch>listBranch(){
    List<Individual_Branch>list=new ArrayList<Individual_Branch>();
    try{
    
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual_branches");
        ResultSet rs=djuma.executeQuery();
        
        while(rs.next()){
        Individual_Branch b=new Individual_Branch();
        b.setBranchId(rs.getInt(1));
        b.setNameOfBranch(rs.getString(2));
        b.setBranchAddress(rs.getString(3));
        b.setBranchCity(rs.getString(4));
        b.setBranchProvince(rs.getString(5));
        b.setIndividualId(rs.getInt(6));
        list.add(b);
        }
    }catch(Exception e){
    
    }
    return list;
    }
    
}
