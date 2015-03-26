<%-- 
    Document   : bankProcess
    Created on : Mar 14, 2015, 8:13:47 PM
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
<jsp:useBean id="b" class="com.djuma.Individual.Individual_Bank" scope="request">
    <jsp:setProperty name="b" property="*" />    
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
    b.setIndividualId(currentIndividual);
    b.SaveBank();
    response.sendRedirect("TPRS/views/app/steps/five.jsp");
        %>
    </body>
</html>
