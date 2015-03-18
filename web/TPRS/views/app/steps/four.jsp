<%-- 
    Document   : four
    Created on : Mar 13, 2015, 11:50:03 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.Sector.Sub_Sector"%>
<%@page import="com.djuma.Sector.Sector"%>
<fieldset>
    <legend>Activities Informations</legend>
    <br>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-8">
                    <label for="bussinessActivity">Do you do business activity</label> 
                </div>
                <div class="col-lg-4">
                    <div class="row">
                        <div class="col-lg-6">
                            <label onclick="showBusiness()">
                                <input type="radio" name="businessActivty" autocomplete="off" value="1"> Yes 
                            </label>
                        </div>
                        <div class="col-lg-6">
                            <label onclick="hideBusiness()">
                                <input type="radio" name="businessActivty" autocomplete="off" value="0"> No
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="businessActivity">
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mainSectorActivity">Main Sector Activity</label> 
                    </div>
                    <div class="col-lg-8">
                        <%
                        for(Sector s: Sector.listSector()){
                        //for(Sub_Sector su:Sub_Sector.listSubSector()){
                        //if(s.getId()==su.getSectorId()){
                        %>
                        <input type="checkbox" name="mainSectorActivity" value="<%=s.getId()%>#" /><%=s.getName()%> 
                        <%
                       // }
                       // }
                        }
                        %>
                    </div>
                </div>
            </div>
                </div>
                </div>
                <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="estmatedAnnualTurnOver">Annual TurnOver</label> 
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="estmatedAnnualTurnOver" class="form-control">
                    </div>
                </div>
            </div>
                </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="estimatedNumberOfEmployees">Estimated Employees</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="number" name="estimatedNumberOfEmployees" class="form-control">
                    </div>
                </div>
            </div>
        </div>
                     <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-3">
                    <label for="employmentMethod">Employment Details</label>
                </div>
                <div class="col-lg-3">
                    <label>
                        <input type="checkbox" name="employmentMethod" value="full-time" autocomplete="off">Full Time
                    </label>
                </div>
                <div class="col-lg-5">
                    <label>
                        <input type="checkbox" name="employmentMethod" value="part-time" autocomplete="off">Part Time
                    </label>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-3">
                    <label for="accountingMethod">Accounting Method</label>
                </div>
                <div class="col-lg-3">
                    <label>
                        <input type="radio" name="accountingMethod" value="Cash basis" autocomplete="off">Cash basis
                    </label>
                </div>
                <div class="col-lg-5">
                    <label>
                        <input type="radio" name="accountingMethod" value="Accrual Basis-Accounting" autocomplete="off">Accrual basis-accounting
                    </label>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-3">
                    <label for="mainSourceOfIncome">Income Main Source</label>
                </div>
                <div class="col-lg-8">
                    <select name="mainSourceOfIncome">
                        <option>Business</option>
                        <option>Rental</option>
                        <option>Employment</option>
                        <option>Investment</option>
                        <option>Other</option>
                    </select>
                </div>
            </div>
        </div> 
    </div>
   
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-3">
                    <label for="employmentMethod">Business Premises Rented</label>
                </div>
                <div class="col-lg-3">
                    <label>
                        <input type="radio" name="businessPremiseRented" value="Yes" autocomplete="off">Yes
                    </label>
                </div>
                <div class="col-lg-5">
                    <label>
                        <input type="radio" name="businessPremiseRented" value="No" autocomplete="off">No
                    </label>
                </div>
            </div>
        </div>
    </div>
</fieldset>