/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2014-09-18 17:13:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Semana02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Atividade_005f31_002d07_002d14_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Dados Pessoais</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<font face=\"calibri\" size=4px> ");

		String nom = request.getParameter("nome");
		String sex = request.getParameter("sexo");
		String est = request.getParameter("estado");
		//strings dos checkbox
		String fute = request.getParameter("fut");
		String nata = request.getParameter("nat");
		String vole = request.getParameter("vol");
		String cami = request.getParameter("cam");
		String bici = request.getParameter("bic");
		String outr = request.getParameter("outros");
		String aux = "";

		//parte logica
		int n = Integer.parseInt(est);
		if (est.equals("1")) {

			est = "São Paulo";

		} else if (est.equals("2")) {

			est = "Paraná";

		} else if (est.equals("3")) {

			est = "Minas Gerais";

		} else if (est.equals("4")) {

			est = "Rio Grande do Sul";

		}

		if (fute != null) {
			aux += fute + ", ";
		}
		if (nata != null) {
			aux += nata + ", ";
		}
		if (vole != null) {
			aux += vole + ", ";
		}
		if (cami != null) {
			aux += cami + ", ";
		}
		if (outr != null) {
			aux += outr + ", ";
		}

		//a ser exibido
		out.print("<b>Nome:</b> " + nom + "<br><br>");
		out.print("<b>Sexo:</b>" + sex + "<br><br>");
		out.print("<b>Estado: </b>" + est + "<br><br>");

		out.print("<font size=4px>Atividades preferidas:</font><br><ul><li>"
				+ aux + "</ul>");
	
      out.write("\r\n");
      out.write("\t</font>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}