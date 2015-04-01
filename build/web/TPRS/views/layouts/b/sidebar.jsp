<%-- 
    Document   : sidebar
    Created on : Mar 8, 2015, 4:14:22 PM
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
<aside class="main-sidebar">
    <section class="sidebar">
        <div class="user-panel">
            <div class="pull-left image">
                <img src="TPRS/img/avatars/avatar2.png" class="img-circle" alt="User Image"/>
            </div>
            <div class="pull-left info">
                <p><%=names%></p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
      
        <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
            <li class="actve">
                <a href="#">
                    <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                </a>
            </li>
            <%
                if (!user.equalsIgnoreCase("admin")) {
            %>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-file"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>Register Enterprises</span>
                    <span class="label label-primary pull-right">2</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="individual.jsp"><i class="fa fa-circle-o"></i> Individual</a></li>
                    <li><a href="nonIndividual.jsp"><i class="fa fa-circle-o"></i> Non Individual</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-file"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>DeRegister Enterprises</span>
                    <span class="label label-primary pull-right">1</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="deRegistration.jsp"><i class="fa fa-circle-o"></i> DeRegister</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-file"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>View Enterprises</span>
                    <span class="label label-primary pull-right">2</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="listIndividual.jsp"><i class="fa fa-circle-o"></i> Individual</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Non Individual</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-file"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>Reports</span>
                    <span class="label label-primary pull-right">1</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="reports.jsp"><i class="fa fa-circle-o"></i>Reports</a></li>
                </ul>
            </li>
            <%
                }
            %>
            <%
                if (user.equalsIgnoreCase("admin")) {
            %>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-th"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>System Accounts</span>
                    <span class="label label-primary pull-right">1</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="signup.jsp"><i class="fa fa-circle-o"></i>Accounts Management</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-th"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>Settings</span>
                    <span class="label label-primary pull-right">2</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="industry.jsp"><i class="fa fa-circle-o"></i>Industries</a></li>
                    <li><a href="sector.jsp"><i class="fa fa-circle-o"></i>Sectors</a></li>
                </ul>
            </li>
            <%
                }
            %>

        </ul>
    </section>
</aside>