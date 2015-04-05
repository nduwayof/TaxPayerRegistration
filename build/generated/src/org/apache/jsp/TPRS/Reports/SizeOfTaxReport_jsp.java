package org.apache.jsp.TPRS.Reports;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.djuma.Individual.Individual_representative;
import com.djuma.Individual.Individual;
import com.djuma.Individual.IndividualTaxPayerType;
import com.djuma.Tax.TaxPayerType;
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

public final class SizeOfTaxReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String value="2";
            String type="";
            for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
            if(t.getId()==Integer.parseInt(value)){
            type=t.getTaxpayerType();
            }
            }
            response.setContentType("application/pdf");
            Document document = new Document(new Rectangle(1000, 1000));
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
             
            Date date = new Date();
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("dd/MM/yyyy");
            String da = simpleDateformat.format(date);
          //  String itn = request.getParameter("itnm");
           // String title=itn.toUpperCase();
            Font font2 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD | Font.UNDERLINE);
            Font font5 = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD | Element.ALIGN_CENTER );
           // Image image = Image.getInstance("C:\\Users\\Joe\\Desktop\\my web  projects\\StockTest\\web\\images\\pih.jpg");
           
           //image.scaleAbsolute(400, 50);

            //document.add((Element) image);
           
            Paragraph par = new Paragraph(new Chunk( " "+   "Report of "+type+" TaxPayers on " + da , font2));
            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("\n"));

            PdfPTable tablee = new PdfPTable(5);
             
            tablee.setWidthPercentage(100);
            PdfPTable tablee1 = new PdfPTable(1);
            tablee1.addCell(new Phrase(new Chunk(" Surname ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee2 = new PdfPTable(1);
            tablee2.addCell(new Phrase(new Chunk(" First Name ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee3 = new PdfPTable(1);
            tablee3.addCell(new Phrase(new Chunk(" TIN NUMBER ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee4 = new PdfPTable(1);
            tablee4.addCell(new Phrase(new Chunk(" NATIONALITY ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            PdfPTable tablee5 = new PdfPTable(1);
            tablee5.addCell(new Phrase(new Chunk(" Representative Name ", FontFactory.getFont(FontFactory.TIMES_BOLD, 13, Font.BOLD, BaseColor.MAGENTA))));
            
        
            tablee.addCell(tablee1);
            tablee.addCell(tablee2);
            tablee.addCell(tablee3);
            tablee.addCell(tablee4);
            tablee.addCell(tablee5);
            
            document.add(tablee);
     
            int i = 0;
            try {
              //  String itnm = request.getParameter("username");
                
                for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
                   if(t.getId()==Integer.parseInt(value)){ 
                    for(IndividualTaxPayerType it: IndividualTaxPayerType.listsizeOfTaxForIndividual()){
                    if(it.getTaxPayerTypeId()==t.getId()){
                for(Individual in: Individual.listIndividual()) {
                   if(in.getIndividualId()==it.getIndividualId()&&in.isHasInfo()&&in.isDeRegistered()==false){
                    PdfPTable table = new PdfPTable(5);
                    table.setWidthPercentage(100);
                    
                   
                    i = i + 1;
                    PdfPTable table1 = new PdfPTable(1);
                    table1.addCell(new Phrase(new Chunk(in.getOwnerSurname(), FontFactory.getFont(FontFactory.TIMES_BOLD, 9, Font.BOLD, BaseColor.BLACK))));
                    

                    PdfPTable table2 = new PdfPTable(1);
                    table2.addCell(new Phrase(new Chunk(in.getOwnerFirstName(), font5)));

                    PdfPTable table3 = new PdfPTable(1);
                    table3.addCell(new Phrase(new Chunk(in.getTinNumber(), font5)));

                    PdfPTable table4 = new PdfPTable(1);
                    table4.addCell(new Phrase(new Chunk(in.getNationality(), font5)));
                      PdfPTable table5 = new PdfPTable(1);
                     for(Individual_representative ir:Individual_representative.list()){
                         if(ir.getIndividualId()==in.getIndividualId()){
                    table5.addCell(new Phrase(new Chunk(ir.getTaxpayerRepresentativeName(), font5)));
                     }
                     }
                    table.addCell(table1);
                    table.addCell(table2);
                    table.addCell(table3);
                    table.addCell(table4);
                    table.addCell(table5);
                    document.add(table);
                }
                }
                           }
                       }
                }
                }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
            PdfPTable tableee = new PdfPTable(2);
            tablee.setWidthPercentage(100);
            PdfPTable tableee1 = new PdfPTable(1);
            tableee1.addCell(new Phrase(new Chunk("Total   ", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, Font.BOLD, BaseColor.BLUE))));
            PdfPTable tableee2 = new PdfPTable(1);
            tableee2.addCell(new Phrase(new Chunk(i+"      ", FontFactory.getFont(FontFactory.TIMES_BOLD, 9, Font.BOLD, BaseColor.BLUE))));
            tableee.addCell(tableee1);
            tableee.addCell(tableee2);
            document.add(tableee);
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
