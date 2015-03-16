/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.NonIndividual.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author SULAIMAN
 */
public class CommonNonIndividual {
     private int nonIndividualId;
    private String enterpriseType="";
    private boolean incBenefitsInvestment;
    private String noOfExpiration="";
    private String expirationDate="";
    private String registeredName="";
    private String registrationDate="";
    private String comRegistrationNo="";
    private boolean resident;
    private String countryOfResidence="";
    private String entrepriseEmail="";
    private String nssfRegistrationNo="";
    private String entreprisePhoneNo="";
    private String entrepriseFaxNo="";
    private String startDate="";
    private String noOfShares="";
    private String sharesValue="";
    private String tinNumber="";
    private String oldTinNumber="";
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private String doneBy="";
    private boolean hasInfo;

    
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
 
 
 private String foreignParentName;
    private String foreignAddress;
    private String foreignTown;
    private String foreignProvince ;
    private String foreignCountry;
    private String foreingPhoneNo;
    private String foreignFaxNumber;
    
    
    private String  taxpayerRepresentativeName;
    private String  representativeTitle;
    private String representativePhoneNo;
    private String contactName;
    private String contactTitle;
    private String contactPhoneNo;
    
    private String taxPayerTypeId;
    
    private String taxTypeId;
    
    private int sectorId;
    
    private  boolean businessActivty;
    private double estmatedAnnualTurnOver;
    private int estimatedNumberOfEmployees;
    private String accountingMethod;
    private String mainSourceOfIncome;
    private String employmentMethod;
    private boolean businessPremiseRented;
    private String mainSectorActivity;

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

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailHouseNo() {
        return mailHouseNo;
    }

    public void setMailHouseNo(String mailHouseNo) {
        this.mailHouseNo = mailHouseNo;
    }

    public String getMailStreet() {
        return mailStreet;
    }

    public void setMailStreet(String mailStreet) {
        this.mailStreet = mailStreet;
    }

    public String getMailPoBox() {
        return mailPoBox;
    }

    public void setMailPoBox(String mailPoBox) {
        this.mailPoBox = mailPoBox;
    }

    public String getMailCity() {
        return mailCity;
    }

    public void setMailCity(String mailCity) {
        this.mailCity = mailCity;
    }

    public String getMailSector() {
        return mailSector;
    }

    public void setMailSector(String mailSector) {
        this.mailSector = mailSector;
    }

    public String getMailDistrict() {
        return mailDistrict;
    }

    public void setMailDistrict(String mailDistrict) {
        this.mailDistrict = mailDistrict;
    }

    public String getMailProvince() {
        return mailProvince;
    }

    public void setMailProvince(String mailProvince) {
        this.mailProvince = mailProvince;
    }

    public String getForeignParentName() {
        return foreignParentName;
    }

    public void setForeignParentName(String foreignParentName) {
        this.foreignParentName = foreignParentName;
    }

    public String getForeignAddress() {
        return foreignAddress;
    }

    public void setForeignAddress(String foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    public String getForeignTown() {
        return foreignTown;
    }

    public void setForeignTown(String foreignTown) {
        this.foreignTown = foreignTown;
    }

    public String getForeignProvince() {
        return foreignProvince;
    }

    public void setForeignProvince(String foreignProvince) {
        this.foreignProvince = foreignProvince;
    }

    public String getForeignCountry() {
        return foreignCountry;
    }

    public void setForeignCountry(String foreignCountry) {
        this.foreignCountry = foreignCountry;
    }

    public String getForeingPhoneNo() {
        return foreingPhoneNo;
    }

    public void setForeingPhoneNo(String foreingPhoneNo) {
        this.foreingPhoneNo = foreingPhoneNo;
    }

    public String getForeignFaxNumber() {
        return foreignFaxNumber;
    }

    public void setForeignFaxNumber(String foreignFaxNumber) {
        this.foreignFaxNumber = foreignFaxNumber;
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

    public String getTaxPayerTypeId() {
        return taxPayerTypeId;
    }

    public void setTaxPayerTypeId(String taxPayerTypeId) {
        this.taxPayerTypeId = taxPayerTypeId;
    }

    public String getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public String getMainSectorActivity() {
        return mainSectorActivity;
    }

    public void setMainSectorActivity(String mainSectorActivity) {
        this.mainSectorActivity = mainSectorActivity;
    }

    

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
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

    public CommonNonIndividual() {
    }
    
    public void saveCommonNonIndividual(){
    if(businessActivty==true){
      String sectorActivityParts[]=mainSectorActivity.split("#");
      for(int d=0;d<sectorActivityParts.length;d++){
      NonIndividual_mainSectorActivity is=new NonIndividual_mainSectorActivity(nonIndividualId,Integer.parseInt(sectorActivityParts[d]));
      }
        }
     String taxTypeParts[]=taxTypeId.split("#");
     for(int i=0; i<taxTypeParts.length;i++){
         Nonindividual_TaxType it=new Nonindividual_TaxType(nonIndividualId, Integer.parseInt(taxTypeParts[i]));
     it.SaveTaxType();
     }
     String taxPayerTypeParts[]=taxPayerTypeId.split("#");
     for(int j=0;j<taxPayerTypeParts.length;j++){
         Nonindividual_TaxPayerType i=new Nonindividual_TaxPayerType(nonIndividualId, Integer.parseInt(taxPayerTypeParts[j]));
     i.SaveTaxPayerType();
     }
     NonIndividual_Activity iac=new NonIndividual_Activity(businessActivty, estmatedAnnualTurnOver, estimatedNumberOfEmployees, accountingMethod, mainSourceOfIncome, employmentMethod, businessPremiseRented, nonIndividualId);
      iac.SaveActivity();
      NonIndividual_Address iad=new NonIndividual_Address(plotNo, street, sector, district, province, mailingAddress, mailHouseNo, mailStreet, mailPoBox, mailCity, mailSector, mailDistrict, mailProvince, nonIndividualId);
      iad.saveAddress();
      NonIndividual_Representative ir=new NonIndividual_Representative(taxpayerRepresentativeName, representativeTitle, representativePhoneNo, contactName, contactTitle, contactPhoneNo, nonIndividualId);
      ir.saveRepresentative();
      NonIndividual noin=new NonIndividual(enterpriseType, incBenefitsInvestment, noOfExpiration, expirationDate, registeredName, registrationDate, comRegistrationNo, resident, countryOfResidence, entrepriseEmail, nssfRegistrationNo, entreprisePhoneNo, entrepriseFaxNo, startDate, noOfShares, sharesValue, tinNumber, oldTinNumber, doneBy);
    noin.updateNonIndividual();
    NonIndividual_Parent p=new NonIndividual_Parent(foreignParentName, foreignAddress, foreignTown, foreignProvince, foreignCountry, foreingPhoneNo, foreignFaxNumber, nonIndividualId);
    p.saveParent();
    }
}
