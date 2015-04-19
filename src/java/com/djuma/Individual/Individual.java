/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma.Individual;

import java.sql.PreparedStatement;
import com.djuma.Connection.SetCon;
import com.djuma.Sector.Industry;
import com.djuma.Sector.Sector;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.ServletOutputStream;

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
  private String docNumber="";
  private boolean deRegistered=false;
  private String investmentIncentives;
  private String incentiveStartDate="";
 private String incentivesExpirationDate="";
 private String vatDocumentNumber="";
  
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

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public boolean isDeRegistered() {
        return deRegistered;
    }

    public void setDeRegistered(boolean deRegistered) {
        this.deRegistered = deRegistered;
    }

    public String getInvestmentIncentives() {
        return investmentIncentives;
    }

    public void setInvestmentIncentives(String investmentIncentives) {
        this.investmentIncentives = investmentIncentives;
    }

    public String getIncentiveStartDate() {
        return incentiveStartDate;
    }

    public void setIncentiveStartDate(String incentiveStartDate) {
        this.incentiveStartDate = incentiveStartDate;
    }

    public String getIncentivesExpirationDate() {
        return incentivesExpirationDate;
    }

    public void setIncentivesExpirationDate(String incentivesExpirationDate) {
        this.incentivesExpirationDate = incentivesExpirationDate;
    }

    public String getVatDocumentNumber() {
        return vatDocumentNumber;
    }

    public void setVatDocumentNumber(String vatDocumentNumber) {
        this.vatDocumentNumber = vatDocumentNumber;
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
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into individual values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
        djuma.setString(28, docNumber);
        djuma.setBoolean(29, deRegistered);
        djuma.setString(30, investmentIncentives);
        djuma.setString(31, incentiveStartDate);
        djuma.setString(32, incentivesExpirationDate);
        djuma.setString(33, vatDocumentNumber);
        djuma.execute();
    }catch(Exception e){
    
    }
    
    }
    
    public void UpdateIndividual(){
    try{
       PreparedStatement djuma=SetCon.getCon().prepareStatement("update individual set ownerSurname=?,ownerFirstName=?,dob=?,deceadDate=?,gender=?,occupatio=?,nationality=?,nationalId=?,socialSecurityNumber=?,passport=?,homePhone=?,workPhone=?,cellPhone=?,faxNo=?,resident=?,countryOfResidence=?,civilStatus=?,mariageName=?,mariageSurname=?,mariageDob=?,photo=?,notionalPhotocopy=?,hasInfo=?,tinNumber=?,oldTinNumber=?,doneAt=?,doneBy=?, docNumber=?, deRegistered=?, investmentIncentives=?,incentiveStartDate=?, incentivesExpirationDate=?, vatDocumentNumber=? where id=?");
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
        djuma.setString(28, docNumber);
        djuma.setBoolean(29, deRegistered);
        djuma.setString(30, investmentIncentives);
        djuma.setString(31, incentiveStartDate);
        djuma.setString(32, incentivesExpirationDate);
        djuma.setString(33, vatDocumentNumber);
        djuma.setInt(34, individualId);
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
        in.setDocNumber(rs.getString(29));
        in.setDeRegistered(rs.getBoolean(30));
        in.setInvestmentIncentives(rs.getString(31));
        in.setIncentiveStartDate(rs.getString(32));
        in.setIncentivesExpirationDate(rs.getString(33));
        in.setVatDocumentNumber(rs.getString(34));
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
            newTinNumber="TIN/IN/00000001";
            msg=newTinNumber;
      }else{
       lastTinNumber=lastTinNumber.substring(7);
            if (lastTinNumber.length() == 8 && lastTinNumber.substring(0, 7).equalsIgnoreCase("0000000") && Integer.parseInt(lastTinNumber.substring(7)) < 9) {
                                                                                newTinNumber = "0000000" + ((Integer.parseInt(lastTinNumber.substring(7))) + 1);
            }else if(lastTinNumber.length() ==8 && lastTinNumber.substring(0, 7).equalsIgnoreCase("0000000") && Integer.parseInt(lastTinNumber.substring(7)) == 9){
                                                                                newTinNumber = "000000" + ((Integer.parseInt(lastTinNumber.substring(7))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 6).equalsIgnoreCase("000000") && Integer.parseInt(lastTinNumber.substring(6)) < 99){
                                                                                newTinNumber = "000000" + ((Integer.parseInt(lastTinNumber.substring(6))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 6).equalsIgnoreCase("000000") && Integer.parseInt(lastTinNumber.substring(6)) == 99){
                                                                                newTinNumber = "00000" + ((Integer.parseInt(lastTinNumber.substring(6))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 5).equalsIgnoreCase("00000") && Integer.parseInt(lastTinNumber.substring(5)) < 999){
                                                                                newTinNumber = "00000" + ((Integer.parseInt(lastTinNumber.substring(5))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 7).equalsIgnoreCase("00000") && Integer.parseInt(lastTinNumber.substring(5)) == 999){
                                                                                newTinNumber = "0000" + ((Integer.parseInt(lastTinNumber.substring(5))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 4).equalsIgnoreCase("0000") && Integer.parseInt(lastTinNumber.substring(4)) < 9999){
                                                                                newTinNumber = "0000" + ((Integer.parseInt(lastTinNumber.substring(4))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 4).equalsIgnoreCase("0000") && Integer.parseInt(lastTinNumber.substring(4)) == 9999){
                                                                                newTinNumber = "000" + ((Integer.parseInt(lastTinNumber.substring(4))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 3).equalsIgnoreCase("000") && Integer.parseInt(lastTinNumber.substring(3)) < 99999){
                                                                                newTinNumber = "000" + ((Integer.parseInt(lastTinNumber.substring(3))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 3).equalsIgnoreCase("000") && Integer.parseInt(lastTinNumber.substring(3)) == 99999){
                                                                                newTinNumber = "00" + ((Integer.parseInt(lastTinNumber.substring(3))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 2).equalsIgnoreCase("00") && Integer.parseInt(lastTinNumber.substring(2)) < 999999){
                                                                                newTinNumber = "00" + ((Integer.parseInt(lastTinNumber.substring(2))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 2).equalsIgnoreCase("00") && Integer.parseInt(lastTinNumber.substring(2)) == 999999){
                                                                                newTinNumber = "0" + ((Integer.parseInt(lastTinNumber.substring(2))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 1).equalsIgnoreCase("0") && Integer.parseInt(lastTinNumber.substring(1)) < 9999999){
                                                                                newTinNumber = "0" + ((Integer.parseInt(lastTinNumber.substring(1))) + 1);
            }else if(lastTinNumber.length() == 8 && lastTinNumber.substring(0, 1).equalsIgnoreCase("0") && Integer.parseInt(lastTinNumber.substring(1)) == 9999999){
                                                                                newTinNumber = "" + ((Integer.parseInt(lastTinNumber.substring(1))) + 1);
                                                                                      newTinNumber = "" + ((Integer.parseInt(lastTinNumber.substring(1))) + 1);
            }  else {
                newTinNumber = "" + ((Integer.parseInt(lastTinNumber)) + 1);
            }
            msg="TIN/IN/"+newTinNumber;
        }
    
    return msg;
    
    }
   
   public static String getNewDocumentId(){
   String id="";
   String lastDocNumber="";
   for(Individual in: Individual.listIndividual()){
       if(in.isHasInfo()&&in.isDeRegistered()==false){
   lastDocNumber=in.getDocNumber();
       }
   }
   if(lastDocNumber.equalsIgnoreCase("")){
   id="1";
   }else{
   id=((Integer.parseInt(lastDocNumber))+1)+"";
   }
   return id;
   }
   
   
   public static String getVatNewDocumentId(){
   String id="";
   String lastDocNumber="";
   for(Individual in: Individual.listIndividual()){
       if(in.isHasInfo()&&in.isDeRegistered()==false){
   lastDocNumber=in.getVatDocumentNumber();
       }
   }
   if(lastDocNumber.equalsIgnoreCase("")){
   id="10";
   }else{
   id=((Integer.parseInt(lastDocNumber))+1)+"";
   }
   return id;
   }
   
   public static Document getDocument(int individualId, ServletOutputStream s) throws DocumentException{
 
 //           response.setContentType("application/pdf");
            Document document = new Document(new Rectangle(1000, 1000));
        Rectangle pagesize = new Rectangle(700f, 590f);
        //Document document = new Document(pagesize, 36f, 72f, 108f, 180f);
            document.setPageSize(pagesize);
            PdfWriter.getInstance(document, s);
            document.open();
            Rectangle rect = document.getPageSize();
            rect.setBorder(Rectangle.BOX); // left, right, top, bottom border
            rect.setBorderWidth(19); // a width of 5 user units
            rect.setBorderColor(BaseColor.CYAN); // a red border
            rect.setUseVariableBorders(true);
            document.addTitle("TIN Certificate");
            document.add(rect);
            Date date = new Date();
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");
            String da = simpleDateformat.format(date);

            Font font2 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD | Font.BOLD);
            Font font3 = new Font(Font.FontFamily.HELVETICA, 15, Font.NORMAL | Font.NORMAL);
            Font font5 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD | Element.ALIGN_CENTER);

            Paragraph par = new Paragraph(new Chunk(" Notice of Registration ", font2));
            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);
            Paragraph par1 = new Paragraph(new Chunk("( Under the Law... Section ... )", font3));
            par1.setAlignment(Element.ALIGN_CENTER);
            document.add(par1);
            document.add(new Paragraph("\n"));

            try {
                for (Individual in : Individual.listIndividual()) {
                    if (in.getIndividualId() == (individualId)) {
           Image image = Image.getInstance("/Users//SULAIMAN//NetBeansProjects//TaxPayerRegistration//build//web\\"+in.getPhoto());
                        image.setAlignment(Element.ALIGN_LEFT);
                       // image.setAbsolutePosition(50f, 50f);
                        image.scaleAbsolute(150, 90);
                        image.setBorderWidth(40);
                       // image.setWidthPercentage(widthPercentage);
                        document.add((Element) image);

                        Paragraph par2 = new Paragraph(new Chunk(" Names:  " + in.getOwnerSurname() + " " + in.getOwnerFirstName(), font3));
                        par2.setAlignment(Element.ALIGN_LEFT);
                        document.add(par2);
                        document.add(new Paragraph("\n"));
                         
                        for(Individual_mainSectorActivity i: Individual_mainSectorActivity.list()){
                            if(i.getIndividualId()==in.getIndividualId()){
                                for(Sector se: Sector.listSector()){
                                    if(se.getId()==i.getSectorId()){
                                        for(Industry id:Industry.listIndistry()){
                                            if(id.getId()==se.getIndustryId()){
                        Paragraph par3 = new Paragraph(new Chunk(" Business Activity:  "+id.getName()+" - "+se.getName(), font3));
                        par3.setAlignment(Element.ALIGN_LEFT);
                        document.add(par3);
                        }
                                        }
                                    }
                                }
                        }
                        }
                        document.add(new Paragraph("\n"));
                        for(Individual_Address a: Individual_Address.listOfIndividualAddress()){
                            if(a.getIndividualId()==in.getIndividualId()){
                        Paragraph par4 = new Paragraph(new Chunk(" Tax Center:  "+a.getProvince()+" - "+a.getDistrict(), font3));
                        par4.setAlignment(Element.ALIGN_LEFT);
                        document.add(par4);
                        }
                        }
                        document.add(new Paragraph("\n"));
                        Paragraph par5 = new Paragraph(new Chunk(" is registered for tax purposes and assigned :  ", font3));
                        par5.setAlignment(Element.ALIGN_LEFT);
                        document.add(par5);
                        document.add(new Paragraph("\n"));
                        Paragraph par6 = new Paragraph(" TaxPayers' Identification Number:  " + in.getTinNumber(), font3);
                        par6.setAlignment(Element.ALIGN_CENTER);
            //document.add(par6);
            //document.add(new Paragraph("\n"));
            
            PdfPTable table = new PdfPTable(1);
            table.setWidthPercentage(40);
            PdfPCell cell = new PdfPCell();
            //cell.setFixedHeight(20f);
            cell.setMinimumHeight(40);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.addElement(par6);

            //PdfPTable table1 = new PdfPTable(1);
                        //table1.addCell(new Phrase(new Chunk(" TaxPayers' Identification Number:  "+in.getTinNumber(), font3)));
                        table.addCell(cell);
                        document.add(table);

                        Paragraph par7 = new Paragraph(new Chunk(" With effect from :  " + da, font3));
                        par7.setAlignment(Element.ALIGN_LEFT);
                        document.add(par7);
                        document.add(new Paragraph("\n"));
                        Paragraph par8 = new Paragraph(new Chunk(" Signed:  ", font3));
                        par8.setAlignment(Element.ALIGN_LEFT);
                        document.add(par8);
                        document.add(new Paragraph("\n"));
                        document.add(new Paragraph("\n"));

                        Paragraph par9 = new Paragraph(new Chunk(" Doc Number:  " + in.getDocNumber(), font3));
                        par9.setAlignment(Element.ALIGN_RIGHT);
                        document.add(par9);
                        document.add(new Paragraph("\n"));
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            document.close();
            return  document;
   }
   
   public static void saveIndividualPhoto(int individualId, String photo){
   try{
   PreparedStatement djuma=SetCon.getCon().prepareStatement("update individual set photo=?,hasInfo=? where id=?");
   djuma.setString(1, photo);
   djuma.setBoolean(2, true);
   djuma.setInt(3, individualId);
   djuma.execute();
   }catch(Exception e){
   
   }
   }
}
