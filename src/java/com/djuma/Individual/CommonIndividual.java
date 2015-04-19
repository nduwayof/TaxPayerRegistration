/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import com.djuma.Tax.TaxPayerType;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author SULAIMAN
 */
public class CommonIndividual {
    private int individualId;
    //individual
    private String ownerSurname="";
    private String  ownerFirstName="";
    private String  dob="";
    private String deceadDate="";
    private String gender="";
   private String occupation="";
   private String nationality="";
   private String nationalId="";
   private String socialSecurityNumber="";
   private String passport="";
   private String homePhone="";
   private String workPhone="";
   private String cellPhone="";
   private String faxNo="";
   private String resident="0";
   private String countryOfResidence="";
   private String civilStatus="";
   private String mariageName="";
   private String mariageSurname="";
   private String mariageDob="";
   private String photo="";
   private String notionalPhotocopy="";
   private String tinNumber="";
   private String oldTinNumber="";
   private Timestamp doneAt=new Timestamp(new Date().getTime());
  private String doneBy="";
  private boolean  deRegistered=false;
  
 private String investmentIncentives;
  private String incentiveStartDate="";
 private String incentivesExpirationDate="";
 private String vatDocumentNumber="";
  
  
   
   //individualTaxPayerType
   
 //private String individualId;
// private String taxPayerTypeId="";
 
 //individual TaxType
 
 //private int individualId;
 private String taxTypeId="";
 private boolean optionVat=true;
 
 //activity
 
 private  boolean businessActivty=false;
    private double estmatedAnnualTurnOver;
    private int estimatedNumberOfEmployees;
    private String accountingMethod;
    private String mainSourceOfIncome;
    private String employmentMethod;
    private boolean businessPremiseRented;
    //private int individualId;
    private int  sectorId;
    private String mainSectorActivity;
    
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
 //private int individualId;
 
 //Representative
 
 private String  taxpayerRepresentativeName;
    private String  representativeTitle;
    private String representativePhoneNo;
    private String contactName;
    private String contactTitle;
    private String contactPhoneNo;
    //private int individualId;
    

    

    public int getIndividualId() {
        return individualId;
    }

