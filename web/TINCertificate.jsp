<%-- 
    Document   : VATCertificate
    Created on : Mar 20, 2015, 12:30:02 PM
    Author     : SULAIMAN
--%>
<%@page import="com.djuma.Individual.IndividualTaxPayerType"%>
<%@page import="com.djuma.Individual.Individual"%>
<%@page import="com.djuma.Tax.TaxPayerType"%>
<%@page import="com.djuma.Acount.Management.User"%>
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
<%
    int currentIndividual = 0;
    String names = "";
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
    } else {
        String userId = (String) session.getAttribute("userId");
        for (User u : User.listUser()) {
            if (u.getId() == Integer.parseInt(userId)) {
                names = u.getFirstName() + " " + u.getLastName();
            }
        }
        currentIndividual = (Integer) session.getAttribute("individualTicket");
    }

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TIN CERTIFICATE</title>
    </head>
    <body>
        <%            response.setContentType("application/pdf");
            Document document = new Document(new Rectangle(1000, 1000));
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            Rectangle rect = document.getPageSize();
            rect.setBorder(Rectangle.BOX); // left, right, top, bottom border
            rect.setBorderWidth(5); // a width of 5 user units
            rect.setBorderColor(BaseColor.RED); // a red border
            rect.setUseVariableBorders(true);
            document.addTitle("TIN Certificate");

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
                    if (in.getIndividualId() == (currentIndividual-1)) {
          // Image image = Image.getInstance("/Users//SULAIMAN//NetBeansProjects//TaxPayerRegistration//build//web\\"+in.getPhoto());
                        //image.setAlignment(Element.ALIGN_LEFT);
                        //image.setAbsolutePosition(50f, 50f);
                        //image.scaleAbsolute(150, 90);
                        //image.setBorderWidth(40);
                        //image.setWidthPercentage(widthPercentage);
                        //document.add((Element) image);

                        Paragraph par2 = new Paragraph(new Chunk(" Names:  " + in.getOwnerSurname() + " " + in.getOwnerFirstName(), font3));
                        par2.setAlignment(Element.ALIGN_LEFT);
                        document.add(par2);
                        document.add(new Paragraph("\n"));

                        Paragraph par3 = new Paragraph(new Chunk(" Business Activity:  ", font3));
                        par3.setAlignment(Element.ALIGN_LEFT);
                        document.add(par3);
                        document.add(new Paragraph("\n"));

                        Paragraph par4 = new Paragraph(new Chunk(" Tax Center:  ", font3));
                        par4.setAlignment(Element.ALIGN_LEFT);
                        document.add(par4);
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
        %>
    </body>
</html>
