<%-- 
    Document   : entrepriseBranchProcess
    Created on : Mar 14, 2015, 8:09:05 PM
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
<jsp:useBean id="br" class="com.djuma.Individual.Individual_Branch" scope="request">
    <jsp:setProperty name="br" property="*"/>    
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
    br.setIndividualId(currentIndividual);
    br.saveBranch();
    response.sendRedirect("individual.jsp");
        %>
    </body>
</html>
