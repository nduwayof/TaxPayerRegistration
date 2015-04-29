<%-- 
    Document   : logout
    Created on : Mar 11, 2015, 9:00:41 AM
    Author     : Fabrice
--%>
<%
    String user = (String) session.getAttribute("userRole");
    if (user != null) {
        session.invalidate();
        response.sendRedirect("index.jsp");
    }
%>
