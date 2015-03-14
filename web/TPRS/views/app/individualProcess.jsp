<%-- 
    Document   : individualProcess
    Created on : Mar 14, 2015, 4:43:35 PM
    Author     : SULAIMAN
--%>
<%@page import="com.djuma.Individual.Individual"%>
<jsp:useBean id="c" class="com.djuma.Individual.CommonIndividual" scope="request">
    <jsp:setProperty name="c" property="*"/>
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
          c.setSectorId(1);
      c.saveIndividualInfo();
          //out.println((Integer)session.getAttribute("individualTicket"));
          //out.println(Individual.getLastTicket());
      %>
    </body>
</html>
