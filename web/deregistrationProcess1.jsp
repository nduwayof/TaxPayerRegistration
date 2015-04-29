<%-- 
    Document   : deregistrationProcess
    Created on : Mar 20, 2015, 3:14:47 PM
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
}

%>
<jsp:useBean id="d" class="com.djuma.NonIndividualDeregistration" scope="request">
    <jsp:setProperty name="d" property="*"/>
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
       d.setDoneBy(names);
       d.setThereason(request.getParameter("thereason"));
       d.Deregister();
       %>
    </body>
</html>

<jsp:forward page="deRegistration1.jsp"/>
