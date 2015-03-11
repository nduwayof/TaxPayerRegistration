<%-- 
    Document   : signupProcess
    Created on : Mar 11, 2015, 8:51:15 AM
    Author     : SULAIMAN
--%>
<jsp:useBean id="s" class="com.djuma.Acount.Management.User" scope="request">
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
        s.createUser();
        %>
        <jsp:forward page="signup.jsp"/>
    </body>
</html>
