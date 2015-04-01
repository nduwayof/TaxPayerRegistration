<%-- 
    Document   : industryProcess
    Created on : Apr 1, 2015, 2:54:33 PM
    Author     : SULAIMAN
--%>
<jsp:useBean id="in" class="com.djuma.Sector.Industry" scope="request">
    <jsp:setProperty name="in" property="*"/>    
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        in.saveIndustry();
        response.sendRedirect("industry.jsp");
        %>       
    </body>
</html>
