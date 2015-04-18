<%-- 
    Document   : individualProcess
    Created on : Mar 14, 2015, 9:05:25 PM
    Author     : SULAIMAN
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>

<%@page import="com.djuma.Acount.Management.User"%>
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
<%@page import="com.djuma.Individual.Individual"%>
<jsp:useBean id="c" class="com.djuma.Individual.CommonIndividual" scope="request">
    <jsp:setProperty name="c" property="*"/>
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process</title>
    </head>
    <body>
        <%             try {
                boolean isMultipart = ServletFileUpload.isMultipartContent(request);
                if (isMultipart) {
                    FileItemFactory factory = new DiskFileItemFactory();
                    ServletFileUpload upload = new ServletFileUpload(factory);
                    List items = null;
                    String itemName = "";
                    String ImageFile = "";

                    String ownerSurname = "";
                    String ownerFirstName = "";
                    String dob = "";
                    String deceadDate = "";
                    String gender = "";
                    String occupation = "";
                    String nationality = "";
                    String nationalId = "";
                    String socialSecurityNumber = "";
                    String passport = "";
                    String homePhone = "";
                    String workPhone = "";
                    String cellPhone = "";
                    String faxNo = "";
                    String resident = "0";
                    String countryOfResidence = "";
                    String civilStatus = "";
                    String mariageName = "";
                    String mariageSurname = "";
                    String mariageDob = "";
                    String photo = "";
                    String notionalPhotocopy = "";
                    String tinNumber = "";
                    String oldTinNumber = "";

                    //String taxPayerTypeId = "";

//individual TaxType
                    //private int individualId;
                    String taxTypeId = "";

                    boolean businessActivty = false;
                    double estmatedAnnualTurnOver = 0;
                    int estimatedNumberOfEmployees = 0;
                    String accountingMethod = "";
                    String mainSourceOfIncome = "";
                    String employmentMethod = "";
                    boolean businessPremiseRented = false;
                    //private int individualId;
                    int sectorId = 0;
                    String mainSectorActivity = "";

                    String plotNo = "";
                    String street = "";
                    String sector = "";
                    String district = "";
                    String province = "";
                    String mailingAddress = "";
                    String mailHouseNo = "";
                    String mailStreet = "";
                    String mailPoBox = "";
                    String mailCity = "";
                    String mailSector = "";
                    String mailDistrict = "";
                    String mailProvince = "";

                    String taxpayerRepresentativeName = "";
                    String representativeTitle = "";
                    String representativePhoneNo = "";
                    String contactName = "";
                    String contactTitle = "";
                    String contactPhoneNo = "";

                    try {
                        items = upload.parseRequest(request);
                    } catch (FileUploadException e) {
                        e.getMessage();
                    }

                    Iterator itr = items.iterator();
                    while (itr.hasNext()) {

                        FileItem item = (FileItem) itr.next();
                        if (item.isFormField()) {

                            String name = item.getFieldName();
                            String value = item.getString();
                            
                            if (name.equals("photo")) {
                                photo = value;
                            } else if (name.equalsIgnoreCase("notionalPhotocopy")) {
                                notionalPhotocopy = value;
                            } else if (name.equalsIgnoreCase("ownerSurname")) {
                                ownerSurname = value;
                            } else if (name.equalsIgnoreCase("ownerFirstName")) {
                                ownerFirstName = value;
                            } else if (name.equalsIgnoreCase("dob")) {
                                dob = value;
                            } else if (name.equalsIgnoreCase("gender")) {
                                gender = value;
                            } else if (name.equalsIgnoreCase("deceadDate")) {
                                deceadDate = value;
                            } else if (name.equalsIgnoreCase("occupation")) {
                                occupation = value;
                            } else if (name.equalsIgnoreCase("nationality")) {
                                nationality = value;
                            } else if (name.equalsIgnoreCase("nationalId")) {
                                nationalId = value;
                            } else if (name.equalsIgnoreCase("socialSecurityNumber")) {
                                socialSecurityNumber = value;
                            } else if (name.equalsIgnoreCase("passport")) {
                                passport = value;
                            } else if (name.equalsIgnoreCase("homePhone")) {
                                homePhone = value;
                            } else if (name.equalsIgnoreCase("workPhone")) {
                                workPhone = value;
                            } else if (name.equalsIgnoreCase("cellPhone")) {
                                cellPhone = value;
                            } else if (name.equalsIgnoreCase("faxNo")) {
                                faxNo = value;
                            } else if (name.equalsIgnoreCase("resident")) {
                                resident = value;
                            } else if (name.equalsIgnoreCase("countryOfResidence")) {
                                countryOfResidence = value;
                            } else if (name.equalsIgnoreCase("civilStatus")) {
                                civilStatus = value;
                            } else if (name.equalsIgnoreCase("mariageName")) {
                                mariageName = value;
                            } else if (name.equalsIgnoreCase("mariageSurname")) {
                                mariageSurname = value;
                            } else if (name.equalsIgnoreCase("mariageDob")) {
                                mariageDob = value;
                            } else if (name.equalsIgnoreCase("oldTinNumber")) {
                                oldTinNumber = value;
                            }
                            //else if (name.equalsIgnoreCase("taxPayerTypeId")) {
                              //  taxPayerTypeId = value;
                            //} 
                            else if (name.equalsIgnoreCase("taxTypeId")) {
                                taxTypeId = value;
                            } else if (name.equalsIgnoreCase("businessActivty")) {
                                businessActivty = Boolean.parseBoolean(value);
                            } else if (name.equalsIgnoreCase("estmatedAnnualTurnOver")) {
                                estmatedAnnualTurnOver = Double.parseDouble(value);
                            } else if (name.equalsIgnoreCase("estimatedNumberOfEmployees")) {
                                estimatedNumberOfEmployees = Integer.parseInt(value);
                            } else if (name.equalsIgnoreCase("accountingMethod")) {
                                accountingMethod = value;
                            } else if (name.equalsIgnoreCase("mainSourceOfIncome")) {
                                mainSourceOfIncome = value;
                            } else if (name.equalsIgnoreCase("employmentMethod")) {
                                employmentMethod = value;
                            } else if (name.equalsIgnoreCase("businessPremiseRented")) {
                                businessPremiseRented = Boolean.parseBoolean(value);
                            } else if (name.equalsIgnoreCase("sectorId")) {
                                sectorId = Integer.parseInt(value);
                            } else if (name.equalsIgnoreCase("mainSectorActivity")) {
                                mainSectorActivity = value;
                            } else if (name.equalsIgnoreCase("plotNo")) {
                                plotNo = value;
                            } else if (name.equalsIgnoreCase("street")) {
                                street = value;
                            } else if (name.equalsIgnoreCase("sector")) {
                                sector = value;
                            } else if (name.equalsIgnoreCase("district")) {
                                district = value;
                            } else if (name.equalsIgnoreCase("province")) {
                                province = value;
                            } else if (name.equalsIgnoreCase("mailingAddress")) {
                                mailingAddress = value;
                            } else if (name.equalsIgnoreCase("mailHouseNo")) {
                                mailHouseNo = value;
                            } else if (name.equalsIgnoreCase("mailStreet")) {
                                mailStreet = value;
                            } else if (name.equalsIgnoreCase("mailPoBox")) {
                                mailPoBox = value;
                            } else if (name.equalsIgnoreCase("mailCity")) {
                                mailCity = value;
                            } else if (name.equalsIgnoreCase("mailSector")) {
                                mailSector = value;
                            } else if (name.equalsIgnoreCase("mailDistrict")) {
                                mailDistrict = value;
                            } else if (name.equalsIgnoreCase("mailProvince")) {
                                mailProvince = value;
                            } else if (name.equalsIgnoreCase("taxpayerRepresentativeName")) {
                                taxpayerRepresentativeName = value;
                            } else if (name.equalsIgnoreCase("representativeTitle")) {
                                representativeTitle = value;
                            } else if (name.equalsIgnoreCase("representativePhoneNo")) {
                                representativePhoneNo = value;
                            } else if (name.equalsIgnoreCase("contactName")) {
                                contactName = value;
                            } else if (name.equalsIgnoreCase("contactTitle")) {
                                contactTitle = value;
                            } else if (name.equalsIgnoreCase("contactPhoneNo")) {
                                contactPhoneNo = value;
                            }

                        } else {
                            try {
                                itemName = item.getName();
//File savedFile = new File(config.getServletContext().getRealPath("/")+"Example\\image-folder\\");
                                File savedFile = new File(config.getServletContext().getRealPath("/"));
                                if (!savedFile.exists()) {
                                    savedFile.mkdirs();
                                }

                                File f = new File(savedFile + "\\" + itemName);
                                item.write(f);
                            } catch (Exception e) {
                                out.println("Error" + e.getMessage());
                            }
                        }
                    }
                    try {
                        c.setOwnerSurname(ownerSurname);
                        c.setOwnerFirstName(ownerFirstName);
                        c.setDob(dob);
                        c.setDeceadDate(deceadDate);
                        c.setGender(gender);
                        c.setOccupation(occupation);
                        c.setNationality(nationality);
                        c.setNationalId(nationalId);
                        c.setSocialSecurityNumber(socialSecurityNumber);
                        c.setPassport(passport);
                        c.setHomePhone(homePhone);
                        c.setWorkPhone(workPhone);
                        c.setCellPhone(cellPhone);
                        c.setFaxNo(faxNo);
                        c.setResident(resident);
                        c.setCountryOfResidence(countryOfResidence);
                        c.setCivilStatus(civilStatus);
                        c.setMariageName(mariageName);
                        c.setMariageSurname(mariageSurname);
                        c.setMariageDob(mariageDob);
                        c.setPhoto(itemName);
                        c.setNotionalPhotocopy(itemName);
                        c.setOldTinNumber(oldTinNumber);
                        //c.setTaxPayerTypeId(taxPayerTypeId);
                        c.setTaxTypeId(taxTypeId);
                        c.setBusinessActivty(businessActivty);
                        c.setEstmatedAnnualTurnOver(estmatedAnnualTurnOver);
                        c.setEstimatedNumberOfEmployees(estimatedNumberOfEmployees);
                        c.setAccountingMethod(accountingMethod);
                        c.setMainSourceOfIncome(mainSourceOfIncome);
                        c.setEmploymentMethod(employmentMethod);
                        c.setBusinessPremiseRented(businessPremiseRented);
                        c.setSectorId(sectorId);
                        c.setMainSectorActivity(mainSectorActivity);
                        c.setPlotNo(plotNo);
                        c.setStreet(street);
                        c.setSector(sector);
                        c.setDistrict(district);
                        c.setProvince(province);
                        c.setMailHouseNo(mailHouseNo);
                        c.setMailingAddress(mailingAddress);
                        c.setMailStreet(mailStreet);
                        c.setMailPoBox(mailPoBox);
                        c.setMailCity(mailCity);
                        c.setMailSector(mailSector);
                        c.setMailDistrict(mailDistrict);
                        c.setMailProvince(mailProvince);
                        c.setTaxpayerRepresentativeName(taxpayerRepresentativeName);
                        c.setRepresentativeTitle(representativeTitle);
                        c.setRepresentativePhoneNo(representativePhoneNo);
                        c.setContactName(contactName);
                        c.setContactTitle(contactTitle);
                        c.setContactPhoneNo(contactPhoneNo);
                    } catch (Exception el) {
                        out.println("Inserting error" + el.getMessage());
                    }

                }
            } catch (Exception e) {
                out.println("Go home");
            }
            c.setIndividualId(currentIndividual);
            c.setDoneBy(names);
            c.saveIndividualInfo();
            response.sendRedirect("individual.jsp");
        %>
        <%
        //c.setIndividualId(currentIndividual);
            //c.setDoneBy(names);
            //c.saveIndividualInfo();
            //response.sendRedirect("individual.jsp");
%>
    </body>
</html>

