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
                <div class="col-lg-4">
                    <label for="estmatedAnnualTurnOver">Annual TurnOver</label> 
                </div>
                <div class="col-lg-8">
                    <input type="text" name="estmatedAnnualTurnOver" class="form-control" required="">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="estimatedNumberOfEmployees">Estimated Employees</label>
                </div>
                <div class="col-lg-8">
                    <input type="number" name="estimatedNumberOfEmployees" class="form-control" required="">
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
                <div class="col-lg-4">
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
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="mainSourceOfIncome">Main Source Source of Income</label>
                </div>
                <div class="col-lg-8">
                    <div class="input-group">
                        <select name="mainSourceOfIncome" class="form-control" id="selectMainSourceIncome" onchange="chooseOther()">
                            <option>Business</option>
                            <option>Rental</option>
                            <option>Employment</option>
                            <option>Investment</option>
                            <option>Other</option>
                        </select>
                        <span class="input-group-addon"><i class="glyphicon glyphicon-chevron-down"></i></span>
                    </div>
                </div> 
            </div>
        </div>
        <div class="form-group">
                <div class="col-lg-4" id="otherOption">
                    <label>
                        <input type="text" name="otherMainSourceOfIncome" class="form-control"  placeholder="type the other main Source of income"autocomplete="off">
                    </label>
        </div>
        </div> 
    </div>


    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="">Investment Incentives</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="investmentIncentives" class="form-control" >
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="">Incentive StartDate</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" name="incentiveStartDate" class="form-control" >
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


