<%-- 
    Document   : three
    Created on : Mar 13, 2015, 10:56:03 PM
    Author     : Fabrice
--%>

<fieldset>
    <legend>Representative Contact & Trade informations</legend>
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
                        <input type="text" name="representativePhoneNo" id="representativePhoneNo" class="form-control">
                        <span class="text-danger" id="representativePhoneNoMsg"></span>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="contactName">Contact Name</label>
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
                        <input type="text" name="contactPhoneNo" id="contactPhoneNo" class="form-control">
                        <span class="text-danger" id="contactPhoneNoMsg"></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="header">
            <h3>Trade Informations</h3>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="tradeName">Trade Name</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="tradeName" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="tradeAddress">Trade Address</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="tradeAddress" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="tradeDistrict">Trade District</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="tradeDistrict" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="tradeProvince">Trade Province</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="tradeProvince" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="commercialRegistrationNo">Commercial Registration No</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="commercialRegistrationNo" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="startDate">Start Date</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="date" name="startDate" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="entreprisePhoneNo">Enterprise Phone No</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="entreprisePhoneNo" id="entreprisePhoneNo" class="form-control">
                        <span class="text-danger" id="entreprisePhoneNoMsg"></span>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-5">
                        <label for="entrepriseFaxNo">Enterprise Fax No</label>
                    </div>
                    <div class="col-lg-7">
                        <input type="text" name="entrepriseFaxNo" class="form-control">
                    </div>
                </div>
            </div>
        </div>
    </div>
</fieldset>