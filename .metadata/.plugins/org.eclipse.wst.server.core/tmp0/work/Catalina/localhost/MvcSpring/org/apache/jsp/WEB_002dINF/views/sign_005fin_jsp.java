/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-11 18:01:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Sign In Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("	margin: 0;\n");
      out.write("	font-family: Arial, sans-serif;\n");
      out.write("	background-color: #BDC3C7;\n");
      out.write("	color: #1A5276;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("	background-color: #1A5276;\n");
      out.write("	overflow: hidden;\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-between;\n");
      out.write("	align-items: center;\n");
      out.write("	padding: 20px 20px;\n");
      out.write("	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-brand {\n");
      out.write("	color: #fff;\n");
      out.write("	font-size: 24px;\n");
      out.write("	font-weight: bold;\n");
      out.write("	text-decoration: none;\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-brand i {\n");
      out.write("	font-size: 28px;\n");
      out.write("	margin-right: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav {\n");
      out.write("	list-style: none;\n");
      out.write("	margin: 0;\n");
      out.write("	padding: 0;\n");
      out.write("	display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav li {\n");
      out.write("	margin-left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav a {\n");
      out.write("	color: #BDC3C7;\n");
      out.write("	text-decoration: none;\n");
      out.write("	font-size: 18px;\n");
      out.write("	transition: color 0.3s;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav a:hover {\n");
      out.write("	color: green;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav a::before {\n");
      out.write("	content: \"\";\n");
      out.write("	position: absolute;\n");
      out.write("	bottom: -2px;\n");
      out.write("	left: 0;\n");
      out.write("	width: 100%;\n");
      out.write("	height: 2px;\n");
      out.write("	background-color: #ffc107;\n");
      out.write("	transform: scaleX(0);\n");
      out.write("	transition: transform 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-nav a:hover::before {\n");
      out.write("	transform: scaleX(1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#head{\n");
      out.write(" \n");
      out.write(" margin-top:150px;\n");
      out.write(" margin-left:2%;\n");
      out.write(" \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("  margin-left:41%;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(" input[type=\"text\"]{\n");
      out.write(" \n");
      out.write("   background-color: #BDC3C7; \n");
      out.write("   outline: none;\n");
      out.write("   border: none;\n");
      out.write(" \n");
      out.write(" }\n");
      out.write(" input[type=\"submit\"]{\n");
      out.write(" \n");
      out.write("   background-color: #BDC3C7; \n");
      out.write("   outline: none;\n");
      out.write("   border: 1px solid;\n");
      out.write(" \n");
      out.write(" }\n");
      out.write("\n");
      out.write("input[type[text]]{\n");
      out.write("\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#head{\n");
      out.write(" \n");
      out.write(" margin-top:170px;\n");
      out.write(" position: relative;\n");
      out.write(" \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#message {\n");
      out.write("	font-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("	text-decoration: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("   <div class=\"navbar\">\n");
      out.write("		<a href=\"http://localhost:8080/CarDekhoAppServlet/Home.jsp\"\n");
      out.write("			class=\"navbar-brand\"> <i class=\"fas fa-car\"></i> Car Dekho\n");
      out.write("		</a>\n");
      out.write("		<ul class=\"navbar-nav\">\n");
      out.write("			<li><a\n");
      out.write("				href=\"sign_up\">Sing Up</a></li>\n");
      out.write("		</ul>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("  <div id=\"box\">\n");
      out.write("	<div align=\"center\">\n");
      out.write("		<h3 id=\"head\">Sign In</h3>\n");
      out.write("		<form action=\"check_user\" method=\"post\">\n");
      out.write("			<table border=\"1px solid \">\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"label\">Email</td>\n");
      out.write("					<td><input class=\"input\" type=\"text\" name=\"email\"\n");
      out.write("						required=\"required\" autofocus=\"autofocus\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td class=\"label\">Password</td>\n");
      out.write("					<td><input class=\"input\" type=\"text\" name=\"password\"\n");
      out.write("						required=\"required\"></td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("			<input id=\"button\" type=\"submit\" value=\"Sign In\">\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("	");

	String message = (String) request.getAttribute("message");
	if (message != null) {
	
      out.write("\n");
      out.write("	<div align=\"center\">\n");
      out.write("		<h3 id=\"message\">");
      out.print(message);
      out.write("</h3>\n");
      out.write("	</div>\n");
      out.write("	");

	}
	
      out.write("\n");
      out.write("</body>\n");
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
