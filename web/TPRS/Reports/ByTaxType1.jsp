<%-- 
    Document   : deRegistration
    Created on : Mar 16, 2015, 3:55:19 PM
    Author     : Fabrice
--%>



<%@page import="com.djuma.Tax.TaxType"%>
<div class="row">
 <form method="POST" action="TPRS/Reports/ByTaxTypeReport2.jsp">

        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="taxType">Choose Tax Type</label>
                </div>
                <div class="col-lg-8">
                    <select name="taxType">
                    <%
                        for (TaxType t : TaxType.listTaxType()) {
                            if(!t.getTaxType().equalsIgnoreCase("PIT")){
                    %>
                    <option value="<%=t.getId()%>"><%=t.getTaxType()%></option>
                    <%
                        }
                        }
                    %>
                    </select>
                    
                </div>
            </div>
        </div>
                    <div class="col-lg-6">
                                    <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="preview" />
                    </div>
                 </form>

    </div>

                  