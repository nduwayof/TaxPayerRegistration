<%-- 
    Document   : a
    Created on : Mar 14, 2015, 7:30:32 PM
    Author     : Fabrice
--%>

<fieldset>
    <legend>Enterprise Informations</legend>
    <br>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="enterpriseType">Enterprise Type</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="enterpriseType"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="incBenefitsInvestment">Benefits from investment incentives</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="incBenefitsInvestment"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="noOfExpiration">No Of Expiration</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="noOfExpiration"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="expirationDate">Expiration Date</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" class="form-control" name="expirationDate"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="registeredName">Registered Name</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="registeredName"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="registrationDate">Registration Date</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" class="form-control" name="registrationDate"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="comRegistrationNo">Commercial registration No</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="comRegistrationNo"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label>Resident</label>
                </div>
                <div class="col-lg-8 radio icheck">
                    <div class="row">
                        <div class="col-lg-4">
                            <label onclick="hideresidentFabrice()">
                                <input type="radio" name="resident" value="1" >Yes
                            </label>
                        </div>
                        <div class="col-lg-4">
                            <label onclick="showresidentFabrice()">
                                <input type="radio" name="resident" value="0" >No
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group" id="residentFabrice">
                <div class="col-lg-4">
                    <label for="newResident">Your Country of Residence</label>
                </div>
                <div class="col-lg-8">
                    <jsp:include page="../steps/subSteps/residences.jsp"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="entrepriseEmail">Enterprise Email</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="entrepriseEmail"/>
                </div>
            </div>
        </div>
         <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="nssfRegistrationNo">NSSF registration No</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="nssfRegistrationNo"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="entreprisePhoneNo">Enterprise Phone No</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="entreprisePhoneNo"/>
                </div>
            </div>
        </div>
       <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="entrepriseFaxNo">Enterprise Fax No</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="entrepriseFaxNo"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="startDate">Start Date</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" class="form-control" name="startDate"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="closeDate">Close Date</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" class="form-control" name="closeDate"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="noOfShares">No of shares or Units</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="noOfShares"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="sharesValue">Shares / Units value</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="sharesValue"/>
                </div>
            </div>
        </div>
    </div>
</fieldset>