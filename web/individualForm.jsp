<%-- 
    Document   : individualForm
    Created on : May 3, 2015, 6:57:26 PM
    Author     : Fabrice
--%>
<%@page import="com.itextpdf.text.pdf.TextField"%>
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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Individual Form</title>
    </head>
    <body>
        <%
            response.setContentType("application/pdf");
            Document document = new Document(new Rectangle(1000, 1000));
            Rectangle pagesize = new Rectangle(700f, 680f);
            //Document document = new Document(pagesize, 36f, 72f, 108f, 180f);
            document.setPageSize(pagesize);
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            Rectangle rect = document.getPageSize();
            rect.setBorder(Rectangle.BOX); // left, right, top, bottom border
            rect.setBorderWidth(19); // a width of 5 user units
            rect.setBorderColor(BaseColor.PINK); // a red border
            rect.setUseVariableBorders(true);
            document.addTitle("Individual Form");
            document.add(rect);
            document.add(rect);
            Date date = new Date();
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");
            String da = simpleDateformat.format(date);

            Font font2 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD | Font.BOLD);
            Font font3 = new Font(Font.FontFamily.HELVETICA, 15, Font.NORMAL | Font.NORMAL);
            Font font5 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD | Element.ALIGN_CENTER);

            Paragraph par = new Paragraph(new Chunk(" Individual Form ", font2));
            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);

            document.add(new Paragraph("\n"));

            Paragraph p = new Paragraph("");

            Paragraph par6 = new Paragraph("", font3);
            par6.setAlignment(Element.ALIGN_LEFT);

            PdfPTable table = new PdfPTable(1);
            table.setWidthPercentage(40);
            PdfPCell cell = new PdfPCell();
            cell.setMinimumHeight(30);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.addElement(par6);
            //PdfPTable table1 = new PdfPTable(1);
            //table1.addCell(new Phrase(new Chunk(" TaxPayers' Identification Number:  "+in.getTinNumber(), font3)));
            table.addCell(cell);
            document.add(table);

            // TextField text = new TextField(writer,rectangle, String.format("text_%s", tf));
            document.close();
        %>
    </body>
</html>
