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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class NonIndividual {
    private int nonIndividualId;
    private String enterpriseType;
    private boolean incBenefitsInvestment;
    private String noOfExpiration;
    private String expirationDate;
    private String registeredName;
    private String registrationDate;
    private String comRegistrationNo;
    private boolean resident;
    private String countryOfResidence;
    private String entrepriseEmail;
    private String nssfRegistrationNo;
    private String entreprisePhoneNo;
    private String entrepriseFaxNo;
    private String startDate;
    private String noOfShares;
    private String sharesValue;
    private String tinNumber;
    private String oldTinNumber;
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private String doneBy;
    private boolean hasInfo;

    public int getNonIndividualId() {
        return nonIndividualId;
    }

    public void setNonIndividualId(int nonIndividualId) {
        this.nonIndividualId = nonIndividualId;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public boolean isIncBenefitsInvestment() {
        return incBenefitsInvestment;
    }

    public void setIncBenefitsInvestment(boolean incBenefitsInvestment) {
        this.incBenefitsInvestment = incBenefitsInvestment;
    }

    

    public String getNoOfExpiration() {
        return noOfExpiration;
    }

    public void setNoOfExpiration(String noOfExpiration) {
        this.noOfExpiration = noOfExpiration;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getComRegistrationNo() {
        return comRegistrationNo;
    }

    public void setComRegistrationNo(String comRegistrationNo) {
        this.comRegistrationNo = comRegistrationNo;
    }

    public boolean isResident() {
        return resident;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getEntrepriseEmail() {
        return entrepriseEmail;
    }

    public void setEntrepriseEmail(String entrepriseEmail) {
        this.entrepriseEmail = entrepriseEmail;
    }

    public String getNssfRegistrationNo() {
        return nssfRegistrationNo;
    }

    public void setNssfRegistrationNo(String nssfRegistrationNo) {
        this.nssfRegistrationNo = nssfRegistrationNo;
    }

    public String getEntreprisePhoneNo() {
        return entreprisePhoneNo;
    }

    public void setEntreprisePhoneNo(String entreprisePhoneNo) {
        this.entreprisePhoneNo = entreprisePhoneNo;
    }

    public String getEntrepriseFaxNo() {
        return entrepriseFaxNo;
    }

    public void setEntrepriseFaxNo(String entrepriseFaxNo) {
        this.entrepriseFaxNo = entrepriseFaxNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(String noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String getSharesValue() {
        return sharesValue;
    }

    public void setSharesValue(String sharesValue) {
        this.sharesValue = sharesValue;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getOldTinNumber() {
        return oldTinNumber;
    }

    public void setOldTinNumber(String oldTinNumber) {
        this.oldTinNumber = oldTinNumber;
    }

    public Timestamp getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(Timestamp doneAt) {
        this.doneAt = doneAt;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public boolean isHasInfo() {
        return hasInfo;
    }

    public void setHasInfo(boolean hasInfo) {
        this.hasInfo = hasInfo;
    }

    public NonIndividual(String enterpriseType, boolean incBenefitsInvestment, String noOfExpiration, String expirationDate, String registeredName, String registrationDate, String comRegistrationNo, boolean resident, String countryOfResidence, String entrepriseEmail, String nssfRegistrationNo, String entreprisePhoneNo, String entrepriseFaxNo, String startDate, String noOfShares, String sharesValue, String tinNumber, String oldTinNumber, String doneBy) {
        this.enterpriseType = enterpriseType;
        this.incBenefitsInvestment = incBenefitsInvestment;
        this.noOfExpiration = noOfExpiration;
        this.expirationDate = expirationDate;
        this.registeredName = registeredName;
        this.registrationDate = registrationDate;
        this.comRegistrationNo = comRegistrationNo;
        this.resident = resident;
        this.countryOfResidence = countryOfResidence;
        this.entrepriseEmail = entrepriseEmail;
        this.nssfRegistrationNo = nssfRegistrationNo;
        this.entreprisePhoneNo = entreprisePhoneNo;
        this.entrepriseFaxNo = entrepriseFaxNo;
        this.startDate = startDate;
        this.noOfShares = noOfShares;
        this.sharesValue = sharesValue;
        this.tinNumber = tinNumber;
        this.oldTinNumber = oldTinNumber;
        this.doneBy = doneBy;
    }

    public NonIndividual() {
    }

    
    
    
    public void SaveNonIndividual(){
    
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
         djuma.setString(1, enterpriseType);
         djuma.setBoolean(2, incBenefitsInvestment);
         djuma.setString(3, noOfExpiration);
         djuma.setString(4, expirationDate);
         djuma.setString(5, registeredName);
         djuma.setString(6, registrationDate);
         djuma.setString(7, comRegistrationNo);
         djuma.setBoolean(8, resident);
         djuma.setString(9, countryOfResidence);
         djuma.setString(10, entrepriseEmail);
         djuma.setString(11, nssfRegistrationNo);
         djuma.setString(12, entreprisePhoneNo);
         djuma.setString(13, entrepriseFaxNo);
         djuma.setString(14, startDate);
         djuma.setString(15, noOfShares);
         djuma.setString(16, sharesValue);
         djuma.setBoolean(17, false);
         djuma.setString(18, oldTinNumber);
         djuma.setTimestamp(19, doneAt);
         djuma.setString(20, doneBy);
         djuma.setString(21, tinNumber);
         djuma.execute();
    }catch(Exception e){
    
    }
    }
    
    public void updateNonIndividual(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("update nonIndividual set enterpriseType=?, incBenefitsInvestment=?, noOfExpiration=?, expirationDate=?, registeredName=?, registrationDate=?, comRegistrationNo=?, resident=?, countryOfResidence=?, entrepriseEmail=?, nssfRegistrationNo=?, entreprisePhoneNo=?, entrepriseFaxNo=?, startDate=?, noOfShares=?, sharesValue=?, hasInfo=?, oldTinNumber=?, doneAt=?, doneBy=?, tinNumber=? where id=?");
         djuma.setString(1, enterpriseType);
         djuma.setBoolean(2, incBenefitsInvestment);
         djuma.setString(3, noOfExpiration);
         djuma.setString(4, expirationDate);
         djuma.setString(5, registeredName);
         djuma.setString(6, registrationDate);
         djuma.setString(7, comRegistrationNo);
         djuma.setBoolean(8, resident);
         djuma.setString(9, countryOfResidence);
         djuma.setString(10, entrepriseEmail);
         djuma.setString(11, nssfRegistrationNo);
         djuma.setString(12, entreprisePhoneNo);
         djuma.setString(13, entrepriseFaxNo);
         djuma.setString(14, startDate);
         djuma.setString(15, noOfShares);
         djuma.setString(16, sharesValue);
         djuma.setBoolean(17, true);
         djuma.setString(18, oldTinNumber);
         djuma.setTimestamp(19, doneAt);
         djuma.setString(20, doneBy);
         djuma.setString(21, tinNumber);
         djuma.setInt(22, nonIndividualId);
         djuma.execute();
    }catch(Exception e){
    
    }
    
    }
    
    public static List<NonIndividual>listNonIndividual(){
    List<NonIndividual>list=new ArrayList<NonIndividual>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from nonIndividual");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        NonIndividual n=new NonIndividual();
        n.setNonIndividualId(rs.getInt(1));
        n.setEnterpriseType(rs.getString(2));
        n.setIncBenefitsInvestment(rs.getBoolean(3));
        n.setNoOfExpiration(rs.getString(4));
        n.setExpirationDate(rs.getString(5));
        n.setRegisteredName(rs.getString(6));
        n.setRegistrationDate(rs.getString(7));
        n.setComRegistrationNo(rs.getString(8));
        n.setResident(rs.getBoolean(9));
        n.setCountryOfResidence(rs.getString(10));
        n.setEntrepriseEmail(rs.getString(11));
        n.setNssfRegistrationNo(rs.getString(12));
        n.setEntreprisePhoneNo(rs.getString(13));
        n.setEntrepriseFaxNo(rs.getString(14));
        n.setStartDate(rs.getString(15));
        n.setNoOfShares(rs.getString(16));
        n.setSharesValue(rs.getString(17));
        n.setHasInfo(rs.getBoolean(18));
        n.setOldTinNumber(rs.getString(19));
        n.setDoneAt(rs.getTimestamp(20));
        n.setDoneBy(rs.getString(21));
        n.setTinNumber(rs.getString(22));
        list.add(n);
        
        }
    }catch(Exception e){}
    return list;
    }
    
    
    public static int getLastTicket(){
   int i=0;
   for(NonIndividual in: NonIndividual.listNonIndividual()){
   i=in.getNonIndividualId();
   }
   return i;
   }
   public static boolean createNewTicket(int lastTicket){
   boolean check=true;
   for(NonIndividual in:NonIndividual.listNonIndividual()){
   if(in.getNonIndividualId()==lastTicket){
   if(in.isHasInfo()==false){
   check=false;
   }else{
   check=true;
   }
   }
   }
   return check;
   }
   
   public static String newTinNumber(){
    String msg="";
    String lastTinNumber="";
    String newTinNumber="";
    for(NonIndividual d: NonIndividual.listNonIndividual()){
        if(d.isHasInfo()){
   lastTinNumber=d.getTinNumber();
        }
    }
    
    if(lastTinNumber.equalsIgnoreCase("")){
            newTinNumber="TIN/NIN/0001";
            msg=newTinNumber;
        }else{
       lastTinNumber=lastTinNumber.substring(7);
            if (lastTinNumber.length() == 4 && lastTinNumber.substring(0, 3).equalsIgnoreCase("000") && Integer.parseInt(lastTinNumber.substring(3)) < 9) {
                newTinNumber = "000" + ((Integer.parseInt(lastTinNumber.substring(3))) + 1);
            } else if (lastTinNumber.length() == 4 && lastTinNumber.substring(0, 3).equalsIgnoreCase("000") && Integer.parseInt(lastTinNumber.substring(3)) == 9) {
                newTinNumber = "00" + ((Integer.parseInt(lastTinNumber.substring(3))) + 1);
            } else if (lastTinNumber.length() == 4 && lastTinNumber.substring(0, 2).equalsIgnoreCase("00") && Integer.parseInt(lastTinNumber.substring(2)) < 99) {
                newTinNumber = "00" + ((Integer.parseInt(lastTinNumber.substring(2))) + 1);
            } else if (lastTinNumber.length() == 4 && lastTinNumber.substring(0, 2).equalsIgnoreCase("00") && Integer.parseInt(lastTinNumber.substring(2)) == 99) {
                newTinNumber = "0" + ((Integer.parseInt(lastTinNumber.substring(2))) + 1);
            } else if (lastTinNumber.length() == 4 && lastTinNumber.substring(0, 1).equalsIgnoreCase("0") && Integer.parseInt(lastTinNumber.substring(1)) < 999) {
                newTinNumber = "0" + ((Integer.parseInt(lastTinNumber.substring(1))) + 1);
            } else if (lastTinNumber.length() == 4 && lastTinNumber.substring(0, 1).equalsIgnoreCase("0") && Integer.parseInt(lastTinNumber.substring(1)) == 999) {
                newTinNumber = "" + ((Integer.parseInt(lastTinNumber.substring(1))) + 1);
            } else {
                newTinNumber = "" + ((Integer.parseInt(lastTinNumber)) + 1);
            }
            msg="TIN/NIN/"+newTinNumber;
        }
    
    return msg;
   }
}
