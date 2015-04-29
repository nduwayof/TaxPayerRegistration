<%-- 
    Document   : deRegistration
    Created on : Mar 16, 2015, 3:55:19 PM
    Author     : Fabrice
--%>

<%@page import="com.djuma.Acount.Management.User"%>
<%
    int currentIndividual=0;
    String names="";
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
 //currentIndividual=(Integer)session.getAttribute("individualTicket");
}

%>
<jsp:useBean id="d" class="com.djuma.Individual.Individual_Deregistration" scope="request">
</jsp:useBean>
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
        <link href="TPRS/css/custom.css" rel="stylesheet" type="text/css" />

        <script src="TPRS/bower_components/jquery/js/jquery.min.js"></script>
      
    </head>
    <body class="skin-blue">
        <div class="wrapper">
            <jsp:include page="TPRS/views/layouts/b/navbar.jsp"/>
            <jsp:include page="TPRS/views/layouts/b/sidebar.jsp"/>
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>
                        De-Register
                        <small>Enterprise</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">De-Registration</li>
                    </ol>
                </section>
                <section class="content">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h3>De-Register Enterprise</h3>
                        </div>
                        <div class="panel-body">
                            <div>
                                <h5 class="errorMsg">${d.error}</h5>
                                <h5 class="infoMsg">${d.info}</h5>

                            </div>
                            <form action="deregistrationProcess.jsp" method="POST">                       
                            <div class="row">
        <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="tinNumber">TIN</label>
                </div>
                <div class="col-lg-8">
                    <input type="text" class="form-control" name="tinNumber" required="" value="${d.tinNumber}">
                </div>
            </div>
        </div>
            </div>
                            <br/>
            <div class="row">
            <div class="col-lg-6">
            <div class="form-group">
                <div class="col-lg-4">
                    <label for="">Reason</label>
                </div>
                <div class="col-lg-4">
                    <textarea name="thereason" rows="4" cols="20" maxlength="255">
                    
                    </textarea>
                </div>
            </div>
        </div>
        </div>
           <p class="text-left">
            <input id="SaveAccount" class="btn btn-success btn-lg" type="submit" value="Submit" />
        </p>
                                    </form>  

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
