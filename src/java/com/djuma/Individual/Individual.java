/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import java.sql.PreparedStatement;
import com.djuma.Connection.SetCon;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.*;

/**
 *
 * @author SULAIMAN
 */
public class Individual {

    private int individualId;
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
   private String resident="";
   private String countryOfResidence="";
   private String civilStatus="";
   private String mariageName="";
   private String mariageSurname="";
   private String mariageDob="";
   private String photo="";
   private String notionalPhotocopy="";
   private boolean hasInfo;
   private String tinNumber="";
   private String oldTinNumber="";
  private Timestamp doneAt=new Timestamp(new Date().getTime());
  private String doneBy="";
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

    public boolean isHasInfo() {
        return hasInfo;
    }

    public void setHasInfo(boolean hasInfo) {
        this.hasInfo = hasInfo;
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

    public Individual() {
    }

    public Individual(String ownerSurname, String ownerFirstName, String dob, String deceadDate, String gender, String occupation, String nationality, String nationalId, String socialSecurityNumber, String passport, String homePhone, String workPhone, String cellPhone, String faxNo, String resident, String countryOfResidence, String civilStatus, String mariageName, String mariageSurname, String mariageDob, String photo, String notionalPhotocopy) {
        this.ownerSurname = ownerSurname;
        this.ownerFirstName = ownerFirstName;
        this.dob = dob;
        this.deceadDate = deceadDate;
        this.gender = gender;
        this.occupation = occupation;
        this.nationality = nationality;
        this.nationalId = nationalId;
        this.socialSecurityNumber = socialSecurityNumber;
        this.passport = passport;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.cellPhone = cellPhone;
        this.faxNo = faxNo;
        this.resident = resident;
        this.countryOfResidence = countryOfResidence;
        this.civilStatus = civilStatus;
        this.mariageName = mariageName;
        this.mariageSurname = mariageSurname;
        this.mariageDob = mariageDob;
        this.photo = photo;
        this.notionalPhotocopy = notionalPhotocopy;
    }
   
    public void SaveIndividual(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        djuma.setString(1, ownerSurname);
        djuma.setString(2, ownerFirstName);
        djuma.setString(3, dob);
        djuma.setString(4, deceadDate);
        djuma.setString(5, gender);
        djuma.setString(6, occupation);
        djuma.setString(7, nationality);
        djuma.setString(8, nationalId);
        djuma.setString(9, socialSecurityNumber);
        djuma.setString(10, passport);
        djuma.setString(11, homePhone);
        djuma.setString(12, workPhone);
        djuma.setString(13, cellPhone);
        djuma.setString(14, faxNo);
        if(resident.equalsIgnoreCase("1")){
        djuma.setBoolean(15, true);
        }else{
        djuma.setBoolean(15, false);
        }
        djuma.setString(16, countryOfResidence);
        djuma.setString(17, civilStatus);
        djuma.setString(18, mariageName);
        djuma.setString(19, mariageSurname);
        djuma.setString(20, mariageDob);
        djuma.setString(21, photo);
        djuma.setString(22, notionalPhotocopy);
        djuma.setBoolean(23, false);
        djuma.setString(24, tinNumber);
        djuma.setString(25, oldTinNumber);
        djuma.setTimestamp(26, doneAt);
        djuma.setString(27, doneBy);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
    
    public void UpdateIndividual(){
    try{
       PreparedStatement djuma=SetCon.getCon().prepareStatement("update individual set ownerSurname=?,ownerFirstName=?,dob=?,deceadDate=?,gender=?,occupatio=?,nationality=?,nationalId=?,socialSecurityNumber=?,passport=?,homePhone=?,workPhone=?,cellPhone=?,faxNo=?,resident=?,countryOfResidence=?,civilStatus=?,mariageName=?,mariageSurname=?,mariageDob=?,photo=?,notionalPhotocopy=?,hasInfo=?,tinNumber=?,oldTinNumber=?,doneAt=?,doneBy=? where id=?");
        djuma.setString(1, ownerSurname);
        djuma.setString(2, ownerFirstName);
        djuma.setString(3, dob);
        djuma.setString(4, deceadDate);
        djuma.setString(5, gender);
        djuma.setString(6, occupation);
        djuma.setString(7, nationality);
        djuma.setString(8, nationalId);
        djuma.setString(9, socialSecurityNumber);
        djuma.setString(10, passport);
        djuma.setString(11, homePhone);
        djuma.setString(12, workPhone);
        djuma.setString(13, cellPhone);
        djuma.setString(14, faxNo);
        if(resident.equalsIgnoreCase("1")){
        djuma.setBoolean(15, true);
        }else{
        djuma.setBoolean(15, false);
        }
        djuma.setString(16, countryOfResidence);
        djuma.setString(17, civilStatus);
        djuma.setString(18, mariageName);
        djuma.setString(19, mariageSurname);
        djuma.setString(20, mariageDob);
        djuma.setString(21, photo);
        djuma.setString(22, notionalPhotocopy);
        djuma.setBoolean(23, true);
        djuma.setString(24, tinNumber);
        djuma.setString(25, oldTinNumber);
        djuma.setTimestamp(26, doneAt);
        djuma.setString(27, doneBy);
        djuma.setInt(28, individualId);
        djuma.execute();
    }catch(Exception e){
    
    } 
    }
    
    public static List<Individual>listIndividual(){
    List<Individual>list=new ArrayList<Individual>();
    try{
    PreparedStatement djuma=SetCon.getCon().prepareStatement("select * from individual");
        ResultSet rs=djuma.executeQuery();
        while(rs.next()){
        Individual in=new Individual();
        in.setIndividualId(rs.getInt(1));
        in.setOwnerSurname(rs.getString(2));
        in.setOwnerFirstName(rs.getString(3));
        in.setDob(rs.getString(4));
        in.setDeceadDate(rs.getString(5));
        in.setGender(rs.getString(6));
        in.setOccupation(rs.getString(7));
        in.setNationality(rs.getString(8));
        in.setNationalId(rs.getString(9));
        in.setSocialSecurityNumber(rs.getString(10));
        in.setPassport(rs.getString(11));
        in.setHomePhone(rs.getString(12));
        in.setWorkPhone(rs.getString(13));
        in.setCellPhone(rs.getString(14));
        in.setFaxNo(rs.getString(15));
        if(rs.getBoolean(16)==false){
        in.setResident("NO");
        }else{
        in.setResident("YES");
        }
        in.setCountryOfResidence(rs.getString(17));
        in.setCivilStatus(rs.getString(18));
        in.setMariageName(rs.getString(19));
        in.setMariageSurname(rs.getString(20));
        in.setMariageDob(rs.getString(21));
        in.setPhoto(rs.getString(22));
        in.setNotionalPhotocopy(rs.getString(23));
        in.setHasInfo(rs.getBoolean(24));
        in.setTinNumber(rs.getString(25));
        in.setOldTinNumber(rs.getString(26));
        in.setDoneAt(rs.getTimestamp(27));
        in.setDoneBy(rs.getString(28));
        list.add(in);
        }
    }catch(Exception e){
    
    }
    return list;
    }
   public static int getLastTicket(){
   int i=0;
   for(Individual in: Individual.listIndividual()){
   i=in.getIndividualId();
   }
   return i;
   }
   public static boolean createNewTicket(int lastTicket){
   boolean check=true;
   for(Individual in:Individual.listIndividual()){
   if(in.getIndividualId()==lastTicket){
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
    for(Individual d: Individual.listIndividual()){
        if(d.isHasInfo()){
   lastTinNumber=d.getTinNumber();
        }
    }
    
    if(lastTinNumber.equalsIgnoreCase("")){
            newTinNumber="TIN/IN/0001";
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
            msg="TIN/IN/"+newTinNumber;
        }
    
    return msg;
    
    }
}
