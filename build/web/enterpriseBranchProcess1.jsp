<%-- 
    Document   : enterpriseBranchProcess1
    Created on : Mar 16, 2015, 1:35:48 AM
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
<jsp:useBean id="br" class="com.djuma.NonIndividual_Branches" scope="request">
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
        br.setNonIndividualId(currentIndividual);
        br.saveBranch();
        response.sendRedirect("nonIndividual.jsp");
        %>
    </body>
</html>
