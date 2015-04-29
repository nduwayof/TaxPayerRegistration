<%-- 
    Document   : TestingMultProcess
    Created on : Apr 5, 2015, 1:28:36 PM
    Author     : SULAIMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String values[]=request.getParameterValues("sector");
        String option="";
        for(int i=0; i<values.length; i++){
       // out.println(values[i]);
        option+=values[i];
        }
        out.println(option);
        %>
    </body>
</html>
