<%-- 
    Document   : logout
    Created on : Mar 14, 2015, 12:44:16 AM
    Author     : SULAIMAN
--%>
<%
String user=(String)session.getAttribute("userRole");
if(user!=null){
session.invalidate();
response.sendRedirect("login.jsp");
}
%>
