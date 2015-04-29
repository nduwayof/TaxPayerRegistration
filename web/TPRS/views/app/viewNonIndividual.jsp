<%-- 
    Document   : viewIndividual
    Created on : Mar 16, 2015, 4:29:06 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.NonIndividual"%>
<%@page import="com.djuma.Individual.Individual"%>
<div class="col-xs-12">
    <div class="box">
        <div class="box-header">
            <h3 class="box-title">List Of Individual Enterprises</h3>
        </div>
        <div class="box-body">
            <table id="example1" class="table table-bordered table-striped table-hover table-mailbox" border="1">
                <thead>
                    <tr>
                        <th class="bg-blue">TIN Number</th>
                        <th class="bg-blue">Enterprise Type</th>
                        <th class="bg-blue">Registered Name</th>
                        <th class="bg-blue">Country Of Residence</th>
                        <!--
                        <th>Photo</th>
                        -->
                    </tr>
                </thead>
                <tbody>
                    <%
                    for(NonIndividual in: NonIndividual.listNonIndividual()){
                    if(in.isDeregistered()==false&& in.isHasInfo()){
                    %>
                     <tr>
                        <td><%=in.getTinNumber()%></td>
                        <td><%=in.getEnterpriseType()%></td>
                        <td><%=in.getRegisteredName()%></td>
                        <td><%=in.getCountryOfResidence()%></td>
                        <!--
                        <td><img src="<%=in.getPhoto()%>"></td>
                        -->
                    </tr>
                    <%
                    }
                    }
                    %>
    
                </tbody>
                <tfoot>
                    <tr>
                        <th class="bg-blue">TIN Number</th>
                        <th class="bg-blue">Enterprise Type</th>
                        <th class="bg-blue">Registered Name</th>
                        <th class="bg-blue">Country Of Residence</th>
                        <!--
                        <th>Photo</th>
                        -->
                    </tr>
                </tfoot>
            </table>
        </div>
    </div>
</div>