package org.apache.jsp.TPRS.views.app;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class individual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"../../bower_components/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"../../css/prettify.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<div class='container'>\n");
      out.write("\n");
      out.write("    <section id=\"wizard\">\n");
      out.write("        <div class=\"page-header\">\n");
      out.write("            <h1>Basic Pills Wizard</h1>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"rootwizard\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#tab1\" data-toggle=\"tab\">First</a></li>\n");
      out.write("                    <li><a href=\"#tab2\" data-toggle=\"tab\">Second</a></li>\n");
      out.write("                    <li><a href=\"#tab3\" data-toggle=\"tab\">Third</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane\" id=\"tab1\">\n");
      out.write("                        <div class=\"control-group\">\n");
      out.write("                            <label class=\"control-label\" for=\"email\">Email</label>\n");
      out.write("                            <div class=\"controls\">\n");
      out.write("                                <input type=\"text\" id=\"emailfield\" name=\"emailfield\" class=\"required email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"control-group\">\n");
      out.write("                            <label class=\"control-label\" for=\"name\">Name</label>\n");
      out.write("                            <div class=\"controls\">\n");
      out.write("                                <input type=\"text\" id=\"namefield\" name=\"namefield\" class=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane\" id=\"tab2\">\n");
      out.write("                        <div class=\"control-group\">\n");
      out.write("                            <label class=\"control-label\" for=\"url\">URL</label>\n");
      out.write("                            <div class=\"controls\">\n");
      out.write("                                <input type=\"text\" id=\"urlfield\" name=\"urlfield\" class=\"required url\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane\" id=\"tab3\">\n");
      out.write("                        3\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"pager wizard\">\n");
      out.write("                        <li class=\"previous first\" style=\"display:none;\"><a href=\"#\">First</a></li>\n");
      out.write("                        <li class=\"previous\"><a href=\"#\">Previous</a></li>\n");
      out.write("                        <li class=\"next last\" style=\"display:none;\"><a href=\"#\">Last</a></li>\n");
      out.write("                        <li class=\"next\"><a href=\"#\">Next</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("<script src=\"../../bower_components/jquery/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"../../bower_components/jquery/js/jquery.validate.min.js\"></script>\n");
      out.write("<script src=\"../../bower_components/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../../bower_components/jquery/js/jquery.bootstrap.wizard.js\"></script>\n");
      out.write("<script src=\"../../js/prettify.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        var $validator = $(\"#commentForm\").validate({\n");
      out.write("            rules: {\n");
      out.write("                emailfield: {\n");
      out.write("                    required: true,\n");
      out.write("                    email: true,\n");
      out.write("                    minlength: 3\n");
      out.write("                },\n");
      out.write("                namefield: {\n");
      out.write("                    required: true,\n");
      out.write("                    minlength: 3\n");
      out.write("                },\n");
      out.write("                urlfield: {\n");
      out.write("                    required: true,\n");
      out.write("                    minlength: 3,\n");
      out.write("                    url: true\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#rootwizard').bootstrapWizard({\n");
      out.write("            'tabClass': 'nav nav-pills',\n");
      out.write("            'onNext': function (tab, navigation, index) {\n");
      out.write("                var $valid = $(\"#commentForm\").valid();\n");
      out.write("                if (!$valid) {\n");
      out.write("                    $validator.focusInvalid();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        window.prettyPrint && prettyPrint()\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
