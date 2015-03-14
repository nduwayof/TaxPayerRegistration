/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class Individual_Activity {
    private Long activityId;
    private  boolean businessActivty;
    private double estmatedAnnualTurnOver;
    private int estimatedNumberOfEmployees;
    private String accountingMethod;
    private String mainSourceOfIncome;
    private String employmentMethod;
    private boolean businessPremiseRented;
    private int individualId;
    private int  sectorId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    
    public boolean isBusinessActivty() {
        return businessActivty;
    }

    public void setBusinessActivty(boolean businessActivty) {
        this.businessActivty = businessActivty;
    }

    public double getEstmatedAnnualTurnOver() {
        return estmatedAnnualTurnOver;
    }

    public void setEstmatedAnnualTurnOver(double estmatedAnnualTurnOver) {
        this.estmatedAnnualTurnOver = estmatedAnnualTurnOver;
    }

    public int getEstimatedNumberOfEmployees() {
        return estimatedNumberOfEmployees;
    }

    public void setEstimatedNumberOfEmployees(int estimatedNumberOfEmployees) {
        this.estimatedNumberOfEmployees = estimatedNumberOfEmployees;
    }

    public String getAccountingMethod() {
        return accountingMethod;
    }

    public void setAccountingMethod(String accountingMethod) {
        this.accountingMethod = accountingMethod;
    }

    public String getMainSourceOfIncome() {
        return mainSourceOfIncome;
    }

    public void setMainSourceOfIncome(String mainSourceOfIncome) {
        this.mainSourceOfIncome = mainSourceOfIncome;
    }

    public String getEmploymentMethod() {
        return employmentMethod;
    }

    public void setEmploymentMethod(String employmentMethod) {
        this.employmentMethod = employmentMethod;
    }

    public boolean isBusinessPremiseRented() {
        return businessPremiseRented;
    }

    public void setBusinessPremiseRented(boolean businessPremiseRented) {
        this.businessPremiseRented = businessPremiseRented;
    }

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public Individual_Activity(boolean businessActivty, double estmatedAnnualTurnOver, int estimatedNumberOfEmployees, String accountingMethod, String mainSourceOfIncome, String employmentMethod, boolean businessPremiseRented, int individualId, int sectorId) {
        this.businessActivty = businessActivty;
        this.estmatedAnnualTurnOver = estmatedAnnualTurnOver;
        this.estimatedNumberOfEmployees = estimatedNumberOfEmployees;
        this.accountingMethod = accountingMethod;
        this.mainSourceOfIncome = mainSourceOfIncome;
        this.employmentMethod = employmentMethod;
        this.businessPremiseRented = businessPremiseRented;
        this.individualId = individualId;
        this.sectorId = sectorId;
    }

    public Individual_Activity() {
    }
    
    public void SaveActivity(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual_activity values(id,?,?,?,?,?,?,?,?,?)");
        djuma.setBoolean(1, businessActivty);
        djuma.setDouble(2, estmatedAnnualTurnOver);
        djuma.setInt(3, estimatedNumberOfEmployees);
        djuma.setString(4, accountingMethod);
        djuma.setString(5, mainSourceOfIncome);
        djuma.setString(6, employmentMethod);
        djuma.setBoolean(7, businessPremiseRented);
        djuma.setInt(8, individualId);
        djuma.setInt(9, sectorId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
    
}
