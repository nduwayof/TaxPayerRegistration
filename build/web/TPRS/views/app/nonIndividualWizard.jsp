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
<div class="col-lg-1"></div>
<div class="col-lg-10">
    <form id="SignupForm" action="nonIndividualProcess.jsp" class="form-horizontal" method="POST">
        <jsp:include page="nonIndividualSteps/e.jsp"/>
        <jsp:include page="nonIndividualSteps/a.jsp"/>
        <jsp:include page="nonIndividualSteps/b.jsp"/>
        <jsp:include page="nonIndividualSteps/c.jsp"/>
        <jsp:include page="nonIndividualSteps/d.jsp"/>
        <p class="text-center">
            <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="Submit form" />
        </p>
    </form>
    <%-- Bank Account Modal--%>
    <div class="row">
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                     <%
                            List<NonIndividual_Bank> list = NonIndividual_Bank.listBankPerNonIndividual(1);
                            if (!list.isEmpty()) {
                        %>
                        <table border="1">
                            <thead>
                                <tr>
                                    <th>principalBankName</th>
                                    <th> branchName</th>
                                    <th> branchAddress</th>
                                    <th> branchSector</th>
                                    <th> branchDistrict</th>
                                    <th> bankAccountNo </th>
                                    <th> currency </th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (NonIndividual_Bank ib : NonIndividual_Bank.listBank()) {
                                        if (ib.getNonIndividualId() == currentIndividual) {
                                %>
                                <tr>
                                    <td><%=ib.getPrincipalBankName()%></td>
                                    <td><%=ib.getBranchName()%></td>
                                    <td><%=ib.getBranchAddress()%></td>
                                    <td><%=ib.getBranchSector()%></td>
                                    <td><%=ib.getBranchDistrict()%></td>
                                    <td><%=ib.getBankAccountNo()%></td>
                                    <td><%=ib.getCurrency()%></td>
                                </tr>
                                <%
                                        }
                                    }
                                %>
                            </tbody>
                        </table>
                        <%} %>
                    <form class="form-horizontal" id="bankAccount" action="bankProcess1.jsp" method="POST">
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
    <%-- Enterprice Branch Modal--%>
    <div class="row">
        <div class="modal fade" id="enterModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                      <%
                            List<NonIndividual_Branches> listBranches = NonIndividual_Branches.listBranchPerNonIndividual(currentIndividual);
                            if (!listBranches.isEmpty()) {
                        %>
                        <table border="1">
                            <thead>
                                <tr>
                                    <th>nameOfBranch</th>
                                    <th> branchAddress</th>
                                    <th>  branchCity</th>
                                    <th>  branchProvince</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (NonIndividual_Branches ib : NonIndividual_Branches.listBranch()) {
                                        if (ib.getNonIndividualId() == currentIndividual) {
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
                        <%} %>
                    <form class="form-horizontal" id="bankAccount" action="enterpriseBranchProcess1.jsp">
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
    <%-- Enterprise Ownership Modal--%>
    <div class="row">
        <div class="modal fade" id="ownerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <%
                            List<NonIndividual_Owners> listOwer = NonIndividual_Owners.listNonIndividuaPerlOwners(currentIndividual);
                            if (!listOwer.isEmpty()) {
                        %>
                        <table border="1">
                            <thead>
                                <tr>
                                    <th>taxpayerNationalId</th>
                                    <th>Names</th>
                                    <th>Parcentage</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (NonIndividual_Owners ib : NonIndividual_Owners.listNonIndividualOwners()) {
                                        if (ib.getNonIndividualId() == currentIndividual) {
                                %>
                                <tr>
                                    <td><%=ib.getTaxpayerNationalId()%></td>
                                    <td><%=ib.getNames()%></td>
                                    <td><%=ib.getParcentage()%></td>
                                </tr>
                                <%
                                        }
                                    }
                                %>
                            </tbody>
                        </table>
                        <%}%>
                    <form class="form-horizontal" id="bankAccount" action="ownerShipProcess.jsp" method="POST">
                        <div class="modal-body">
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="taxpayerNationalId">TaxPayer National Id</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="taxpayerNationalId">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="names">Names</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" name="names">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="parcentage">Percentage</label>
                                </div>
                                <div class="col-md-8">
                                    <input type="number" class="form-control" name="parcentage">
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
</div>
<div class="col-lg-1"></div>
