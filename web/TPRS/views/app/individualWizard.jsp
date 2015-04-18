<%-- 
    Document   : individualWizard
    Created on : Mar 9, 2015, 7:59:30 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Individual.Individual_Branch"%>
<%@page import="java.util.List"%>
<%@page import="com.djuma.Individual.Individual_Bank"%>
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
<div class="col-lg-1"></div>
<div class="col-lg-10">
    <form id="SignupForm" action="individualProcess.jsp" class="form-horizontal" method="POST">
        <div id="steping">
            <jsp:include page="steps/One.jsp"/>
            <jsp:include page="steps/two.jsp"/>
            <jsp:include page="steps/three.jsp"/>
            <jsp:include page="steps/four.jsp"/>
        </div>
        <p class="text-center pull-right">
            <input id="SaveAccount" class="btn btn-danger" type="submit" value="Next" />
        </p>
    </form>
  
</div>
<div class="col-lg-1"></div>
<script>
    function saveBank() {
        var formDat = [];
        formDat = $("#bankAccount").serializeArray();
        $.post("bankProcess.jsp", formDat,
                function (data) {
                    $("#contents").html(data);
                    $("#steping").hide();
                }
        )
    }
</script>
