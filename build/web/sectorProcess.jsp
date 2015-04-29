<%-- 
    Document   : sectorProcess
    Created on : Apr 1, 2015, 4:31:30 PM
    Author     : SULAIMAN
--%>
<jsp:useBean id="s" class="com.djuma.Sector.Sector" scope="request">
    <jsp:setProperty name="s" property="*"/>
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
        s.saveSector();
        response.sendRedirect("sector.jsp");
        %>
        
    </body>
</html>
