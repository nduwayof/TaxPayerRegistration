<%-- 
    Document   : five
    Created on : Mar 13, 2015, 11:50:23 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Individual.Individual_Branch"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.djuma.Individual.Individual_Bank"%>
<%@page import="com.djuma.Individual.Individual"%>
<%
    int currentIndividual = 0;
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
    } else {
        String userId = (String) session.getAttribute("userId");
        currentIndividual = (Integer) session.getAttribute("individualTicket");
    }

%>
<fieldset>
    <legend>Banking Informations & Enterprise Informations</legend>
    <br>
    <div class="row">
        <div class="col-sm-6">
            <button type="button" class="btn btn-twitter btn-lg btn-block" data-toggle="modal" data-target="#myModal">
                Add & View Bank Account
            </button>
        </div>
        <div class="col-sm-6">
            <button type="button" class="btn btn-twitter btn-lg btn-block" data-toggle="modal" data-target="#enterModal">
                Add & View Enterprise Branch
            </button>
        </div>
    </div>
    <br>
</fieldset>