<%-- 
    Document   : industry
    Created on : Mar 25, 2015, 11:08:45 AM
    Author     : Fabrice
--%>

<%@page import="com.djuma.Sector.Industry"%>
<%@page import="com.djuma.Individual.Individual"%>
<!DOCTYPE html>
<jsp:useBean id="in" class="com.djuma.Sector.Industry" scope="request"/>
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
    </head>
    <body class="skin-blue">
        <div class="wrapper">
            <jsp:include page="TPRS/views/layouts/b/navbar.jsp"/>
            <jsp:include page="TPRS/views/layouts/b/sidebar.jsp"/>
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>
                        Industry
                        <small>Individual Enterprise</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">New Industry</li>
                    </ol>
                </section>
                <section class="content">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h3>New Industry Type</h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" action="industryProcess.jsp" method="POST">
                                <div class="form-group">
                                    <div class="col-sm-4">
                                        <label>Name</label>
                                    </div>
                                    <div class="col-sm-8">
                                        <input type="text" name="name" class="form-control" required="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-4">
                                        <label>Description</label>
                                    </div>
                                    <div class="col-sm-8">
                                        <textarea name="description" class="form-control"></textarea>
                                    </div>
                                </div>
                                <div class="pull-right">
                                    <input type="submit" value="Save New Industry" class="btn btn-primary btn-lg">
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="col-xs-12">
        <div class="box">
        <div class="box-header">
            <h3 class="box-title">List Of Industries</h3>
        </div>
        <div class="box-body">
            <table id="example1" class="table table-bordered table-striped table-hover table-mailbox" border="1">
                <thead>
                    <tr>
                        <th class="bg-blue">Name</th>
                        <th class="bg-blue">Description</th>               
                    </tr>
                </thead>
                <tbody>
                    <%
                    for(Industry ins: Industry.listIndistry()){
                    %>
                     <tr>
                        <td><%=ins.getName()%></td>
                        <td><%=ins.getDescription()%></td>
                    </tr>
                    <%
                    }
                    %>
    
                </tbody>
                <tfoot>
                    <tr>
                        <th class="bg-blue">Name</th>
                        <th class="bg-blue">Description</th>  
                    </tr>
                </tfoot>
            </table>
        </div>
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