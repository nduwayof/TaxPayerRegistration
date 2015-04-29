<%-- 
    Document   : deRegistration
    Created on : Mar 16, 2015, 3:55:19 PM
    Author     : Fabrice
--%>


<%@page import="com.djuma.Sector.Industry"%>
<div class="row">
 <form method="POST" action="TPRS/Reports/ByEnterpriseType1.jsp">

        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="taxType">Choose Location</label>
                </div>
                <div class="col-lg-8">
                    <div>
                        <div class="input-group">
                            <select name="enterpriseType" class="form-control">
                        <option>Legal format</option>
                        <option>Sole Trade</option>
                        <option>Partnership</option>
                        <option>Private Limited Company</option>
                        <option>Public Limited Company</option>
                        <option>Not-For-Profit Organisation</option>
                        <option>Government Agency</option>
                    </select>
                            <span class="input-group-addon"><i class="glyphicon glyphicon-chevron-down"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                    <div class="col-lg-6">
                    <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="preview" />
                    </div>
                 </form>

    </div>

                  