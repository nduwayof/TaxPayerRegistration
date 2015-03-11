<%-- 
    Document   : sidebar
    Created on : Mar 8, 2015, 4:14:22 PM
    Author     : Fabrice
--%>
<%@page import="com.djuma.Acount.Management.User"%>
<%
String names="";
String user=(String)session.getAttribute("userRole");
if(user==null){
%>
<jsp:forward page="login.jsp"/>
<%
}else{
String userId=(String)session.getAttribute("userId");
for(User u: User.listUser()){
    if(u.getId()==Integer.parseInt(userId)){
    names=u.getFirstName()+" "+u.getLastName();
    }
}
}
%>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="TPRS/img/avatars/avatar2.png" class="img-circle" alt="User Image"/>
            </div>
            <div class="pull-left info">
                <p><%=names%></p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <%--
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search..."/>
                <span class="input-group-btn">
                    <button type='submit' name='search' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                </span>
            </div>
        </form>
        --%>
        <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
            <li class="actve">
                <a href="#">
                    <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                </a>
            </li>
            <%
            if(!user.equalsIgnoreCase("admin")){
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
                    <li><a href="#"><i class="fa fa-circle-o"></i> Non Individual</a></li>
                </ul>
            </li>
            <%
            }
            %>
            <%
            if(user.equalsIgnoreCase("admin")){
            %>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-th"></i>
                    <i class="fa fa-angle-left pull-right"></i>
                    <span>System Accounts</span>
                    <span class="label label-primary pull-right">2</span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="../../../../signup.jsp"><i class="fa fa-circle-o"></i>Accounts Management</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Account </a></li>
                </ul>
            </li>
            <%
            }
            %>
            
        </ul>
    </section>
</aside>