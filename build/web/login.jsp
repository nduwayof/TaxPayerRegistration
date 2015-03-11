<%-- 
    Document   : login
    Created on : Mar 8, 2015, 11:46:03 AM
    Author     : Fabrice
--%>
<jsp:useBean id="lo" class="com.djuma.Acount.Management.Login" scope="request"/>
 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>TPRS | Login</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

        <link href="TPRS/bower_components/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/css/TPRS.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/css/custom.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="home.jsp"><b>TPRS</b> - Home</a>
            </div>
            <div class="login-box-body">
                <p class="login-box-msg">Sign in to start your session</p>
                <h10 class="errorMsg">${lo.error}</h10>
                <form action="loginProcess.jsp" method="post">
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" placeholder="username" name="username" required="" value="${lo.username}"/>
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" placeholder="password" name="password"/>
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">    
                            <div class="checkbox icheck">
                                <label>
                                    <input type="checkbox"> Remember Me
                                </label>
                            </div>                        
                        </div>
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <script src="TPRS/bower_components/jquery/js/jquery.min.js"></script>
        <script src="TPRS/bower_components/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="TPRS/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
        <script src="TPRS/js/TPRS.js"></script>
    </body>
</html>