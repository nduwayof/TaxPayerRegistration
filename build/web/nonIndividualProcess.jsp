<%-- 
    Document   : nonIndividualProcess
    Created on : Mar 16, 2015, 3:17:00 PM
    Author     : SULAIMAN
--%>
<%@page import="com.djuma.Nonindividual_TaxPayerType"%>
<%@page import="com.djuma.NonIndividual_Activity"%>
<%@page import="com.djuma.NonIndividual_Address"%>
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
 currentIndividual=(Integer)session.getAttribute("nonIndividualTicket");
}

%>
<jsp:useBean id="co" class="com.djuma.CommonNonIndividual" scope="request">
    <jsp:setProperty name="co" property="*"/>    
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          
    String taxTypeValues[]=request.getParameterValues("taxTypeId");
        String type="";
        for(int i=0; i<taxTypeValues.length;i++){
            type+=taxTypeValues[i];
        }
        String mainSectorActivity[]=request.getParameterValues("mainSectorActivity");
        String sectors="";
        for(int i=0; i<mainSectorActivity.length;i++){
        sectors+=mainSectorActivity[i];
        }
         String mainSourceOfIncome=request.getParameter("mainSourceOfIncome");
            if(mainSourceOfIncome.equalsIgnoreCase("Other")){
            co.setMainSourceOfIncome(request.getParameter("otherMainSourceOfIncome"));
            }else{
            co.setMainSourceOfIncome(mainSourceOfIncome);
            }
        co.setNonIndividualId(currentIndividual);
        co.setTaxTypeId(type);
        co.setMainSectorActivity(sectors);
        co.setDoneBy(names);
        co.saveCommonNonIndividual();
        NonIndividual_Address n=new NonIndividual_Address();
        n.setPlotNo(request.getParameter("plotNo"));
        n.setStreet(request.getParameter("street"));
        n.setDistrict(request.getParameter("district"));
        n.setProvince(request.getParameter("province"));
        n.setSector(request.getParameter("sector"));
        n.setMailHouseNo(request.getParameter("mailPlotNo"));
        n.setMailStreet(request.getParameter("mailStreet"));
        n.setMailPoBox(request.getParameter("mailPoBox"));
        n.setMailCity(request.getParameter("mailCity"));
        n.setMailSector(request.getParameter("mailSector"));
        n.setMailDistrict(request.getParameter("mailDistrict"));
        n.setMailProvince(request.getParameter("mailProvince"));
        n.setNonIndividualId(currentIndividual);
       // n.saveAddress();
        Nonindividual_TaxPayerType nt=new Nonindividual_TaxPayerType();
        nt.setNonIndividualId(currentIndividual);
        nt.SaveTaxPayerType(Double.parseDouble(request.getParameter("estmatedAnnualTurnOver")));
        response.sendRedirect("nonindividualBanks.jsp");
        %>
    </body>
</html>
