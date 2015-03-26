package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.djuma.Individual.IndividualTaxPayerType;
import com.djuma.Individual.Individual;
import com.djuma.Tax.TaxPayerType;
import com.djuma.Acount.Management.User;
import java.sql.PreparedStatement;
import java.awt.Color;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import com.itextpdf.text.Image;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Document;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class TINCertificate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
 currentIndividual=(Integer)session.getAttribute("individualTicket");
}


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TIN CERTIFICATE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            response.setContentType("application/pdf");
            Document document = new Document(new Rectangle(1000, 1000));
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
                  Rectangle rect = document.getPageSize();
        rect.setBorder(Rectangle.BOX); // left, right, top, bottom border
        rect.setBorderWidth(5); // a width of 5 user units
        rect.setBorderColor(BaseColor.RED); // a red border
        rect.setUseVariableBorders(true);
        document.addTitle("TIN Certificate");

            Date date = new Date();
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");
            String da = simpleDateformat.format(date);
          
            Font font2 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD | Font.BOLD);
            Font font3 = new Font(Font.FontFamily.HELVETICA, 15, Font.NORMAL | Font.NORMAL);
            Font font5 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD | Element.ALIGN_CENTER );
            
            Paragraph par = new Paragraph(new Chunk( " Notice of Registration ", font2));
            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);
           Paragraph par1 = new Paragraph(new Chunk( "( Under the Law... Section ... )", font3));
            par1.setAlignment(Element.ALIGN_CENTER);
            document.add(par1);
            document.add(new Paragraph("\n"));
            
            try {    
            for(Individual in: Individual.listIndividual()) {
            //if(in.getIndividualId()==29){
           Image image = Image.getInstance("/Users//SULAIMAN//NetBeansProjects//TaxPayerRegistration//build//web\\"+in.getPhoto());
           image.setAlignment(Element.ALIGN_LEFT);
           //image.setAbsolutePosition(50f, 50f);
           image.scaleAbsolute(150, 90);
           image.setBorderWidth(40);
           //image.setWidthPercentage(widthPercentage);
           document.add((Element) image);
           
            Paragraph par2 = new Paragraph(new Chunk( " Names:  "+in.getOwnerSurname()+" "+in.getOwnerFirstName(), font3));
            par2.setAlignment(Element.ALIGN_LEFT);
            document.add(par2);
            document.add(new Paragraph("\n")); 
            
            Paragraph par3 = new Paragraph(new Chunk( " Business Activity:  ", font3));
            par3.setAlignment(Element.ALIGN_LEFT);
            document.add(par3);
            document.add(new Paragraph("\n")); 
            
            Paragraph par4 = new Paragraph(new Chunk( " Tax Center:  ", font3));
            par4.setAlignment(Element.ALIGN_LEFT);
            document.add(par4);
            document.add(new Paragraph("\n")); 
            Paragraph par5 = new Paragraph(new Chunk( " is registered for tax purposes and assigned :  ", font3));
            par5.setAlignment(Element.ALIGN_LEFT);
            document.add(par5);
            document.add(new Paragraph("\n"));
            Paragraph par6 = new Paragraph( " TaxPayers' Identification Number:  "+in.getTinNumber(), font3);
            par6.setAlignment(Element.ALIGN_CENTER);
            //document.add(par6);
            //document.add(new Paragraph("\n"));
            
            PdfPTable table = new PdfPTable(1);
            table.setWidthPercentage(40);
            PdfPCell cell = new PdfPCell();
            cell.setMinimumHeight(40);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.addElement(par6);
            //PdfPTable table1 = new PdfPTable(1);
            //table1.addCell(new Phrase(new Chunk(" TaxPayers' Identification Number:  "+in.getTinNumber(), font3)));
            table.addCell(cell);
            document.add(table);
            
            Paragraph par7 = new Paragraph(new Chunk( " With effect from :  "+da, font3));
            par7.setAlignment(Element.ALIGN_LEFT);
            document.add(par7);
            document.add(new Paragraph("\n")); 
            Paragraph par8 = new Paragraph(new Chunk( " Signed:  ", font3));
            par8.setAlignment(Element.ALIGN_LEFT);
            document.add(par8);
            document.add(new Paragraph("\n")); 
            document.add(new Paragraph("\n")); 

            Paragraph par9 = new Paragraph(new Chunk( " Doc Number:  "+in.getDocNumber(), font3));
            par9.setAlignment(Element.ALIGN_RIGHT);
            document.add(par9);
            document.add(new Paragraph("\n")); 
                }
               // }
                
               
            } catch (Exception e) {
                e.printStackTrace();
            }
            document.close();
        
      out.write("\n");
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
