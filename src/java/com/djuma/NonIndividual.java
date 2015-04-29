/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djuma;

import com.djuma.NonIndividual.*;
import com.djuma.Connection.SetCon;
import com.djuma.Individual.Individual;
import com.djuma.Individual.Individual_Address;
import com.djuma.Individual.Individual_mainSectorActivity;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletOutputStream;

/**
 *
 * @author SULAIMAN
 */
public class NonIndividual {
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
    private String tinDocumentNumber="";
    private String vatDocumentNumber="";
    private String  photo="";
    private boolean deregistered=false;
    
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

    public String getTinDocumentNumber() {
        return tinDocumentNumber;
    }

    public void setTinDocumentNumber(String tinDocumentNumber) {
        this.tinDocumentNumber = tinDocumentNumber;
    }

    public String getVatDocumentNumber() {
        return vatDocumentNumber;
    }

    public void setVatDocumentNumber(String vatDocumentNumber) {
        this.vatDocumentNumber = vatDocumentNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isDeregistered() {
        return deregistered;
    }

    public void setDeregistered(boolean deregistered) {
        this.deregistered = deregistered;
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
        PreparedStatement djuma=SetCon.getCon().prepareStatement("insert into nonIndividual values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
         djuma.setString(22, tinDocumentNumber);
         djuma.setString(23, vatDocumentNumber);
         djuma.setString(24, photo);
         djuma.setBoolean(25, deregistered);
         djuma.execute();
    }catch(Exception e){
    
    }
    }
    
    public void updateNonIndividual(){
    try{
        PreparedStatement djuma=SetCon.getCon().prepareStatement("update nonIndividual set enterpriseType=?, incBenefitsInvestment=?, noOfExpiration=?, expirationDate=?, registeredName=?, registrationDate=?, comRegistrationNo=?, resident=?, countryOfResidence=?, entrepriseEmail=?, nssfRegistrationNo=?, entreprisePhoneNo=?, entrepriseFaxNo=?, startDate=?, noOfShares=?, sharesValue=?, hasInfo=?, oldTinNumber=?, doneAt=?, doneBy=?, tinNumber=?, tinDocumentNumber=?, vatDocumentNumber=?, photo=?, deregistered=?  where id=?");
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
         djuma.setString(22, tinDocumentNumber);
         djuma.setString(23, vatDocumentNumber);
         djuma.setString(24, photo);
         djuma.setBoolean(25, false);
         djuma.setInt(26, nonIndividualId);
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
        n.setTinDocumentNumber(rs.getString(23));
        n.setVatDocumentNumber(rs.getString(24));
        n.setPhoto(rs.getString(25));
        n.setDeregistered(rs.getBoolean(26));
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
            newTinNumber="TIN/NIN/00000001";
            msg=newTinNumber;
      }else{
       lastTinNumber=lastTinNumber.substring(8);
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
            msg="TIN/NIN/"+newTinNumber;
        }
    
    return msg;
    
    }
   
   public static String getVatNewDocumentId(){
   String id="";
   String lastDocNumber="";
   for(NonIndividual in: NonIndividual.listNonIndividual()){
       if(in.isHasInfo()&&in.isDeregistered()==false){
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
   public static String getTinNewDocumentId(){
   String id="";
   String lastDocNumber="";
   for(NonIndividual in: NonIndividual.listNonIndividual()){
       if(in.isHasInfo()&&in.isDeregistered()==false){
   lastDocNumber=in.getTinDocumentNumber();
       }
   }
   if(lastDocNumber.equalsIgnoreCase("")){
   id="1";
   }else{
   id=((Integer.parseInt(lastDocNumber))+1)+"";
   }
   return id;
   }
   
   public static void saveNonIndividualPhoto(int nonIndividualId, String photo){
   
   try{
   PreparedStatement djuma=SetCon.getCon().prepareStatement("update nonindividual set photo=?,hasInfo=? where id=?");
   djuma.setString(1, photo);
   djuma.setBoolean(2, true);
   djuma.setInt(3, nonIndividualId);
   djuma.execute();
   }catch(Exception e){
   
   }
   }
   
      public static Document getDocument(int nonIndividualId, ServletOutputStream s) throws DocumentException{
 
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
            Font font3 = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL | Font.NORMAL);
            Font font5 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD | Element.ALIGN_CENTER);

            Paragraph par = new Paragraph(new Chunk(" Notice of Registration ", font2));
            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);
            Paragraph par1 = new Paragraph(new Chunk("( Under the Law... Section ... )", font3));
            par1.setAlignment(Element.ALIGN_CENTER);
            document.add(par1);
            document.add(new Paragraph("\n"));

            try {
                for (NonIndividual in : NonIndividual.listNonIndividual()) {
                    if (in.getNonIndividualId() == (nonIndividualId)) {
           Image image = Image.getInstance("/Users//SULAIMAN//NetBeansProjects//TaxPayerRegistration//build//web\\"+in.getPhoto());
                        image.setAlignment(Element.ALIGN_LEFT);
                       // image.setAbsolutePosition(50f, 50f);
                        image.scaleAbsolute(150, 90);
                        image.setBorderWidth(40);
                       // image.setWidthPercentage(widthPercentage);
                        document.add((Element) image);

                        Paragraph par2 = new Paragraph(new Chunk(" Registered Name:  " + in.getRegisteredName(), font3));
                        par2.setAlignment(Element.ALIGN_LEFT);
                        document.add(par2);
                        //document.add(new Paragraph("\n"));
                        Paragraph par21 = new Paragraph(new Chunk(" Enterprise Type:  " + in.getEnterpriseType(), font3));
                        par21.setAlignment(Element.ALIGN_LEFT);
                        document.add(par21);
                        document.add(new Paragraph("\n"));
                        
                         Paragraph par41 = new Paragraph(new Chunk(" Business Activity:  ", font3));
                        par41.setAlignment(Element.ALIGN_LEFT);
                        document.add(par41);
                        for(NonIndividual_mainSectorActivity i: NonIndividual_mainSectorActivity.list()){
                            if(i.getNonIndividualId()==nonIndividualId){
                                for(Sector se: Sector.listSector()){
                                    if(se.getId()==i.getSectorId()){
                                        for(Industry id:Industry.listIndistry()){
                                            if(id.getId()==se.getIndustryId()){
                        Paragraph par3 = new Paragraph(new Chunk(""+id.getName()+" - "+se.getName(), font3));
                        par3.setAlignment(Element.ALIGN_LEFT);
                        document.add(par3);
                        }
                                        }
                                    }
                                }
                        }
                        }
                        document.add(new Paragraph("\n"));
                        Paragraph par42 = new Paragraph(new Chunk(" Tax Center:  ", font3));
                        par42.setAlignment(Element.ALIGN_LEFT);
                        document.add(par42);
                        for(NonIndividual_Address a: NonIndividual_Address.list()){
                            if(a.getNonIndividualId()==in.getNonIndividualId()){
                        Paragraph par4 = new Paragraph(new Chunk(""+a.getProvince()+" - "+a.getDistrict(), font3));
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

                        Paragraph par9 = new Paragraph(new Chunk(" Doc Number:  " + in.getTinDocumentNumber(), font3));
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
   
   
}
