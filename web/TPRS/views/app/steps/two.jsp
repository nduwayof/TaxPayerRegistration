<%-- 
    Document   : two
    Created on : Mar 13, 2015, 08:24:54 PM
    Author     : Fabrice
--%>
<fieldset>
    <legend>Addresses Information's</legend>
    <br>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="PlotNo">Plot/House No</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="plotNo" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="street">Street</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="street" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="cellule">Cellule</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="cellule" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="sector">Sector</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="sector" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="district">District</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="district" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="province">Province</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="province" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <h3>Home Mailing Addresses </h3>
            <div class="form-group">
                <div class="col-md-5">
                    <label>Head office mailing address if different from above</label>
                </div>
                <div class="col-md-2">
                    <label onclick="showMailing()">
                        <input type="radio" name="mailingAddress"> Yes
                    </label>
                </div>
                <div class="col-md-2">
                    <label onclick="hideMailing()">
                        <input type="radio" name="mailingAddress"> No
                    </label>
                </div>
            </div>
        </div>
        <div class="col-lg-6">

        </div>
    </div>
    <div id="mailingAddress">
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailHouseNo">House No</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailHouseNo" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailStreet">Street</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailStreet" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailPoBox">P.O. Box</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailPoBox" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailCity">City</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailCity" class="form-control">
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailCellule">Cellule</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailCellule" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailSector">Sector</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailSector" class="form-control">
                    </div>
                </div>
            </div>
        </div> 
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mailDistrict">District</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailDistrict" class="form-control">
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="province">Province</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="province" class="form-control">
                    </div>
                </div>
            </div>
        </div> 
    </div>
</fieldset>