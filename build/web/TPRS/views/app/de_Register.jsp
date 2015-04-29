<%-- 
    Document   : de_Register
    Created on : Mar 16, 2015, 4:29:37 PM
    Author     : Fabrice
--%>

 <div class="row">
        <div class="modal fade" id="deRegister" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">New Branch</h4>
                    </div>
                    <form class="form-horizontal" id="bankAccount">
                        <div class="modal-body">
                            <div class="form-group">
                                <div class="col-md-4">
                                    <label for="reason">De-Registration Reason</label>
                                </div>
                                <div class="col-md-8">
                                    <select name="reason" class="form-control">
                                        <option></option>
                                        <option>Sale of a business</option>
                                        <option>Death</option>
                                        <option>insolvency</option>
                                        <option>incapacity of a taxable person</option>
                                        <option>Conversion of business and an incorporated company </option>
                                        <option>Conversion of an incorporated company into a partnership or sole proprietorship </option>
                                    </select>
                                </div>
                            </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-danger">De-Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>