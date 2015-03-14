<%-- 
    Document   : five
    Created on : Mar 13, 2015, 11:50:23 PM
    Author     : Fabrice
--%>
<%
    int currentIndividual=0;
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
} else {
String userId = (String) session.getAttribute("userId");
 currentIndividual=(Integer)session.getAttribute("individualTicket");
}

%>
<fieldset>
    <legend>Banking Informations & Enterprise Informations</legend>
    <div class="row">
        <div class="panel panel-info">
            <div class="panel-heading">
                <h3>Banking Informations</h3>
            </div>
            <div class="panel-body">
                <div class="row">

                    <ul class="list-group">
                        <li class="list-group-item">Bank Of Kigali</li>
                        <li class="list-group-item">Rwanda Commercial Bank</li>
                        <li class="list-group-item">CogeBank</li>
                        <li class="list-group-item">Kenya Commercial Bank</li>
                    </ul>
                </div>
            </div>
            <div class="panel-footer">
                <div class="row">
                    <button type="button" class="btn btn-twitter btn-lg btn-block" data-toggle="modal" data-target="#myModal">
                        Add New Bank Account
                    </button>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="panel panel-warning">
            <div class="panel-heading">
                <h3>Enterprise Branches Informations</h3>
            </div>
            <div class="panel-body">
                <div class="row">

                    <ul class="list-group">
                        <li class="list-group-item">Kibitoki</li>
                        <li class="list-group-item">Giporoso</li>
                        <li class="list-group-item">Bujumbura Rural</li>
                        <li class="list-group-item">Mukamenge</li>
                    </ul>
                </div>
            </div>
            <div class="panel-footer">
                <div class="row">
                    <button type="button" class="btn btn-github btn-lg btn-block" data-toggle="modal" data-target="#enterModal">
                        Add New Branch
                    </button>
                </div>
            </div>
        </div>
    </div>
    <br>
</fieldset>