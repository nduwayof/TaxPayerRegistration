<%-- 
    Document   : nonIndividual
    Created on : Mar 14, 2015, 4:01:32 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.NonIndividual"%>
<%
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
} else {
        String userId = (String) session.getAttribute("userId");
        int lastTicket=NonIndividual.getLastTicket();
        int ticket=0;
        if(NonIndividual.createNewTicket(lastTicket)){
        NonIndividual in=new NonIndividual();
        in.SaveNonIndividual();
        ticket=NonIndividual.getLastTicket();
        }else{
          ticket=lastTicket;
        }
        session.setAttribute("nonIndividualTicket", ticket);
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TPRS</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <link href="TPRS/bower_components/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" /> 
        <link href="TPRS/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/bower_components/ionicons/css/ionicons.min.css" rel="stylesheet" type="text/css" />    
        <link href="TPRS/css/TPRS.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/iCheck/flat/blue.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/datepicker/datepicker3.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/bower_components/chosen/chosen.min.css" rel="stylesheet" type="text/css" />    



        <style type="text/css">
            fieldset { border:none;}
            legend { font-size:18px; margin:0px; padding:10px 0px; color:#b0232a; font-weight:bold;}
            label { display:block; margin:15px 0 5px;}
            input[type=text], input[type=password] { padding:5px; border:solid 1px #000;}
            .prev, .next { background-color:#b0232a; padding:5px 10px; color:#fff; text-decoration:none;}
            .prev:hover, .next:hover { background-color:#000; text-decoration:none;}
            .prev { float:left;}
            .next { float:right;}
            #steps { list-style:none; width:100%; overflow:hidden; margin:0px; padding:0px;}
            #steps li {font-size:24px; float:left; padding:10px; color:#b0b1b3;}
            #steps li span {font-size:11px; display:block;}
            #steps li.current { color:#000;}
            #makeWizard { background-color:#b0232a; color:#fff; padding:5px 10px; text-decoration:none; font-size:18px;}
            #makeWizard:hover { background-color:#000;}
        </style>

        <script src="TPRS/bower_components/jquery/js/jquery.min.js"></script>
        <script src="TPRS/js/formToWizard.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#SignupForm").formToWizard({submitButton: 'SaveAccount'});
                
                $('#individual').hide();
                $('#nonIndividual').hide();
                $('#deceasedDate').hide();
                $('#civilId').hide();
                $('#residentFabrice').hide();
                $('#mailingAddress').hide();
                 $('#businessActivity').hide();
                 $('#oldTin').hide();
            });
            
             function showIndividual() {
                $('#nonIndividual').hide();
                $('#individual').show();
                Location.reload();
            }
            function showNonIndividual() {
                $('#individual').hide();
                $('#nonIndividual').show();
                Location.reload();
            }
            function showDeceaseDate() {
                $('#deceasedDate').show();
            }
            function hideDeceaseDate() {
                $('#deceasedDate').hide();
            }
            function showCivil() {
                $('#civilId').show();

            }
            function hideCivil() {
                $('#civilId').hide();

            }
            function showresidentFabrice() {
                $('#residentFabrice').show();

            }
            function hideresidentFabrice() {
                $('#residentFabrice').hide();

            }
            function showMailing(){
                $('#mailingAddress').show();
            }
            function hideMailing(){
                $('#mailingAddress').hide();
            }
            function showBusiness(){
                $('#businessActivity').show();
            }
            function hideBusiness(){
                $('#businessActivity').hide();
            }
            function showOldTin(){
                $('#oldTin').show();
            }
            function hideOldTin(){
                $('#oldTin').hide();
            }
        </script>
    </head>
    <body class="skin-blue">
        <div class="wrapper">
            <jsp:include page="TPRS/views/layouts/b/navbar.jsp"/>
            <jsp:include page="TPRS/views/layouts/b/sidebar.jsp"/>
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>
                        Register
                        <small>Individual Enterprise</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">New Enterprise</li>
                    </ol>
                </section>
                <section class="content">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h3>New Non Individual Enterprise</h3>
                        </div>
                        <div class="panel-body">
                            <jsp:include page="TPRS/views/app/nonIndividualWizard.jsp"/>
                        </div>
                    </div>
                </section>
            </div>
            <jsp:include page="TPRS/views/layouts/a/footer.jsp"/>
        </div>
        <script src="TPRS/bower_components/bootstrap/js/bootstrap.min.js"></script>
        <script src="TPRS/bower_components/chosen/chosen.jquery.min.js"></script>
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <script>
            jQuery(document).ready(function () {
                jQuery(".chosen").chosen();
            });
        </script>
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <script src="TPRS/js/raphael-min.js"></script>
        <script src="TPRS/js/app.min.js" type="text/javascript"></script>
        <script src="TPRS/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
        <script src="TPRS/js/TPRS.js"></script>
    </body>
</html>
