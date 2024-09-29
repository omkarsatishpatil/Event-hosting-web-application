/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-05-19 10:50:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autoredirectpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 String loggedInUsername = (String) request.getAttribute("loggedInUsername"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Your form with correct action -->\n");
      out.write("    <form id=\"login\" action=\"Servlet?id=loadOrg\" method=\"post\">\n");
      out.write("        <label for=\"username\">Username</label>\n");
      out.write("        <input type=\"text\" placeholder=\"Username\" id=\"username\" name=\"username\" value=\"");
      out.print( loggedInUsername );
      out.write("\">\n");
      out.write("        <button id=\"submitButton\" type=\"submit\">Log In</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <!-- JavaScript section -->\n");
      out.write("    <script>\n");
      out.write("        // Function to automatically submit the form\n");
      out.write("        function autoredirect() {\n");
      out.write("            var button = document.getElementById('submitButton');\n");
      out.write("            // Trigger a click event on the button\n");
      out.write("            button.click();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Execute this JavaScript after the page loads\n");
      out.write("        window.onload = function() {\n");
      out.write("            ");
 Boolean loginSuccess = (Boolean) request.getAttribute("loginSuccess"); 
      out.write("\n");
      out.write("            ");
 Boolean eventPostSuccess = (Boolean) request.getAttribute("eventPostSuccess"); 
      out.write("\n");
      out.write("            ");
 Boolean deletionSuccess = (Boolean) request.getAttribute("deletionSuccess"); 
      out.write("\n");
      out.write("            ");
 Boolean updatationSuccess = (Boolean) request.getAttribute("updatationSuccess"); 
      out.write("\n");
      out.write("            ");
 Boolean eventUpdateSuccess = (Boolean) request.getAttribute("eventUpdateSuccess"); 
      out.write("\n");
      out.write("            ");
 Boolean posterUpdateSuccess = (Boolean) request.getAttribute("posterUpdateSuccess"); 
      out.write("\n");
      out.write("\n");
      out.write("            // Check if login success message is available\n");
      out.write("            ");
 if (loginSuccess != null) { 
      out.write("\n");
      out.write("                var message = ");
      out.print( loginSuccess ? "'Login successful!'" : "'Error in login. Please try again.'" );
      out.write(";\n");
      out.write("                alert(message);\n");
      out.write("                autoredirect();\n");
      out.write("            ");
 } else if (eventPostSuccess != null) { 
      out.write("\n");
      out.write("                var message = ");
      out.print( eventPostSuccess ? "'Event posted successfully!'" : "'Error in posting event. Please try again.'" );
      out.write(";\n");
      out.write("                alert(message);\n");
      out.write("                autoredirect();\n");
      out.write("            ");
 } else if (deletionSuccess != null) { 
      out.write("\n");
      out.write("                var message = ");
      out.print( deletionSuccess ? "'Event deleted successfully!'" : "'Error in deleting event. Please try again.'" );
      out.write(";\n");
      out.write("                alert(message);\n");
      out.write("                autoredirect();\n");
      out.write("            ");
 } else if (updatationSuccess != null) { 
      out.write("\n");
      out.write("                var message = ");
      out.print( updatationSuccess ? "'Profile Updated successfully!'" : "'Error in updating profile. Please try again.'" );
      out.write(";\n");
      out.write("                alert(message);\n");
      out.write("                autoredirect();\n");
      out.write("            ");
 } else if (eventUpdateSuccess != null) { 
      out.write("\n");
      out.write("                var message = ");
      out.print( eventUpdateSuccess ? "'Event Updated successfully!'" : "'Error in updating event. Please try again.'" );
      out.write(";\n");
      out.write("                alert(message);\n");
      out.write("                autoredirect();\n");
      out.write("            ");
 } else if (posterUpdateSuccess != null) { 
      out.write("\n");
      out.write("                var message = ");
      out.print( posterUpdateSuccess ? "'Event Poster Updated successfully!'" : "'Error in updating poster. Please try again.'" );
      out.write(";\n");
      out.write("                alert(message);\n");
      out.write("                autoredirect();\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
