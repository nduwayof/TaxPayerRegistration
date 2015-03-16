<%-- 
    Document   : bankProcess1
    Created on : Mar 16, 2015, 1:34:45 AM
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
<jsp:useBean id="b" class="com.djuma.NonIndividual_Bank" scope="request">
    <jsp:setProperty name="b" property="*"/>
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
        b.setNonIndividualId(currentIndividual);
        b.SaveBank();
        response.sendRedirect("nonIndividual.jsp");
        %>
    </body>
</html>
