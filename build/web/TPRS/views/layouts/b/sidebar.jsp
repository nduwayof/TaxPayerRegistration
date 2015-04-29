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
                <a href="index.jsp">
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
                    <span>Register Business</span>
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
                    <span>DeRegister Business</span>
                    <span class="label label-primary pull-right">2</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="deRegistration.jsp"><i class="fa fa-circle-o"></i> Individual</a></li>
                    <li><a href="deRegistration1.jsp"><i class="fa fa-circle-o"></i> NonIndividual</a></li>
                </ul>
            </li>
             <li class="treeview">
                <a href="#">
                    <i class="fa fa-file"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>Reports -Individual</span>
                    <span class="label label-primary pull-right">8</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="reports.jsp"><i class="fa fa-circle-o"></i>Certificates</a></li>
                    <li><a href="ByLocation.jsp"><i class="fa fa-circle-o"></i>By Location</a></li>
                    <li><a href="SizeOfTaxReport.jsp"><i class="fa fa-circle-o"></i>By Size</a></li>
                    <!--
                    <li><a href="#"><i class="fa fa-circle-o"></i>By Enterprise Type</a></li>
                    -->
                    <li><a href="ByIndustryReport.jsp"><i class="fa fa-circle-o"></i>By Industry</a></li>
                    <li><a href="ByTaxTypeReport.jsp"><i class="fa fa-circle-o"></i> By Tax Type</a></li>
                    <!--
                    <li><a href="#"><i class="fa fa-circle-o"></i>By Investment incentives</a></li>
                    -->
                    <li><a href="BySourceIncomeReport.jsp"><i class="fa fa-circle-o"></i>By Source of Income</a></li>
                    <li><a href="ByAccountingRegimeReport.jsp"><i class="fa fa-circle-o"></i>By Accounting Regime</a></li>
                    <li><a href="ByYearReport.jsp"><i class="fa fa-circle-o"></i>Registered Business By Year</a></li>
                </ul>
            </li>
             <li class="treeview">
                <a href="#">
                    <i class="fa fa-file"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>Reports -NonIndividual</span>
                    <span class="label label-primary pull-right">9</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="reports1.jsp"><i class="fa fa-circle-o"></i>Certificates</a></li>
                    <li><a href="ByLocation1.jsp"><i class="fa fa-circle-o"></i>By Location</a></li>
                    <li><a href="SizeOfTaxReport1.jsp"><i class="fa fa-circle-o"></i>By Size</a></li>
                    <li><a href="ByEnterpriseType.jsp"><i class="fa fa-circle-o"></i>By Enterprise Type</a></li>
                    <li><a href="ByIndustryReport1.jsp"><i class="fa fa-circle-o"></i>By Industry</a></li>
                    <li><a href="ByTaxTypeReport1.jsp"><i class="fa fa-circle-o"></i> By Tax Type</a></li>
                    <!--
                    <li><a href="#"><i class="fa fa-circle-o"></i>By Investment incentives</a></li>
                    -->
                    <li><a href="BySourceIncomeReport1.jsp"><i class="fa fa-circle-o"></i>By Source of Income</a></li>
                    <li><a href="ByAccountingRegimeReport1.jsp"><i class="fa fa-circle-o"></i>By Accounting Regime</a></li>
                    <li><a href="ByYearReport1.jsp"><i class="fa fa-circle-o"></i>Registered Business By Year</a></li>
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
                    <li><a href="listNonIdividual.jsp"><i class="fa fa-circle-o"></i> Non Individual</a></li>
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