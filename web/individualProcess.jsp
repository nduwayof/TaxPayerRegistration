<%-- 
    Document   : individualProcess
    Created on : Mar 14, 2015, 9:05:25 PM
    Author     : SULAIMAN
--%>
<%@page import="com.djuma.Acount.Management.User"%>
<%
    int currentIndividual=0;
    String names="";
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
} else {
String userId = (String) session.getAttribute("userId");
        for (User u : User.listUser()) {
            if (u.getId() == Integer.parseInt(userId)) {
                names = u.getFirstName() + " " + u.getLastName();
            }
        }
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
        <title>Process</title>
    </head>
    <body>
      <%
      c.setIndividualId(currentIndividual);
      c.setDoneBy(names);
      c.saveIndividualInfo();
      response.sendRedirect("individual.jsp");
      %>
    </body>
</html>

