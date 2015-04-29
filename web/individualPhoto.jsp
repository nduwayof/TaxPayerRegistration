<%-- 
    Document   : individualPhoto
    Created on : Apr 18, 2015, 10:20:32 PM
    Author     : SULAIMAN
--%>

<%@page import="com.djuma.Individual.Individual"%>
<%@page import="com.djuma.Acount.Management.User"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%
    int currentIndividual = 0;
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
        currentIndividual = (Integer) session.getAttribute("individualTicket");
    }

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <%
try{
           boolean isMultipart = ServletFileUpload.isMultipartContent(request);
           if(isMultipart){
FileItemFactory factory = new DiskFileItemFactory();
ServletFileUpload upload = new ServletFileUpload(factory);
List items = null;

String itemName="";
String ImageFile="";

try
{
items = upload.parseRequest(request);
}
catch (FileUploadException e)
{
e.getMessage();
}
 
Iterator itr = items.iterator();
while (itr.hasNext())
{

FileItem item = (FileItem) itr.next();
if (item.isFormField())
{
   
String name = item.getFieldName();
String value = item.getString();
if(name.equals("photo"))
{
ImageFile=value;
}
 
}
else
{
try
{
itemName = item.getName();
//File savedFile = new File(config.getServletContext().getRealPath("/")+"Example\\image-folder\\");
File savedFile = new File(config.getServletContext().getRealPath("/"));
if(!savedFile.exists()){
savedFile.mkdirs();
}

File f=new File(savedFile+"\\"+itemName);
item.write(f);
}
catch (Exception e)
{
out.println("Error"+e.getMessage());
}
}
}
try
{
Individual.saveIndividualPhoto(currentIndividual, itemName);
}
catch(Exception el)
{
out.println("Inserting error"+el.getMessage());
}
           
           }
    }catch(Exception e){
    out.println("Go home");
    }  
     response.sendRedirect("individual.jsp");
        %>
    </body>
</html>
