<%-- 
    Document   : viewIndividual
    Created on : Mar 16, 2015, 4:29:06 PM
    Author     : Fabrice
--%>

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
                        <th>TIN Number</th>
                        <th>Owner's Names</th>
                        <th>Gender</th>
                        <th>Nationality</th>
                        <th>Photo</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    for(Individual in: Individual.listIndividual()){
                    if(in.isDeRegistered()==false){
                    %>
                     <tr>
                        <td><%=in.getTinNumber()%></td>
                        <td><%=in.getOwnerSurname()%> <%=in.getOwnerFirstName()%></td>
                        <td><%=in.getGender()%></td>
                        <td><%=in.getNationality()%></td>
                        <td><img src="<%=in.getPhoto()%>"></td>
                        </td>
                    </tr>
                    <%
                    }
                    }
                    %>
    
                </tbody>
                <tfoot>
                    <tr>
                        <th>TIN Number</th>
                        <th>Owner's Names</th>
                        <th>Gender</th>
                        <th>Nationality</th>
                        <th>Photo</th>
                    </tr>
                </tfoot>
            </table>
        </div>
    </div>
</div>