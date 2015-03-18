<%-- 
    Document   : e
    Created on : Mar 14, 2015, 7:31:51 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.NonIndividual_Owners"%>
<%@page import="com.djuma.NonIndividual_Branches"%>
<%@page import="java.util.List"%>
<%@page import="com.djuma.NonIndividual_Bank"%>
<%
    int currentIndividual=0;
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
} else {
String userId = (String) session.getAttribute("userId");
 currentIndividual=(Integer)session.getAttribute("nonIndividualTicket");
}

%>
<fieldset>
    <legend>Banking, Branches and Ownership Informations</legend>
    <div class="row">
        <div class="panel panel-info">
            <div class="panel-heading">
                <h3>Banking Informations</h3>
            </div>
            <div class="panel-body">
                <div class="row">
                    <%
                    List<NonIndividual_Bank>list=NonIndividual_Bank.listBankPerNonIndividual(1);
                    if(!list.isEmpty()){
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
                            for(NonIndividual_Bank ib: NonIndividual_Bank.listBank()){
                            if(ib.getNonIndividualId()==currentIndividual){
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

                    <%
                    List<NonIndividual_Branches>listBranches=NonIndividual_Branches.listBranchPerNonIndividual(currentIndividual);
                    if(!listBranches.isEmpty()){
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
                            for(NonIndividual_Branches ib: NonIndividual_Branches.listBranch()){
                            if(ib.getNonIndividualId()==currentIndividual){
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
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3>Enterprise Ownership Informations</h3>
            </div>
            <div class="panel-body">
                <div class="row">

                    <%
                    List<NonIndividual_Owners>listOwer=NonIndividual_Owners.listNonIndividuaPerlOwners(currentIndividual);
                    if(!listOwer.isEmpty()){
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
                            for(NonIndividual_Owners ib: NonIndividual_Owners.listNonIndividualOwners()){
                            if(ib.getNonIndividualId()==currentIndividual){
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
                    <%} %>
                </div>
            </div>
            <div class="panel-footer">
                <div class="row">
                    <button type="button" class="btn btn-primary btn-lg btn-block" data-toggle="modal" data-target="#ownerModal">
                        Add New Enterprise Ownership Informations
                    </button>
                </div>
            </div>
        </div>
    </div>
    <br>
</fieldset>