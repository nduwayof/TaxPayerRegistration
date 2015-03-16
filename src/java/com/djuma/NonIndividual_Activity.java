/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.NonIndividual.*;
import com.djuma.Connection.SetCon;
import java.sql.PreparedStatement;

/**
 *
 * @author SULAIMAN
 */
public class NonIndividual_Activity {
    private Long activityId;
    private  boolean businessActivty;
    private double estmatedAnnualTurnOver;
    private int estimatedNumberOfEmployees;
    private String accountingMethod;
    private String mainSourceOfIncome;
    private String employmentMethod;
    private boolean businessPremiseRented;
    private int nonIndividualId;

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

    public NonIndividual_Activity(boolean businessActivty, double estmatedAnnualTurnOver, int estimatedNumberOfEmployees, String accountingMethod, String mainSourceOfIncome, String employmentMethod, boolean businessPremiseRented, int nonIndividualId) {
        this.businessActivty = businessActivty;
        this.estmatedAnnualTurnOver = estmatedAnnualTurnOver;
        this.estimatedNumberOfEmployees = estimatedNumberOfEmployees;
        this.accountingMethod = accountingMethod;
        this.mainSourceOfIncome = mainSourceOfIncome;
        this.employmentMethod = employmentMethod;
        this.businessPremiseRented = businessPremiseRented;
        this.nonIndividualId = nonIndividualId;
    }

    public NonIndividual_Activity() {
    }

    
    public void SaveActivity(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_activity values(id,?,?,?,?,?,?,?,?)");
        djuma.setBoolean(1, businessActivty);
        djuma.setDouble(2, estmatedAnnualTurnOver);
        djuma.setInt(3, estimatedNumberOfEmployees);
        djuma.setString(4, accountingMethod);
        djuma.setString(5, mainSourceOfIncome);
        djuma.setString(6, employmentMethod);
        djuma.setBoolean(7, businessPremiseRented);
        djuma.setInt(8, nonIndividualId);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
}
