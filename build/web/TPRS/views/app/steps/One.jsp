<%-- 
    Document   : One
    Created on : Mar 13, 2015, 9:49:02 PM
    Author     : Fabrice
--%>



<%@page import="com.djuma.Tax.TaxPayerType"%>
<%@page import="com.djuma.Tax.TaxType"%>


<fieldset>
    <legend>Enterprise Owner's Info</legend>
    <br>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="surname">Owner's Surname</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="ownerSurname">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="firstName">First name</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="ownerFirstName">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="dob">Date of Birth</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" class="form-control" name="dob">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="status">Is the owner alive</label>
                </div>
                <div class="col-lg-8 radio icheck">
                    <div class="row">
                        <div class="col-lg-4">
                            <label onclick="hideDeceaseDate()">
                                <input type="radio" name="alive" id="fabu" value="Yes" autocomplete="off"> Yes
                            </label>
                        </div>
                        <div class="col-lg-4">
                            <label onclick="showDeceaseDate()">
                                <input type="radio" name="alive" id="febo" value="No" autocomplete="off"> No
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row" id="deceasedDate">
        <div class="col-lg-6">
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="deceasedDate">Deceased Date</label>
                </div>
                <div class="col-lg-8">
                    <input type="date" class="form-control" name="deceadDate">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="gender">Gender</label>
                </div>
                <div class="col-lg-8 radio icheck">
                    <div class="row">
                        <div class="col-lg-4">
                            <label>
                                <input type="radio" name="gender" id="option2" value="male" autocomplete="off">Male
                            </label>
                        </div>
                        <div class="col-lg-4">
                            <label>
                                <input type="radio" name="gender" id="option2" value="female" autocomplete="off">Female
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="occupation">Occupation</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="occupation" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="nationality">Nationality</label>
                </div>
                <div class="col-lg-8">
                    <jsp:include page="subSteps/nationalities.jsp"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="nationalId">National ID</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="nationalId" placeholder="National ID">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="socialSecurityNumber">Social Security Number</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="socialSecurityNumber" id="socialSecurityNumber" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="passport">Passport</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="passport" id="passport" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="homePhone">Home Phone</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="homePhone" id="homePhone" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="workPhone">Work Phone</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="workPhone" id="workPhone" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="cellPhone">Cell Phone</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="cellPhone" id="cellPhone" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="faxNo">Fax Number</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" name="faxNo" id="faxNo" class="form-control">
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label>Are you resident</label>
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
                    <label for="newResident">Your Resident</label>
                </div>
                <div class="col-lg-8">
                    <jsp:include page="subSteps/residences.jsp"/>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="taxpayerType">Type of Taxpayer</label>
                </div>
                <div class="col-lg-8">
                        <%
                            for (TaxPayerType t : TaxPayerType.listTaxPayerType()) {
                                if (t.isDeletedStatus() == false) {
                        %>
                    <input type="checkbox" name="taxpayerType" value="<%=t.getId()%>#" /><%=t.getTaxpayerType()%>

                        <%
                                }
                            }
                        %>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="taxType">Type of Taxes</label>
                </div>
                <div class="col-lg-8">
                        <%
                            for (TaxType t : TaxType.listTaxType()) {
                                if (t.isDeletedStatus() == false) {
                        %>
                        
                       <input type="checkbox" name="taxType" value="<%=t.getId()%>#" /><%=t.getTaxType()%>
                        <%
                                }
                            }
                        %>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="civilStatus">Civil Status</label>
                </div>
                <div class="col-lg-8">
                    <label onclick="hideCivil()">
                        <input type="radio" name="civilStatus" >Single
                    </label>
                    <label onclick="showCivil()">
                        <input type="radio" name="civilStatus" >Married
                    </label>

                    <label onclick="hideCivil()">
                        <input type="radio" name="civilStatus">Divorced
                    </label>
                    <label onclick="showCivil()">
                        <input type="radio" name="civilStatus">Widowed 
                    </label>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div id="civilId">
                <h3>Partner Informations</h3>
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="name">Name</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="marriageName" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="surname">Surname</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="marriageSurname" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="dob">Date of Birth</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="date" name="dob" class="form-control">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-4">
        <label for="attachment">Please attach your Photo</label>
                </div>
                <div class="col-lg-8">
                    <div class="btn btn-default btn-file">
                        <i class="fa fa-paperclip"></i> Attachment
                        <input type="file" name="photo" class="form-control"/>
                    </div>
                    <p class="help-block">Max. 32MB</p>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="attachment">Please attach your national Id Photocopy</label>
                </div>
                <div class="col-lg-8">
                    <div class="btn btn-default btn-file">
                        <i class="fa fa-paperclip"></i> Attachment
                        <input type="file" name="attachment" class="form-control"/>
                    </div>
                    <p class="help-block">Max. 32MB</p>
                </div>
            </div>
        </div>
    </div>
</fieldset>
