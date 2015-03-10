package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>TPRS | Sign Up</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("\n");
      out.write("        <link href=\"TPRS/bower_components/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/css/TPRS.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"TPRS/plugins/iCheck/square/blue.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login-page\">\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            <div class=\"login-logo\">\n");
      out.write("                <a href=\"home.jsp\"><b>TPRS</b> - Home</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"login-box-body\">\n");
      out.write("                <p class=\"login-box-msg\">Sign in to start your session</p>\n");
      out.write("                <form action=\"#\" method=\"post\" id=\"signup\">\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"First Name\" name=\"fistName\"/>\n");
      out.write("                        <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Last Name\" name=\"lastName\"/>\n");
      out.write("                        <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <div class=\"radio icheck\">\n");
      out.write("                            <label><b>Gender :   </b></label>\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"option2\" value=\"male\" autocomplete=\"off\">Male\n");
      out.write("                            </label>\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"option3\" value=\"female\" autocomplete=\"off\"> Female\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\"/>\n");
      out.write("                        <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\"/>\n");
      out.write("                        <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Re-Enter Password\" name=\"confPassword\"/>\n");
      out.write("                        <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-8\">    \n");
      out.write("                            <div class=\"checkbox icheck\">\n");
      out.write("                                <label>\n");
      out.write("                                    Welcome\n");
      out.write("                                </label>\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-4\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Sign In</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"TPRS/bower_components/jquery/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"TPRS/bower_components/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"TPRS/plugins/iCheck/icheck.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"TPRS/js/TPRS.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
