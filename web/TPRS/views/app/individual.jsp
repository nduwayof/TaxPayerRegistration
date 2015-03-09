<%-- 
    Document   : individual
    Created on : Mar 9, 2015, 07:01:04 PM
    Author     : Fabrice
--%>

<!-- Bootstrap -->
<link href="TPRS/bower_components/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="TPRS/css/prettify.css" rel="stylesheet">
<section id="wizard">
    <div id="rootwizard">
        <ul>
            <li><a href="#tab1" data-toggle="tab">First</a></li>
            <li><a href="#tab2" data-toggle="tab">Second</a></li>
            <li><a href="#tab3" data-toggle="tab">Third</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane" id="tab1">
                <div class="control-group">
                    <label class="control-label" for="email">Email</label>
                    <div class="controls">
                        <input type="text" id="emailfield" name="emailfield" class="required email">
                    </div>
                </div>

                <div class="control-group">
                    <label class="control-label" for="name">Name</label>
                    <div class="controls">
                        <input type="text" id="namefield" name="namefield" class="required">
                    </div>
                </div>
            </div>
            <div class="tab-pane" id="tab2">
                <div class="control-group">
                    <label class="control-label" for="url">URL</label>
                    <div class="controls">
                        <input type="text" id="urlfield" name="urlfield" class="required url">
                    </div>
                </div>
            </div>
            <div class="tab-pane" id="tab3">
                3
            </div>
            <ul class="pager wizard">
                <li class="previous first" style="display:none;"><a href="#">First</a></li>
                <li class="previous"><a href="#">Previous</a></li>
                <li class="next last" style="display:none;"><a href="#">Last</a></li>
                <li class="next"><a href="#">Next</a></li>
            </ul>
        </div>
    </div>
</form>
</section>
<script src="TPRS/bower_components/jquery/js/jquery.min.js"></script>
<script src="TPRS/bower_components/jquery/js/jquery.validate.min.js"></script>
<script src="TPRS/bower_components/bootstrap/js/bootstrap.min.js"></script>
<script src="TPRS/bower_components/jquery/js/jquery.bootstrap.wizard.js"></script>
<script src="TPRS/js/prettify.js"></script>
<script>
    $(document).ready(function () {
        var $validator = $("#commentForm").validate({
            rules: {
                emailfield: {
                    required: true,
                    email: true,
                    minlength: 3
                },
                namefield: {
                    required: true,
                    minlength: 3
                },
                urlfield: {
                    required: true,
                    minlength: 3,
                    url: true
                }
            }
        });

        $('#rootwizard').bootstrapWizard({
            'tabClass': 'nav nav-pills',
            'onNext': function (tab, navigation, index) {
                var $valid = $("#commentForm").valid();
                if (!$valid) {
                    $validator.focusInvalid();
                    return false;
                }
            }
        });
        window.prettyPrint && prettyPrint()
    });
</script>

