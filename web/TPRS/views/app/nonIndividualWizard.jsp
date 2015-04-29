<%-- 
    Document   : nonIndividualWizard
    Created on : Mar 14, 2015, 6:56:19 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.NonIndividual_Bank"%>
<%@page import="com.djuma.NonIndividual_Branches"%>
<%@page import="com.djuma.NonIndividual_Owners"%>
<%@page import="java.util.List"%>
<%
    int currentIndividual = 0;
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
    } else {
        String userId = (String) session.getAttribute("userId");
        currentIndividual = (Integer) session.getAttribute("nonIndividualTicket");
    }

%>
<jsp:useBean id="co" class="com.djuma.CommonNonIndividual" scope="request"></jsp:useBean>
<div class="col-lg-1"></div>
<div class="col-lg-10">
    <form id="SignupForm" action="nonIndividualProcess.jsp" class="form-horizontal" method="POST">
        <jsp:include page="nonIndividualSteps/a.jsp"/>
        <jsp:include page="nonIndividualSteps/b.jsp"/>
        <jsp:include page="nonIndividualSteps/c.jsp"/>
        <jsp:include page="nonIndividualSteps/d.jsp"/>
        <p class="text-center pull-right">
            <input id="SaveAccount" class="btn btn-danger" type="submit" value="Next" />
        </p>
    </form>
</div>
<div class="col-lg-1"></div>
