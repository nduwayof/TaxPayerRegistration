<%-- 
    Document   : signup
    Created on : Mar 8, 2015, 12:04:54 PM
    Author     : Fabrice
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>TPRS | Sign Up</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

        <link href="TPRS/bower_components/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/css/TPRS.css" rel="stylesheet" type="text/css" />
        <link href="TPRS/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="home.jsp"><b>TPRS</b> - Home</a>
            </div>
            <div class="login-box-body">
                <p class="login-box-msg">Sign in to start your session</p>
                <form action="#" method="post" id="signup">
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" placeholder="First Name" name="fistName"/>
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" placeholder="Last Name" name="lastName"/>
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <div class="radio icheck">
                            <label><b>Gender :   </b></label>
                            <label>
                                <input type="radio" name="gender" id="option2" value="male" autocomplete="off">Male
                            </label>
                            <label>
                                <input type="radio" name="gender" id="option3" value="female" autocomplete="off"> Female
                            </label>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" placeholder="Username" name="username"/>
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" placeholder="Password" name="password"/>
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" placeholder="Re-Enter Password" name="confPassword"/>
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">    
                            <div class="checkbox icheck">
                                <label>
                                    Welcome
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