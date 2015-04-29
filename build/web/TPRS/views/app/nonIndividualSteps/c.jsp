<%-- 
    Document   : c
    Created on : Mar 14, 2015, 7:31:23 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.Sector.Sector"%>
<fieldset>
    <legend>Representative Contact & Activities Informations</legend>
    <br>
    <div class="row">
        <div class="header">
            <h3>Representative Contacts</h3>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="taxpayerRepresentativeName">Taxpayer Representative Name</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="taxpayerRepresentativeName" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="representativeTitle">Representative Title</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="representativeTitle" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="representativePhoneNo">Representative Phone No</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="representativePhoneNo" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="contactName">Contact Name?</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="contactName" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="contactTitle">Contact Title</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="contactTitle" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="contactPhoneNo">Contact phone No</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="contactPhoneNo" class="form-control">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="header">
            <h1>Activities Informations</h1>
        </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="estmatedAnnualTurnOver">Annual TurnOver</label> 
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="estmatedAnnualTurnOver" class="form-control" required="" value="0">
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
                        <input type="number" name="estimatedNumberOfEmployees" class="form-control" required="" value="0">
                    </div>
                </div>
            </div>
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
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="businessActivityStartDate">Business Activity Start Date</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="date" name="businessActivityStartDate" class="form-control">
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
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-3">
                    <label for="employmentMethod">Business Premises Rented</label>
                </div>
                <div class="col-lg-3">
                    <label>
                        <input type="radio" name="businessPremiseRented" value="1" autocomplete="off">Yes
                    </label>
                </div>
                <div class="col-lg-5">
                    <label>
                        <input type="radio" name="businessPremiseRented" value="0" autocomplete="off">No
                    </label>
                </div>
            </div>
        </div>
    </div>
    </div>
</fieldset>