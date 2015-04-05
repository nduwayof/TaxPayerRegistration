package org.apache.jsp.TPRS.Reports;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.djuma.Tax.TaxPayerType;
import com.djuma.Acount.Management.User;

public final class SizeOfTax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    int currentIndividual=0;
    String names="";
    String user = (String) session.getAttribute("userRole");
    if (user == null) {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write('\n');

} else {
String userId = (String) session.getAttribute("userId");
        for (User u : User.listUser()) {
            if (u.getId() == Integer.parseInt(userId)) {
                names = u.getFirstName() + " " + u.getLastName();
            }
        }
 //currentIndividual=(Integer)session.getAttribute("individualTicket");
}


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TPRS</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("        <link href=\"TPRS/bower_components/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" /> \n");
      out.write("        <link href=\"TPRS/bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/bower_components/ionicons/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />    \n");
      out.write("        <link href=\"TPRS/css/TPRS.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/plugins/iCheck/flat/blue.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/plugins/datepicker/datepicker3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/plugins/daterangepicker/daterangepicker-bs3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/plugins/iCheck/square/blue.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/css/custom.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <script src=\"TPRS/bower_components/jquery/js/jquery.min.js\"></script>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body class=\"skin-blue\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TPRS/views/layouts/b/navbar.jsp", out, false);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TPRS/views/layouts/b/sidebar.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Size Of Tax Report\n");
      out.write("                        <small>Enterprise</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i>Home</a></li>\n");
      out.write("                        <li class=\"active\">Size of Tax</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"panel panel-success\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3>Size Of Tax</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("                                  <form method=\"POST\" action=\"SizeOfTaxReport.jsp\">\n");
      out.write("\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <label for=\"taxType\">Choose Size of Tax</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <select name=\"sizeOfTax\">\n");
      out.write("                    ");

                        for (TaxPayerType t : TaxPayerType.listTaxPayerType()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(t.getId());
      out.write('"');
      out.write('>');
      out.print(t.getTaxpayerType());
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                                    <input id=\"SaveAccount\" class=\"btn btn-success btn-lg\" type=\"submit\" value=\"preview\" />\n");
      out.write("                    </div>\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TPRS/views/layouts/a/footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"TPRS/bower_components/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("        </script>\n");
      out.write("        <script src=\"TPRS/js/raphael-min.js\"></script>\n");
      out.write("        <script src=\"TPRS/js/app.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"TPRS/plugins/iCheck/icheck.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"TPRS/js/TPRS.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
