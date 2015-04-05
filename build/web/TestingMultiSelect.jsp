<%-- 
    Document   : TestingMultiSelect
    Created on : Apr 5, 2015, 1:24:43 PM
    Author     : SULAIMAN
--%>

<%@page import="com.djuma.Sector.Sector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
                <link href="TPRS/bower_components/chosen/chosen.min.css" rel="stylesheet" type="text/css" />   
                        <script src="TPRS/bower_components/jquery/js/jquery.min.js"></script>

                        <script src="TPRS/bower_components/chosen/chosen.jquery.min.js"></script>
                        
                        
                        <script>
            jQuery(document).ready(function () {
                jQuery(".chosen").chosen();
            });
        </script>

    </head>
    <body>
        <div class="row">
            <form action="TestingMultProcess.jsp" method="POST">
            <!-- multiple dropdown -->
            <select class="chosen" multiple="true" style="width:400px;" name="sector">
                <%
                for(Sector s: Sector.listSector()){
                %>
                <option value="<%=s.getId()%>#"><%=s.getName()%></option>
                <%
                }
                %>
            </select> 
            <input type="submit" value="Save" />
            </form>
        </div>
    </body>
</html>
