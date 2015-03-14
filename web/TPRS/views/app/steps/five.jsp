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
    
    <%-- Enterprice Branch Modal--%>
     <div class="row">
        <div class="modal fade" id="enterModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">New Branch</h4>
                    </div>
                   <form class="form-horizontal" id="entrepriseBranch" method="POST" action="entrepriseBranchProcess.jsp">
                    <div class="modal-body">
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="nameOfBranch">Branch Name</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="nameOfBranch">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchAddress">Branch Address</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchAddress">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchAddress">Branch Address</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchAddress">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchCity">Branch City</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchCity">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchProvince">Branch Province</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchProvince">
                                </div>
                            </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                  </form>
                </div>
            </div>
        </div>
    </div>
     
         <%-- Bank Account Modal--%>
    <div class="row">
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">New Bank Account</h4>
                    </div>
                  <form class="form-horizontal" id="bankAccount" method="POST" action="bankProcess.jsp">
                    <div class="modal-body">
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="principalBankName">Bank Name</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="principalBankName">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchName">Branch Name</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchName">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchAddress">Branch Address</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchAddress">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchSector">Sector</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchSector">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="branchDistrict">District</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="branchDistrict">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="bankAccountNo">Account Number</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="bankAccountNo">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="currency">Currency</label>
                                </div>
                                <div class="col-md-8">
                                    <select name="currency" class="form-control">
                                        <option>RWF</option>
                                        <option>$USD</option>
                                        <option>BUR</option>
                                        <option>UGD</option>
                                    </select>
                                </div>
                            </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <br>
</fieldset>