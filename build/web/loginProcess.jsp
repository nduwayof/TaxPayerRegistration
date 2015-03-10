<%-- 
    Document   : process
    Created on : Mar 9, 2015, 9:11:51 PM
    Author     : SULAIMAN
--%>
<jsp:useBean id="lo" class="com.djuma.Acount.Management.Login" scope="request">
    <jsp:setProperty name="lo" property="*"/>
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
                String msg=lo.getLoggedIn();
                String parts[]=msg.split("#");
                if(parts[0].equalsIgnoreCase("Success")){
                    session.setAttribute("userRole", parts[1]);
                    session.setAttribute("userId", parts[2]);
                response.sendRedirect("index.jsp");
                }else{
                    %>
                    <jsp:forward page="login.jsp"/>
                  <%
                }
                %>  
    </body>
</html>
