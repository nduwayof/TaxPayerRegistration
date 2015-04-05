<%-- 
    Document   : five
    Created on : Mar 13, 2015, 11:50:23 PM
    Author     : Fabrice
--%>
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
<fieldset>
    <legend>Banking Informations & Enterprise Informations</legend>
    <br>
    <div class="row">
        
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
    </div>
    <div class="row">
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
    </div>
    <br>
</fieldset>