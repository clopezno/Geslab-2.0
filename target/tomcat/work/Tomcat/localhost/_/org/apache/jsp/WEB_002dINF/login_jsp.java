/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-28 19:43:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Bootstrap CSS -->\r\n");
      out.write("<!--\t\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Custom CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>Geslab 2.0</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("        <div  class=\"container-fluid\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12 py-5\">\r\n");
      out.write("                        <img class=\"logo-img\" src=\"../images/logo-geslab.svg\"> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row align-items-center py-4\">\r\n");
      out.write("                    <div class=\"col-12 col-md-5 ubu\">\r\n");
      out.write("                        <img class=\"ubu-img\" src=\"../images/logo-ubu.svg\"> \r\n");
      out.write("                        <p class=\"col-sm-12 col-lg-8 descripcion-txt mt-3 pl-0\">Aplicación de gestión del inventario de los laboratorios de química desarrollada para la Universidad de Burgos</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-12 col-md-7\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12 col-lg-8 login-container py-3 px-4\">\r\n");
      out.write("                                <form>\r\n");
      out.write("                                    <div class=\"row align-items-center\">\r\n");
      out.write("                                        <label for=\"usuario-ip\" class=\"col-4 login-label\">Usuario</label>\r\n");
      out.write("                                        <div class=\"col-8\">\r\n");
      out.write("                                          <input type=\"text\" class=\"col-12 login-input\" id=\"usuario-ip\" placeholder=\"bioqbm\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"row align-items-center mt-2\">\r\n");
      out.write("                                        <label for=\"password-ip\" class=\"col-6 login-label\">Contraseña</label>\r\n");
      out.write("                                        <div class=\"col-6\">\r\n");
      out.write("                                          <input type=\"password\" class=\"col-12 login-input\" id=\"password-ip\" placeholder=\"********\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"row justify-content-end mt-4 px-3\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn login-button py-2 px-3\">Entrar</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                          \r\n");
      out.write("                                </form>                        \r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!--\t\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>-->\r\n");
      out.write("\t\t<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- <html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">    \r\n");
      out.write("        Librerias online \r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.5.11/p5.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.5.11/addons/p5.dom.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/p5@1.0.0/lib/p5.js\"></script>\r\n");
      out.write("        <style> body {padding: 0; margin: 0;} </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../../resources/js/sketch.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\tlet angulo = 0;\r\n");
      out.write("\t\tlet velocidad = 0.03;\r\n");
      out.write("\t\tlet radio = 235;\r\n");
      out.write("\t\tlet centroX;\r\n");
      out.write("\t\tlet centroY;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction setup() {\r\n");
      out.write("\t\t  createCanvas(800, 800);\r\n");
      out.write("\t\t  centroX = width/2;\r\n");
      out.write("\t\t  centroY = height/2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction draw() {\r\n");
      out.write("\t\t  background(255, 255, 255);\r\n");
      out.write("\t\t  noFill();\r\n");
      out.write("\t\t  stroke(112, 130, 247);\r\n");
      out.write("\t\t  strokeWeight(10);\r\n");
      out.write("\t\t  ellipse(centroX, centroY, radio*2);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  fill(112, 130, 247);\r\n");
      out.write("\t\t  noStroke();\r\n");
      out.write("\t\t  ellipseMode(CENTER);\r\n");
      out.write("\t\t  ellipse(centroX, centroY, 200);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  let x = centroX + radio * cos(angulo);\r\n");
      out.write("\t\t  let y = centroY + radio * sin(angulo);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  ellipse(x, y, 50);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  angulo = angulo + velocidad; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</html> -->\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
