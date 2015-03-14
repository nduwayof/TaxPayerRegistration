<%-- 
    Document   : individualProcess
    Created on : Mar 14, 2015, 9:05:25 PM
    Author     : SULAIMAN
--%>
<%
    int currentIndividual=0;
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
} else {
String userId = (String) session.getAttribute("userId");
 currentIndividual=(Integer)session.getAttribute("individualTicket");
}

%>
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
      c.setIndividualId(currentIndividual);
      c.setSectorId(1);
      c.saveIndividualInfo();
          
      %>
    </body>
</html>

