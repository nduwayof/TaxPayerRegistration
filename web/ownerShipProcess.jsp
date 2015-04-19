<%-- 
    Document   : ownerShipProcess
    Created on : Mar 16, 2015, 1:36:35 AM
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
 currentIndividual=(Integer)session.getAttribute("nonIndividualTicket");
}

%>
<jsp:useBean id="o" class="com.djuma.NonIndividual_Owners" scope="request">
    <jsp:setProperty name="o" property="*"/>   
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
        o.setNonIndividualId(currentIndividual);
        o.saveOwners();
        response.sendRedirect("nonindividualBanks.jsp");
        %>
    </body>
</html>