    public void setIndividualId(int individualId) {
        this.individualId = individualId;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDeceadDate() {
        return deceadDate;
    }

    public void setDeceadDate(String deceadDate) {
        this.deceadDate = deceadDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getMariageName() {
        return mariageName;
    }

    public void setMariageName(String mariageName) {
        this.mariageName = mariageName;
    }

    public String getMariageSurname() {
        return mariageSurname;
    }

    public void setMariageSurname(String mariageSurname) {
        this.mariageSurname = mariageSurname;
    }

    public String getMariageDob() {
        return mariageDob;
    }

    public void setMariageDob(String mariageDob) {
        this.mariageDob = mariageDob;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNotionalPhotocopy() {
        return notionalPhotocopy;
    }

    public void setNotionalPhotocopy(String notionalPhotocopy) {
        this.notionalPhotocopy = notionalPhotocopy;
    }

   // public String getTaxPayerTypeId() {
     //   return taxPayerTypeId;
    //}

    //public void setTaxPayerTypeId(String taxPayerTypeId) {
      //  this.taxPayerTypeId = taxPayerTypeId;
    //}

    public String getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public boolean isOptionVat() {
        return optionVat;
    }

    public void setOptionVat(boolean optionVat) {
        this.optionVat = optionVat;
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

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
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

    public String getMainSectorActivity() {
        return mainSectorActivity;
    }

    public void setMainSectorActivity(String mainSectorActivity) {
        this.mainSectorActivity = mainSectorActivity;
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

    public boolean isDeRegistered() {
        return deRegistered;
    }

    public void setDeRegistered(boolean deRegistered) {
        this.deRegistered = deRegistered;
    }
    

    public CommonIndividual() {
    }

    
    public void saveIndividualInfo(){
       int smallId=0;
       int mediumId=0;
       int largeId=0;
       int microId=0;
       for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
       if(t.getTaxpayerType().equalsIgnoreCase("samll")||t.getTaxpayerType().contains("small")){
       smallId=t.getId();
       }else if(t.getTaxpayerType().equalsIgnoreCase("medium")||t.getTaxpayerType().contains("medium")){
       mediumId=t.getId();
       }else if(t.getTaxpayerType().equalsIgnoreCase("large")||t.getTaxpayerType().contains("large")){
       largeId=t.getId();
       }else if(t.getTaxpayerType().equalsIgnoreCase("micro")||t.getTaxpayerType().contains("micro")){
       microId=t.getId();
       }
       }
        if(estmatedAnnualTurnOver >=2000000&&estmatedAnnualTurnOver<12000000){
        IndividualTaxPayerType i=new IndividualTaxPayerType(individualId, microId);
     i.SaveTaxPayerType();
        }
        if(estmatedAnnualTurnOver>12000001&&estmatedAnnualTurnOver<=50000000){
           IndividualTaxPayerType i=new IndividualTaxPayerType(individualId, smallId);
     i.SaveTaxPayerType();
        }
        if(estmatedAnnualTurnOver >=50000001&&estmatedAnnualTurnOver<= 400000000){
           IndividualTaxPayerType i=new IndividualTaxPayerType(individualId, mediumId);
     i.SaveTaxPayerType();
        }
        
        if(estmatedAnnualTurnOver >=400000001){
           IndividualTaxPayerType i=new IndividualTaxPayerType(individualId, largeId);
     i.SaveTaxPayerType();
        }
        
       if(estmatedAnnualTurnOver>=20000000){
       optionVat=false;
       }else{
       optionVat=true;
       }
        //if(businessActivty==true){
      String sectorActivityParts[]=mainSectorActivity.split("#");
      for(int d=0;d<sectorActivityParts.length;d++){
      Individual_mainSectorActivity is=new Individual_mainSectorActivity(individualId,Integer.parseInt(sectorActivityParts[d]));
      is.SaveMainSectorActivity();
      }
       // }
     String taxTypeParts[]=taxTypeId.split("#");
     for(int i=0; i<taxTypeParts.length;i++){
     IndividualTaxType it=new IndividualTaxType(individualId, Integer.parseInt(taxTypeParts[i]));
     it.setOptionVat(optionVat);
     it.SaveTaxType();
     }
     //String taxPayerTypeParts[]=taxPayerTypeId.split("#");
     //for(int j=0;j<taxPayerTypeParts.length;j++){
     //IndividualTaxPayerType i=new IndividualTaxPayerType(individualId, Integer.parseInt(taxPayerTypeParts[j]));
     //i.SaveTaxPayerType();
     //}
     Individual_Activity iac=new Individual_Activity(businessActivty, estmatedAnnualTurnOver, estimatedNumberOfEmployees, accountingMethod, mainSourceOfIncome, employmentMethod, businessPremiseRented, individualId);
      iac.SaveActivity();
      Individual_Address iad=new Individual_Address(plotNo, street, sector, district, province, mailingAddress, mailHouseNo, mailStreet, mailPoBox, mailCity, mailSector, mailDistrict, mailProvince, individualId);
      iad.saveAddress();
      Individual_representative ir=new Individual_representative(taxpayerRepresentativeName, representativeTitle, representativePhoneNo, contactName, contactTitle, contactPhoneNo, individualId);
      ir.saveRepresentative();
      Individual_trade itr=new Individual_trade(mariageName, mailingAddress, mailDistrict, mailProvince, mailDistrict, street, contactPhoneNo, ownerFirstName, individualId);
      itr.saveTrade();
      Individual in=new Individual();
      in.setIndividualId(individualId);
      in.setOwnerSurname(ownerSurname);
      in.setOwnerFirstName(ownerFirstName);
    in.setDob(dob);
    in.setDeceadDate(deceadDate);
    in.setGender(gender);
   in.setOccupation(occupation);
   in.setNationality(nationality);
   in.setNationalId(nationalId);
   in.setSocialSecurityNumber(socialSecurityNumber);
   in.setPassport(passport);
   in.setHomePhone(homePhone);
   in.setWorkPhone(workPhone);
   in.setCellPhone(cellPhone);
   in.setFaxNo(faxNo);
   in.setResident(resident);
   in.setCountryOfResidence(countryOfResidence);
   in.setCivilStatus(civilStatus);
   in.setMariageName(mariageName);
   in.setMariageSurname(mariageSurname);
   in.setMariageDob(mariageDob);
   in.setPhoto(photo);
   in.setNotionalPhotocopy(notionalPhotocopy);
   in.setTinNumber(Individual.newTinNumber());
   in.setOldTinNumber(oldTinNumber);
   in.setDoneAt(doneAt);
   in.setDoneBy(doneBy);
   in.setDeRegistered(deRegistered);
   in.setInvestmentIncentives(investmentIncentives);
   in.setIncentiveStartDate(incentiveStartDate);
   in.setIncentivesExpirationDate(incentivesExpirationDate);
   in.setDocNumber(Individual.getNewDocumentId());
   in.setVatDocumentNumber(Individual.getVatNewDocumentId());
    in.UpdateIndividual();
    }
}
