<%-- 
    Document   : individualWizard
    Created on : Mar 9, 2015, 7:59:30 PM
    Author     : Fabrice
--%>
<div class="col-lg-1"></div>
<div class="col-lg-10">
    <form id="SignupForm" action="individualProcess.jsp" class="form-horizontal" method="POST">
        <jsp:include page="steps/One.jsp"/>
        <jsp:include page="steps/two.jsp"/>
        <jsp:include page="steps/three.jsp"/>
        <jsp:include page="steps/four.jsp"/>
        <jsp:include page="steps/five.jsp"/>
        <p class="text-center">
            <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="Submit form" />
        </p>
    </form>
</div>
<div class="col-lg-1"></div>
