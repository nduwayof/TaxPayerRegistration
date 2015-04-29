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
public class NonIndividual_Activity {
    private long activityId;
    private  boolean businessActivty;
    private double estmatedAnnualTurnOver;
    private int estimatedNumberOfEmployees;
    private String accountingMethod="";
    private String mainSourceOfIncome="";
    private String employmentMethod="";
    private boolean businessPremiseRented;
    private String  businessActivityStartDate="";
    private int nonIndividualId;

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
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

    public String getBusinessActivityStartDate() {
        return businessActivityStartDate;
    }

    public void setBusinessActivityStartDate(String businessActivityStartDate) {
        this.businessActivityStartDate = businessActivityStartDate;
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
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual_activity values(id,?,?,?,?,?,?,?,?,?)");
        djuma.setBoolean(1, businessActivty);
        djuma.setDouble(2, estmatedAnnualTurnOver);
        djuma.setInt(3, estimatedNumberOfEmployees);
        djuma.setString(4, businessActivityStartDate);
        djuma.setString(5, accountingMethod);
        djuma.setString(6, mainSourceOfIncome);
        djuma.setString(7, employmentMethod);
        djuma.setBoolean(8, businessPremiseRented);
        djuma.setInt(9, nonIndividualId);
        djuma.execute();
    }catch(Exception e){
    }
    
    }
    
    public static List<NonIndividual_Activity>list(){
    List<NonIndividual_Activity>l=new ArrayList<NonIndividual_Activity>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual_activity");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        NonIndividual_Activity i=new NonIndividual_Activity();
        i.setActivityId(rs.getLong(1));
        i.setBusinessActivty(rs.getBoolean(2));
        i.setEstmatedAnnualTurnOver(rs.getDouble(3));
        i.setEstimatedNumberOfEmployees(rs.getInt(4));
        i.setBusinessActivityStartDate(rs.getString(5));
        i.setAccountingMethod(rs.getString(6));
        i.setMainSourceOfIncome(rs.getString(7));
        i.setEmploymentMethod(rs.getString(8));
        i.setBusinessPremiseRented(rs.getBoolean(9));
        i.setNonIndividualId(rs.getInt(10));
        l.add(i);
        }
    }catch(Exception e){   
    }
    return l;
    }
}
