<%-- 
    Document   : nonIndividualWizard
    Created on : Mar 14, 2015, 6:56:19 PM
    Author     : Fabrice
--%>

<div class="col-lg-1"></div>
<div class="col-lg-10">
    <form id="SignupForm" action="" class="form-horizontal">
        <jsp:include page="nonIndividualSteps/a.jsp"/>
        <jsp:include page="nonIndividualSteps/b.jsp"/>
        <jsp:include page="nonIndividualSteps/c.jsp"/>
        <p class="text-center">
            <input id="SaveAccount" class="btn btn-success btn-lg" type="button" value="Submit form" />
        </p>
    </form>
</div>
<div class="col-lg-1"></div>
