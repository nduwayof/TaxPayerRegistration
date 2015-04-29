<%-- 
    Document   : deRegistration
    Created on : Mar 16, 2015, 3:55:19 PM
    Author     : Fabrice
--%>


<%@page import="com.djuma.Sector.Industry"%>
<div class="row">
 <form method="POST" action="TPRS/Reports/ByYearReport2.jsp">

        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label>From</label>
                </div>
                <div class="col-lg-8">
                    <!--
                    <select name="year">
                            <option>2015</option>
                            <option>2016</option>
                            <option>2017</option>
                            <option>2018</option>
                            <option>2019</option>
                            <option>2020</option>
                    </select>
                    -->
                    
                    <input type="date" name="from" value="" class="form-control" />
                </div>
                <div class="col-lg-4">
                    <label>To</label>
                </div>
                <div class="col-lg-8">
                    
                    
                    <input type="date" name="to" value="" class="form-control" />
                </div>
            </div>
        </div>
     
                    <div class="col-lg-6">
                                    <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="preview" />
                    </div>

                 </form>

    </div>

                  