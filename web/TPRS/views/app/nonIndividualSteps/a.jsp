<%-- 
    Document   : a
    Created on : Mar 14, 2015, 7:30:32 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.Sector.Sector"%>
<%@page import="com.djuma.NonIndividual_Owners"%>
<%@page import="com.djuma.NonIndividual_Branches"%>
<%@page import="com.djuma.NonIndividual_Bank"%>
<%@page import="java.util.List"%>
<%@page import="com.djuma.NonIndividual"%>
<%@page import="com.djuma.Tax.TaxType"%>
<%@page import="com.djuma.Tax.TaxPayerType"%>

<fieldset>
    <legend>Enterprise Informations</legend>
    <br>
    <center> <h4>TIN : <b style="color: blue"><%=NonIndividual.newTinNumber()%></b></h4></center>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="status">Has Old TIN</label>
                </div>
                <div class="col-lg-8 radio icheck">
                    <div class="row">
                        <div class="col-lg-4">
                            <label onclick="showOldTin()">
                                <input type="radio" name="alive" id="fabu" value="Yes" autocomplete="off"> Yes
                            </label>
                        </div>
                        <div class="col-lg-4">
                            <label onclick="hideOldTin()">
                                <input type="radio" name="alive" id="febo" value="No" autocomplete="off"> No
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="oldTin">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="oldTinNumber">OLD TIN Number</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" class="form-control" name="oldTinNumber">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="enterpriseType">Enterprise Type</label>
                </div>
                <div class="col-lg-8">                    
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
    <div class="row">
        <!--
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
        -->
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="incBenefitsInvestment">Tax/investment incentives</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="incBenefitsInvestment"/>
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
                    <label for="nssfRegistrationNo">Social Security Number</label>
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
                    <input type="text" class="form-control" name="noOfShares" value="0"/>
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="sharesValue">Shares / Units value</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="sharesValue" value="0"/>
                </div>
            </div>
        </div>
    </div>
    
    
       <div id="businessActivitys">
        <div class="row">
            <div class="col-lg-6">
                <div class="form-group">
                    <div class="col-lg-4">
                        <label for="mainSectorActivity">Main Sector Activity</label> 
                    </div>
                    <div class="col-lg-8">
                        <!--
                        <%
                            for (Sector s : Sector.listSector()) {
                                //for(Sub_Sector su:Sub_Sector.listSubSector()){
                                //if(s.getId()==su.getSectorId()){
%>
                                                <input type="checkbox" name="mainSectorActivity" value="<%=s.getId()%>#" /><%=s.getName()%> 
                        <%
                                // }
                                // }
                            }
                        %>
                        -->
                        <select class="chosen" multiple="true" style="width:400px;" name="mainSectorActivity" required="">
                            <%
                                for (Sector s : Sector.listSector()) {
                            %>
                            <option value="<%=s.getId()%>#"><%=s.getName()%></option>
                            <%
                                }
                            %>
                        </select> 
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="taxType">Type of Taxes</label>
                </div>
                <div class="col-lg-8">
                    <select class="chosen form-control" multiple="true" name="taxTypeId" required="">
                        <%
                            for (TaxType t : TaxType.listTaxType()) {
                                if (t.isDeletedStatus() == false && !t.getTaxType().equalsIgnoreCase("PIT")) {
                        %>
                        <option value="<%=t.getId()%>#"><%=t.getTaxType()%></option>

                        <%
                                }
                            }
                        %>

                </div>
                </select> 
            </div>
        </div>
    </div>
</div>
    <!--  
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
    -->
 
</fieldset>