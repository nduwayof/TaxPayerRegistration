<%-- 
    Document   : individualWizard
    Created on : Mar 9, 2015, 7:59:30 PM
    Author     : Fabrice
--%>
<div class="col-lg-1"></div>
<div class="col-lg-10">
    <form id="SignupForm" action="" class="form-horizontal">
        <jsp:include page="steps/One.jsp"/>
        <jsp:include page="steps/two.jsp"/>
        <jsp:include page="steps/three.jsp"/>
        <jsp:include page="steps/four.jsp"/>
        <jsp:include page="steps/five.jsp"/>
        <jsp:include page="steps/six.jsp"/>
        <p class="text-center">
            <input id="SaveAccount" class="btn btn-primary btn-lg" type="button" value="Submit form" />
        </p>
    </form>
</div>
<div class="col-lg-1"></div>
