<%-- 
    Document   : five
    Created on : Mar 13, 2015, 11:50:23 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Sector.Sector"%>
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
<div class="row">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>New Bank Account</h3>
        </div>
        <div class="panel-body">
            <%                        List<Individual_Bank> list = Individual_Bank.listBankPerIndividual(currentIndividual);
                if (!list.isEmpty()) {
            %>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Bank Name / Branch</th>
                        <th> Address</th>
                        <th> Account Number</th>
                        <th> Currency </th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Individual_Bank ib : Individual_Bank.listBank()) {
                            if (ib.getIndividualId() == currentIndividual) {
                    %>
                    <tr>
                        <td>
                            <%=ib.getPrincipalBankName()%> - <%=ib.getBranchName()%>
                        </td>
                        <td><%=ib.getBranchAddress()%></td>
                        <td><%=ib.getBankAccountNo()%></td>
                        <td><%=ib.getCurrency()%></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                </tbody>
            </table>
            <%}%>
        </div>
        <div class="panel-footer">
            <div class="row">
                <button type="button" class="btn btn-twitter btn-lg btn-block" data-toggle="modal" data-target="#myModal">
                    Add & View Bank Account
                </button>
            </div>
        </div>
    </div>

</div>
<div class="row">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Enterprise Branches</h3>
        </div>
        <div class="panel-body">
            <%
                List<Individual_Branch> listBranches = Individual_Branch.listBranchPerIndividual(currentIndividual);
                if (!listBranches.isEmpty()) {
            %>
            <table border="1">
                <thead>
                    <tr>
                        <th>nameOfBranch</th>
                        <th>branchAddress</th>
                        <th>branchCity</th>
                        <th>branchProvince</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Individual_Branch ib : Individual_Branch.listBranch()) {
                            if (ib.getIndividualId() == currentIndividual) {
                    %>
                    <tr>
                        <td><%=ib.getNameOfBranch()%></td>
                        <td><%=ib.getBranchAddress()%></td>
                        <td><%=ib.getBranchCity()%></td>
                        <td><%=ib.getBranchProvince()%></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                </tbody>
            </table>
            <%}%>

        </div>
        <div class="panel-footer">
            <div class="row">
                <button type="button" class="btn btn-twitter btn-lg btn-block" data-toggle="modal" data-target="#enterModal">
                    Add & View Enterprise Branch
                </button>
            </div>
        </div>
    </div>
</div>

<%-- Bank Account Modal--%>
<div class="row">
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <form class="form-horizontal" id="bankAccount" >
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
                        <a type="submit" class="btn btn-primary" href="javascript:void(0)" onclick="saveBank()" data-dismiss="modal">Save changes</a>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<%-- Enterprice Branch Modal--%>
<div class="row">
    <div class="modal fade" id="enterModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">

                <form class="form-horizontal" id="bankAccount" action="entrepriseBranchProcess.jsp" method="POST">
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
                        <a type="submit" class="btn btn-primary" href="javascript:void(0)" onclick="saveBank()" data-dismiss="modal">Save changes</a>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>   
<div class="row">
    <div class="header">
        <h2>Enterprise Owner's image/photo</h2>
    </div>
    <form enctype="multipart/form-data">
        <input id="file-0" class="file" type="file" multiple data-min-file-count="1">
        <br>
        <button type="submit" class="btn btn-primary">Submit</button>
        <button type="reset" class="btn btn-default">Reset</button>
    </form>
</div>
