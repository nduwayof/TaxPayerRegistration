<%-- 
    Document   : SizeOfTaxReport
    Created on : Apr 5, 2015, 1:00:33 AM
    Author     : SULAIMAN
--%>

<%@page import="java.sql.Timestamp"%>
<%@page import="com.djuma.Individual.Individual_Activity"%>
<%@page import="com.djuma.Individual.IndividualTaxType"%>
<%@page import="com.djuma.Tax.TaxType"%>
<%@page import="com.djuma.Individual.Individual_mainSectorActivity"%>
<%@page import="com.djuma.Sector.Sector"%>
<%@page import="com.djuma.Sector.Industry"%>
<%@page import="com.djuma.Individual.Individual_representative"%>
<%@page import="com.djuma.Individual.Individual"%>
<%@page import="com.djuma.Tax.TaxPayerType"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.awt.Color"%>
<%@page import="com.itextpdf.text.FontFactory"%>
<%@page import="com.itextpdf.text.BaseColor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page import="com.itextpdf.text.Image"%>
<%@page import="com.itextpdf.text.Chunk"%>
<%@page import="com.itextpdf.text.Font"%>
<%@page import="com.itextpdf.text.Rectangle"%>
<%@page import="com.itextpdf.text.pdf.draw.LineSeparator"%>
<%@page import="com.itextpdf.text.Element"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="com.itextpdf.text.Phrase"%>
<%@page import="com.itextpdf.text.pdf.PdfPCell"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="com.itextpdf.text.pdf.PdfPTable"%>
<%@page import="com.itextpdf.text.PageSize"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String value=request.getParameter("year");
            String from=request.getParameter("from");
            String to=request.getParameter("to");
            SimpleDateFormat j=new SimpleDateFormat("yyyy-MM-dd");
            Date from1=j.parse(from);
            Date to1=j.parse(to);
            
            response.setContentType("application/pdf");
            Document document = new Document(new Rectangle(1000, 1000));
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
             
            Date date = new Date();
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");
            String da = simpleDateformat.format(date);
          //  String itn = request.getParameter("itnm");
           // String title=itn.toUpperCase();
            Font font2 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD | Font.UNDERLINE);
            Font font5 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD | Element.ALIGN_CENTER );
           // Image image = Image.getInstance("C:\\Users\\Joe\\Desktop\\my web  projects\\StockTest\\web\\images\\pih.jpg");
           
           //image.scaleAbsolute(400, 50);

            //document.add((Element) image);
           
            Paragraph par = new Paragraph(new Chunk( " "+   "Report of Registered Business from "+from1+" to " + to1 , font2));
            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));

            PdfPTable tablee = new PdfPTable(5);
             
            tablee.setWidthPercentage(100);
            PdfPTable tablee1 = new PdfPTable(1);
            tablee1.addCell(new Phrase(new Chunk(" Surname ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee2 = new PdfPTable(1);
            tablee2.addCell(new Phrase(new Chunk(" First Name ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee3 = new PdfPTable(1);
            tablee3.addCell(new Phrase(new Chunk(" TIN NUMBER ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee4 = new PdfPTable(1);
            tablee4.addCell(new Phrase(new Chunk(" NATIONALITY ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee5 = new PdfPTable(1);
            tablee5.addCell(new Phrase(new Chunk(" Representative Name ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
 
        
            tablee.addCell(tablee1);
            tablee.addCell(tablee2);
            tablee.addCell(tablee3);
            tablee.addCell(tablee4);
            tablee.addCell(tablee5);
            document.add(tablee);
     
            int i = 0;
            try {
              //  String itnm = request.getParameter("username");
                
                
                for(Individual in: Individual.listIndividual()) {
                    Date d1=j.parse(in.getDoneAt().toString());
                   if(d1.getTime()>=from1.getTime()&&d1.getTime()<=to1.getTime()&&in.isHasInfo()&&in.isDeRegistered()==false){
                    PdfPTable table = new PdfPTable(5);
                    table.setWidthPercentage(100);
                    
                   
                    i = i + 1;
                    PdfPTable table1 = new PdfPTable(1);
                    table1.addCell(new Phrase(new Chunk(in.getOwnerSurname(), FontFactory.getFont(FontFactory.TIMES_BOLD, 9, Font.BOLD, BaseColor.BLACK))));
                    

                    PdfPTable table2 = new PdfPTable(1);
                    table2.addCell(new Phrase(new Chunk(in.getOwnerFirstName(), font5)));

                    PdfPTable table3 = new PdfPTable(1);
                    table3.addCell(new Phrase(new Chunk(in.getTinNumber(), font5)));

                    PdfPTable table4 = new PdfPTable(1);
                    table4.addCell(new Phrase(new Chunk(in.getNationality(), font5)));
                      PdfPTable table5 = new PdfPTable(1);
                   for(Individual_representative ir:Individual_representative.list()){
                         if(ir.getIndividualId()==in.getIndividualId()){
                    table5.addCell(new Phrase(new Chunk(ir.getTaxpayerRepresentativeName(), font5)));
                     }
                     }
                    
                    table.addCell(table1);
                    table.addCell(table2);
                    table.addCell(table3);
                    table.addCell(table4);
                    table.addCell(table5);
                    document.add(table);
                }
                }
                   
                
               
            } catch (Exception e) {
                e.printStackTrace();
            }
            PdfPTable tableee = new PdfPTable(2);
            tablee.setWidthPercentage(100);
            PdfPTable tableee1 = new PdfPTable(1);
            tableee1.addCell(new Phrase(new Chunk("Total   ", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, Font.BOLD, BaseColor.BLUE))));
            PdfPTable tableee2 = new PdfPTable(1);
            tableee2.addCell(new Phrase(new Chunk(i+"      ", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, Font.BOLD, BaseColor.BLUE))));
            tableee.addCell(tableee1);
            tableee.addCell(tableee2);
            document.add(tableee);
            document.close();
        %>
    </body>
</html>
