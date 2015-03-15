<%-- 
    Document   : four
    Created on : Mar 13, 2015, 11:50:03 PM
    Author     : Fabrice
--%>

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
                                <input type="radio" name="businessActivity" autocomplete="off"> Yes 
                            </label>
                        </div>
                        <div class="col-lg-6">
                            <label onclick="hideBusiness()">
                                <input type="radio" name="businessActivity" autocomplete="off"> No
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
                        <select name="mainSectorActivity" class="form-control">
                            <option>mainSectorActivity</option>
                            <option>mainSectorActivity</option>
                            <option>mainSectorActivity</option>
                            <option>mainSectorActivity</option>
                            <option>mainSectorActivity</option>
                        </select>
                    </div>
                </div>
            </div>
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
                    <select name="mainSourceOfIncome" class="form-control">
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
                    <label for="employmentMethod">Employment Method</label>
                </div>
                <div class="col-lg-3">
                    <label>
                        <input type="checkbox" name="employmentMethod" value="full-time" autocomplete="off">Cash basis
                    </label>
                </div>
                <div class="col-lg-5">
                    <label>
                        <input type="checkbox" name="employmentMethod" value="part-time" autocomplete="off">Accrual basis-accounting
                    </label>
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