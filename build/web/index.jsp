<%-- 
    Document   : index
    Created on : Mar 8, 2015, 12:31:54 PM
    Author     : Fabrice
--%>
<%
    String user = (String) session.getAttribute("userRole");
    if (user == null) {
%>
<jsp:forward page="login.jsp"/>
<%
    } else {
        String userId = (String) session.getAttribute("userId");
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

        <script type="text/javascript" src="TPRS/Library/jsapi.js"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          ['Individual',     10],
          ['NonIndividual',     5],                             
        ]);

        var options = {
          title: 'Bussiness Registered'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
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
                        Dashboard
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>
                <section class="content">
                    <div id="piechart" style="width: 900px; height: 500px;"></div>
                </section>
            </div>
            <jsp:include page="TPRS/views/layouts/a/footer.jsp"/>
        </div>

        <script src="TPRS/plugins/jQuery/jQuery-2.1.3.min.js"></script>
        <script src="TPRS/bower_components/bootstrap/js/bootstrap.min.js"></script>
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <script src="TPRS/js/raphael-min.js"></script>
        <%--
        <script src="plugins/morris/morris.min.js" type="text/javascript"></script>
        <script src="plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
        <script src="plugins/jqueryKnob/jquery.knob.js" type="text/javascript"></script>
        <script src="plugins/daterangepicker/daterangepicker.js" type="text/javascript"></script>
        <script src="plugins/datepicker/bootstrap-datepicker.js" type="text/javascript"></script>
        <script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" type="text/javascript"></script>
        <script src="plugins/iCheck/icheck.min.js" type="text/javascript"></script>
        <script src="plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src='plugins/fastclick/fastclick.min.js'></script>
        --%>
        <script src="TPRS/js/app.min.js" type="text/javascript"></script>
        <script src="TPRS/js/TPRS.js"></script>
    </body>
</html>
