<%-- 
    Document   : b
    Created on : Mar 14, 2015, 7:30:46 PM
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
                    <label for="sector">Sector</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="sector" class="form-control">
                </div>
            </div>
        </div>
          <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="district">District</label>
                </div>
                <div class="col-lg-8">
                    <div class="input-group">
                        <select name="district" class="form-control">
                            <option>Hargeisa</option>
                                <option>Berbera</option>
                                <option>Burao</option>
                                <option>Erigavo</option>
                                <option>Las Anod</option>
                                <option>Borama</option>
                                <option>Zeila</option>
                                <option>Las Khorey</option>
                                <option>Gabiley</option>
                                <option>Oodweyne</option>
                        </select>
                        <span class="input-group-addon"><i class="glyphicon glyphicon-chevron-down"></i></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
         <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="province">Province</label>
                </div>
                <div class="col-lg-8">
                    <div>
                        <div class="input-group">
                            <select name="province" class="form-control">
                            <option>Woqooyi Galbeed</option>
                            <option>Woqooyi Galbeed</option>
                            <option>Togdheer</option>
                            <option>Sanaag</option>
                            <option>Sool</option>
                            <option>Awdal</option>
                            <option>Awdal</option>
                            <option>Sanaag</option>
                            <option>Woqooyi Galbeed</option>
                            <option>Togdheer</option>
                            </select>
                            <span class="input-group-addon"><i class="glyphicon glyphicon-chevron-down"></i></span>
                        </div>
                    </div>
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
                        <input type="text" name="mailPlotNo" class="form-control">
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
                        <label for="mailSector">Sector</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailSector" class="form-control">
                    </div>
                </div>
            </div>
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
        </div> 
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="province">Province</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="mailProvince" class="form-control">
                    </div>
                </div>
            </div>
        </div> 
    </div>
</fieldset>
