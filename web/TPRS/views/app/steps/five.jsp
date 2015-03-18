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
                    <%
                    List<Individual_Bank>list=Individual_Bank.listBankPerIndividual(currentIndividual);
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
                            for(Individual_Bank ib: Individual_Bank.listBank()){
                            if(ib.getIndividualId()==currentIndividual){
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
                    List<Individual_Branch>listBranches=Individual_Branch.listBranchPerIndividual(currentIndividual);
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
                            for(Individual_Branch ib: Individual_Branch.listBranch()){
                            if(ib.getIndividualId()==currentIndividual){
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
    <br>
</fieldset>