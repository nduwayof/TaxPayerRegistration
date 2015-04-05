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
    //int currentIndividual = 0;
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
     //   currentIndividual = (Integer) session.getAttribute("individualTicket");
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
        <%      
        int indvidualId=0;
        String tinNumber=request.getParameter("tinNumber");
        for(Individual i: Individual.listIndividual()){
        if(i.getTinNumber().equalsIgnoreCase(tinNumber)){
        indvidualId=i.getIndividualId();
        }
        }
            response.setContentType("application/pdf");
            Individual.getDocument(indvidualId, response.getOutputStream());
        %>
    </body>
</html>
