<%-- 
    Document   : individualWizard
    Created on : Mar 9, 2015, 7:59:30 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Individual.Individual_Branch"%>
<%@page import="java.util.List"%>
<%@page import="com.djuma.Individual.Individual_Bank"%>
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
    <%-- Bank Account Modal--%>
    <div class="row">
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">New Bank Account</h4>
                    </div>
                    <%
                    List<Individual_Bank>list=Individual_Bank.listBankPerIndividual(currentIndividual);
                    if(!list.isEmpty()){
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
                            for(Individual_Bank ib: Individual_Bank.listBank()){
                            if(ib.getIndividualId()==currentIndividual){
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
                    <%} %>
                    <form class="form-horizontal" id="bankAccount" action="bankProcess.jsp" method="POST">
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
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">New Branch</h4>
                    </div>
                    
                <%                       
                    List<Individual_Branch> listBranches = Individual_Branch.listBranchPerIndividual(currentIndividual);
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
                            <button type="submit" class="btn btn-primary">Save changes</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
<div class="col-lg-1"></div>
