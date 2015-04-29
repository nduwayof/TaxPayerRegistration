<%-- 
    Document   : navbar
    Created on : Mar 8, 2015, 4:12:13 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Acount.Management.User"%>
<%
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
    }
%>
<header class="main-header">
    <a href="#" class="logo">
        <i class="glyphicon glyphicon-home"></i>
        <b> TPRS</b>
    </a>
    <nav class="navbar navbar-static-top" role="navigation">
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="TPRS/img/avatars/avatar2.png" class="img-circle" alt="User Image"/>
                        <span class="hidden-xs"><%=names%></span>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="TPRS/img/avatars/avatar2.png" class="img-circle" alt="User Image"/>
                            <p>
                                <%=names%>      [ <%=(user)%> ]
                            </p>
                        </li>
                        <li class="user-body">
                            
                        </li>
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">Profile</a>
                            </div>
                            <div class="pull-right">
                                <a href="logout.jsp" class="btn btn-default btn-flat">Sign out</a>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>