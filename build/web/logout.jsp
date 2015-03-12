<%-- 
    Document   : logout
    Created on : Mar 11, 2015, 9:00:41 AM
    Author     : Fabrice
--%>

<%
    session.invalidate();
%>
<jsp:forward page="index.jsp"/>