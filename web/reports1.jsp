<%-- 
    Document   : reports
    Created on : Mar 26, 2015, 9:09:15 AM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Acount.Management.User"%>
<%
    //int currentIndividual = 0;
    String names = "";
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
    } else {
        String userId = (String) session.getAttribute("userId");
        for (User u : User.listUser()) {
            if (u.getId() == Integer.parseInt(userId)) {
                names = u.getFirstName() + " " + u.getLastName();
            }
        }
       // currentIndividual = (Integer) session.getAttribute("individualTicket");
    }

%>
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

        <script src="TPRS/bower_components/jquery/js/jquery.min.js"></script>
        <script src="TPRS/js/formToWizard.js"></script>
        <script>
            $(document).ready(function () {
                $('#vat').hide();
                $('#tin').hide();     
            });
            function showTin() {
                $('#vat').hide();
                $('#tin').show();
            }
            function showVat() {
                $('#tin').hide();
                $('#vat').show();
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
                        Reports
                        <small>NonIndividual Enterprise Reports</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">Reports</li>
                    </ol>
                </section>
                <section class="content">
                    <br>
                    <div class="row">
                        <div class="btn btn-group">
                            <a href="javascript:void(0)" onclick="showTin()">
                                <button class="btn btn-dropbox">
                                    <i class="fa fa-print fa-5x"></i>
                                    <br>
                                    TIN Certificate
                                </button>
                            </a>
                            <a href="javascript:void(0)" onclick="showVat()">
                                <button class="btn btn-instagram">
                                    <i class="fa fa-print fa-5x"></i>
                                    <br>
                                    VAT Certificate
                                </button>
                            </a>
                        </div>
                    </div>
                    <div id="tin">
                <div class="row">
                    <form action="TINCertificate1.jsp" method="POST">
             <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-8">
                    <label for="TinNumber"> TIN Number</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="tinNumber" required="">
                </div>
                <div class="col-lg-8">
                    <p class="text-center">
            <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="Preview" />
        </p>
                </div>
            </div>
        </div>
           </form>
                    </div>
                    </div>
                    <div id="vat">
                    <div class="row">
             <form action="VATCertificate1.jsp" method="POST">
             <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-8">
                    <label for="TinNumber"> TIN Number</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="tinNumber" placeholder="" required="">
                </div>
                <div class="col-lg-8">
                    <p class="text-center">
            <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="Preview" />
             </p>
                </div>
            </div>
        </div>
                    </form>
                    </div>
                    </div>
                </section>
            </div>
            <jsp:include page="TPRS/views/layouts/a/footer.jsp"/>
        </div>
        <script src="TPRS/bower_components/bootstrap/js/bootstrap.min.js"></script>
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <script src="TPRS/js/raphael-min.js"></script>
        <script src="TPRS/js/app.min.js" type="text/javascript"></script>
        <script src="TPRS/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
        <script src="TPRS/js/TPRS.js"></script>
    </body>
</html>
