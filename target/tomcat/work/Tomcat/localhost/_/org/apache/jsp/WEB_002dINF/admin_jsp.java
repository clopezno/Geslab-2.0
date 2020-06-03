/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-01 16:41:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import geslab.database.admin.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- <meta charset=\"UTF-8\"> -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/e907f1c9ed.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Geslab 2.0</title>\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/png\" href=\"../images/favicon.png\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	Usuario usuario = (Usuario) request.getAttribute("usuario");
	ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");
	ArrayList<Area> areas = (ArrayList<Area>) request.getAttribute("areas");
	ArrayList<Departamento> departamentos = (ArrayList<Departamento>) request.getAttribute("departamentos");
	ArrayList<Centro> centros = (ArrayList<Centro>) request.getAttribute("centros");
	String tabla = (String) request.getAttribute("mostrarTabla");
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row py-5 justify-content-between align-items-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-3\">\r\n");
      out.write("\t\t\t\t\t<img class=\"header__logo\" src=\"../images/logo-geslab.svg\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-3 pr-0 text-right header__menu\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown show\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-toggle header__dropdown\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t    ");
      out.print(usuario.getNombre());
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  \t<div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\r\n");
      out.write("\t\t\t\t  \t\t\t<a class=\"dropdown-item header__dropdown-item--logout\" href=\"/login.do?accion=logout\" >Cerrar sesion</a>\r\n");
      out.write("\t\t\t\t\t  \t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form id=\"mostrarTabla\" action=\"/admin.do\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"tabla\" name=\"tabla\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"bt-centros\" value=\"centros\" onclick=\"mostrarElemento('centro')\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn filtro_admin__boton\">Centros</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row pt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"bt-departamentos\" value=\"departamentos\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"mostrarElemento('departamento')\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn filtro_admin__boton\">Departamentos</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row pt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"bt-areas\" value=\"areas\" onclick=\"mostrarElemento('area')\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn filtro_admin__boton\">Áreas</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row pt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"bt-usuarios\" value=\"usuarios\" onclick=\"mostrarElemento('usuario')\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn filtro_admin__boton\">Usuarios</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-9 container-info\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row py-3\" id=\"container-tabla\" style=\"height: 100%\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container px-5\">\r\n");
      out.write("\t\t\t\t\t\t\t<form id=\"form-confirmar\" name=\"form-confirmar\"\r\n");
      out.write("\t\t\t\t\t\t\t\taction=\"/admin.do\" method=\"post\" style=\"height: 100%\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"variables\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"accion\" name=\"accion\"></input> <input id=\"elemento\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"elemento\"></input> <input id=\"codigo\" name=\"codigo\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\" style=\"height: 85%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(tabla.equals("centro")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"tabla-centros\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"table table-borderless table-hover table-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead class=\"tabla-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Centro</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" style=\"text-align: right\" scope=\"col\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody class=\"tabla-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
for (Centro c : centros) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"centro-");
      out.print(c.getCodcentro());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\"><input type=\"text\" class=\"label-tabla__text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"centro-");
      out.print(c.getCodcentro());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(c.getNombre());
      out.write("\" placeholder=\"");
      out.print(c.getNombre());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdisabled></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"editar-centro-");
      out.print(c.getCodcentro());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"editar(");
      out.print(c.getCodcentro());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-editar-centro-");
      out.print(c.getCodcentro());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-pen\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right; display: none\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"conf-canc-editar-centro-");
      out.print(c.getCodcentro());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-confirmar-centro-");
      out.print(c.getCodcentro());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion boton-tabla__accion--success\"><i class=\"fas fa-check\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"cancelarEditar(");
      out.print(c.getCodcentro());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-cancelar-centro-");
      out.print(c.getCodcentro());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion boton-tabla__accion\"><i class=\"fas fa-times\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"form-nuevo-elemento\" id=\"form-nuevo-centro\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__input\" name=\"centro-nuevo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Centro\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} else if(tabla.equals("departamento")){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"tabla-departamentos\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"table table-borderless table-hover table-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead class=\"tabla-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Departamento</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" style=\"text-align: right\" scope=\"col\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody class=\"tabla-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
for (Departamento d : departamentos) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"departamento-");
      out.print(d.getCoddpto());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\"><input type=\"text\" class=\"label-tabla__text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"departamento-");
      out.print(d.getCoddpto());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(d.getNombre());
      out.write("\" placeholder=\"");
      out.print(d.getNombre());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdisabled></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"editar-departamento-");
      out.print(d.getCoddpto());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" onclick=\"editar(");
      out.print(d.getCoddpto());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-editar-departamento-");
      out.print(d.getCoddpto());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-pen\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right; display: none\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"conf-canc-editar-departamento-");
      out.print(d.getCoddpto());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-confirmar-departamento-");
      out.print(d.getCoddpto());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion boton-tabla__accion--success\"><i class=\"fas fa-check\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"cancelarEditar(");
      out.print(d.getCoddpto());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-cancelar-departamento-");
      out.print(d.getCoddpto());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-times\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"form-nuevo-elemento\" id=\"form-nuevo-departamento\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__input\" name=\"departamento-nuevo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Departamento\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} else if(tabla.equals("area")){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"tabla-areas\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"table table-borderless table-hover table-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead class=\"tabla-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Área</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Departamento</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" style=\"text-align: right\" scope=\"col\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody class=\"tabla-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
for (Area a : areas) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"area-");
      out.print(a.getCodarea());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\"><input type=\"text\" class=\"label-tabla__text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"area-");
      out.print(a.getCodarea());
      out.write("\" value=\"");
      out.print(a.getNombre());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(a.getNombre());
      out.write("\" disabled></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select class=\"label-tabla__select--text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"dpto-area-");
      out.print(a.getCodarea());
      out.write("\" disabled>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for (Departamento d : departamentos) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(d.getNombre());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (d.getNombre().equals(a.getDpto())) {
      out.write(" selected\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write('>');
      out.print(d.getNombre());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"editar-area-");
      out.print(a.getCodarea());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" onclick=\"editar(");
      out.print(a.getCodarea());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-editar-area-");
      out.print(a.getCodarea());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-pen\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right; display: none\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"conf-canc-editar-area-");
      out.print(a.getCodarea());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-confirmar-area-");
      out.print(a.getCodarea());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion boton-tabla__accion--success\"><i class=\"fas fa-check\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"cancelarEditar(");
      out.print(a.getCodarea());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-cancelar-area-");
      out.print(a.getCodarea());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-times\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"form-nuevo-elemento\" id=\"form-nuevo-area\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__input\" name=\"area-nuevo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Nombre\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><select onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__input\" name=\"dpto-area-nuevo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for (Departamento d : departamentos) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(d.getNombre());
      out.write('"');
      out.write('>');
      out.print(d.getNombre());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} else if(tabla.equals("usuario")){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"tabla-usuarios\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"table table-borderless table-hover table-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead class=\"tabla-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Usuario</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Rol</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\">Área</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\" style=\"text-align: center\">Fed.</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" scope=\"col\" style=\"text-align: center\">Act.</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"tabla-header--item\" style=\"text-align: right\" scope=\"col\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody class=\"tabla-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
for (Usuario u : usuarios) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"usuario-");
      out.print(u.getIdusuario());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\"><input type=\"text\" class=\"label-tabla__text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"usuario-");
      out.print(u.getIdusuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(u.getUsuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(u.getUsuario());
      out.write("\" disabled></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\"><select class=\"label-tabla__select--text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"rol-usuario-");
      out.print(u.getIdusuario());
      out.write("\" disabled>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for (Rol r : Rol.values()) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(r.getId());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (r.getRol().equals(u.getRol().getRol())) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tselected ");
}
      out.write('>');
      out.print(r.getRol());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\"><select class=\"label-tabla__select--text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"area-usuario-");
      out.print(u.getIdusuario());
      out.write("\" disabled>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for (Area a : areas) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(a.getNombre());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (a.getNombre().equals(u.getArea())) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tselected ");
}
      out.write('>');
      out.print(a.getNombre());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: center\"><input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"federada-usuario-");
      out.print(u.getIdusuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"javascript: return false;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (u.getFederada()) {
      out.write(" checked ");
}
      out.write("></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: center\"><input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"activo-usuario-");
      out.print(u.getIdusuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"javascript: return false;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (u.getActivo()) {
      out.write(" checked ");
}
      out.write("></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align: right\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"editar-usuario-");
      out.print(u.getIdusuario());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"editar(");
      out.print(u.getIdusuario());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-editar-usuario-");
      out.print(u.getIdusuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-pen\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabla-body--row\" style=\"text-align: right; display: none\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"conf-canc-editar-usuario-");
      out.print(u.getIdusuario());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-confirmar-area-");
      out.print(u.getIdusuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion boton-tabla__accion--success\"><i class=\"fas fa-check\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"cancelarEditar(");
      out.print(u.getIdusuario());
      out.write(")\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"btn-cancelar-usuario-");
      out.print(u.getIdusuario());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"boton-tabla__accion\"><i class=\"fas fa-times\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"form-nuevo-elemento \" id=\"form-nuevo-usuario\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__input\" name=\"usuario-nuevo\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Usuario\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><select onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__select\" name=\"rol-usuario-nuevo\" id=\"nuevo-rol\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(Rol r : Rol.values()){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(r.getId());
      out.write('"');
      out.write('>');
      out.print(r.getRol());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><select onchange=\"comprobarCampos()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"label-tabla__select\" name=\"area-usuario-nuevo\" id=\"nuevo-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
for(Area a : areas){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(a.getNombre());
      out.write('"');
      out.write('>');
      out.print(a.getNombre());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align: center\"><input type=\"checkbox\" class=\"check-elemento\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"federada-usuario-nuevo\" value=\"true\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align: center\"><input type=\"checkbox\" class=\"check-elemento\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"activo-usuario-nuevo\" value=\"true\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row justify-content-end\" id=\"fila-insertar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" onclick=\"insertar()\" id=\"btn-insertar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn boton-tabla__añadir\"></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row justify-content-end\" id=\"fila-confirmar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" onclick=\"cancelar()\" id=\"btn-cancelar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn boton-tabla__cancelar mr-3\">Cancelar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"btn-confirmar\" name=\"btn-confirmar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn boton-tabla__añadir\">Confirmar</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"></script>\r\n");
      out.write("\t<script\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/admin.js\"></script>\r\n");
      out.write("\t<script> inicializar('");
      out.print(tabla);
      out.write("'); </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
