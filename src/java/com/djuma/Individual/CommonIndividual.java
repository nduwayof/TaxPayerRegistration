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
public class CommonIndividual {
    //individual
    private String ownerSurname;
    private String  ownerFirstName;
    private String  dob;
    private String deceadDate;
    private String gender;
   private String occupation;
   private String nationality;
   private String nationalId;
   private String socialSecurityNumber;
   private String passport;
   private String homePhone;
   private String workPhone;
   private String cellPhone;
   private String faxNo;
   private String resident;
   private String countryOfResidence;
   private String civilStatus;
   private String mariageName;
   private String mariageSurname;
   private String mariageDob;
   private String photo;
   private String notionalPhotocopy;
   
   //individualTaxPayerType
   
 private String taxPayerIndividualId;
 private int taxPayerTypeId;
 
 //individual TaxType
 
 private int taxTypeIndividualId;
 private int taxTypeId;
 
 //activity
 
 private  boolean businessActivty;
    private double estmatedAnnualTurnOver;
    private int estimatedNumberOfEmployees;
    private String accountingMethod;
    private String mainSourceOfIncome;
    private String employmentMethod;
    private boolean businessPremiseRented;
    private int activityIndividualId;
    private int  sectorId;
    
    //Address
    
    private String plotNo;
 private String street;
 private String sector;
 private String district;
 private String province;
 private String mailingAddress;
 private String mailHouseNo;
 private String mailStreet;
 private String mailPoBox;
 private String mailCity;
 private String mailSector;
 private String mailDistrict;
 private String mailProvince;
 private int addressIndividualId;
 
 //Representative
 
 private String  taxpayerRepresentativeName;
    private String  representativeTitle;
    private String representativePhoneNo;
    private String contactName;
    private String contactTitle;
    private String contactPhoneNo;
    private int representativeIndividualId;
    
    //Trade
    
    private String tradeName;
   private String tradeAddress;
   private String tradeDistrict;
   private String tradeProvince;
   private String commercialRegistrationNo;
   private String startDate;
   private String entreprisePhoneNo;
   private String entrepriseFaxNo;
   private String tradeIndividualId;

}
