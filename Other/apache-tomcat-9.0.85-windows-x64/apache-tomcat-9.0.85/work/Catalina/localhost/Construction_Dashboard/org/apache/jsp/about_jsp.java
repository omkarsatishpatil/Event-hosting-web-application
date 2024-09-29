/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-05-19 10:51:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("      <meta charset=\"UTF-8\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("      <!--=============== FAVICON ===============-->\n");
      out.write("      <link rel=\"shortcut icon\" href=\"assets/img/favicon.png\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("      <!--=============== REMIXICONS ===============-->\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/remixicon/3.4.0/remixicon.css\" crossorigin=\"\">\n");
      out.write("      \n");
      out.write("      <!--=============== CSS ===============-->\n");
      out.write("      <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"assets/css/aboutpage.css\">\n");
      out.write("\n");
      out.write("      <title>Construction Dashboard</title>\n");
      out.write("      \n");
      out.write("      <style>\n");
      out.write("          body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(to right bottom, #ffffff, #02effe);\n");
      out.write("            color: #fff;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .about_container{\n");
      out.write("            height: 880px;\n");
      out.write("            overflow: auto;\n");
      out.write("            scrollbar-width: none;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin: 10px 150px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .con-btn-div{\n");
      out.write("            margin: 5px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .con_button{\n");
      out.write("            background: linear-gradient(to right bottom, #fff, #02effe);\n");
      out.write("            border-width: 0px;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 5px;\n");
      out.write("            font-size: small;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("      </style>\n");
      out.write("      \n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   <!--==================== HEADER ====================-->\n");
      out.write("      <header class=\"header\" id=\"header\">\n");
      out.write("        <nav class=\"nav container\">\n");
      out.write("            <a href=\"#\" class=\"nav__logo\">\n");
      out.write("                <img src=\"assets/img/logo.png\" alt=\"logo\">\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <div class=\"nav__menu\" id=\"nav-menu\">\n");
      out.write("                <ul class=\"nav__list\">\n");
      out.write("                    <li class=\"nav__item\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav__link\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav__item\">\n");
      out.write("                        <a href=\"about.jsp\" class=\"nav__link\">About</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav__item\">\n");
      out.write("                        <a href=\"contact.jsp\" class=\"nav__link\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"nav__buttons\">\n");
      out.write("                    <a href=\"admin_login.jsp\" class=\"nav__button-ghost\">Admin</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--close button-->\n");
      out.write("                <div class=\"nav__close\" id=\"nav-close\">\n");
      out.write("                    <i class=\"ri-close-line\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--toggle button-->\n");
      out.write("            <div class=\"nav__toggle\" id=\"nav-toggle\">\n");
      out.write("                <i class=\"ri-menu-line\"></i>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("         \n");
      out.write("      </header>\n");
      out.write("\n");
      out.write("<main class=\"main\">\n");
      out.write("    <div class=\"about_container\">\n");
      out.write("        \n");
      out.write("<!--        <div class=\"home__images\">\n");
      out.write("            <img src=\"assets/img/bg.png\" alt=\"image\" class=\"home__img-4\" style=\"z-index: -1; filter: blur(3px); position: fixed;\">\n");
      out.write("                    <img src=\"assets/img/img-3.png\" alt=\"image\" class=\"home__img-3\" style=\"z-index: -1; filter: blur(3px); position: fixed;\">\n");
      out.write("                    <img src=\"assets/img/img-2.png\" alt=\"image\" class=\"home__img-2\" style=\"z-index: -1; filter: blur(3px); position: fixed;\">\n");
      out.write("                    <img src=\"assets/img/img-11.png\" alt=\"image\" class=\"home__img-1\" style=\"z-index: -1; filter: blur(3px); position: fixed;\">\n");
      out.write("                </div>-->\n");
      out.write("        \n");
      out.write("<div class=\"about-section\">\n");
      out.write("  <h1>Welcome to Patil Constructions</h1><br>\n");
      out.write("  <p>At Festa Vista, we're passionate about connecting organizers with their audience and creating memorable experiences. Whether you're an event organizer looking to showcase your event or an enthusiast seeking exciting experiences, we're here to make it happen.</p>\n");
      out.write("  <br><br><h1>Our Mission</h1><br>\n");
      out.write("  <p>Our mission is to bridge the gap between event organizers and attendees, providing a platform where events of all kinds can flourish. We strive to make event planning and participation seamless, enjoyable, and rewarding for everyone involved.</p>\n");
      out.write("  <br><br><h1>What we offer</h1><br>\n");
      out.write("  <p><li>Organizer Registration: We offer a user-friendly platform for event organizers to register and showcase their events. From conferences and concerts to workshops and community gatherings, we welcome all types of events.</li>\n");
      out.write("\n");
      out.write("  <br><li>Event Discovery: Visitors to our website can easily discover a diverse range of events happening in their area or areas of interest. With detailed event listings and filtering options, finding the perfect event has never been easier.</li>\n");
      out.write("\n");
      out.write("<br><li>Participant Registration: Interested individuals can register for events directly through our website, making event participation hassle-free and convenient.</li>\n");
      out.write("\n");
      out.write("<br><li>Engaging Community: We foster a vibrant community of event enthusiasts, organizers, and participants. Through our platform, users can connect, share experiences, and stay updated on upcoming events.</li></p>\n");
      out.write("</div>\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"about-section\">\n");
      out.write("    <h1>Get in Touch</h1><br>\n");
      out.write("  <p>Have questions, feedback, or need assistance? We're here to help! Feel free to reach out to us via our <a href=\"contact.jsp\">contact</a> page or connect with us on social media.\n");
      out.write("\n");
      out.write("Thank you for choosing Festa Vista for all your event needs. Let's create unforgettable experiences together!</p>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</main>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        function gotoContact(){\n");
      out.write("    window.location.href = \"http://localhost:8080/FestaVista/contact.jsp\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("          function eventNav(){\n");
      out.write("              document.getElementById(\"event_btn\").click();\n");
      out.write("          }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script src=\"assets/js/gsap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- MAIN JS -->\n");
      out.write("<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"script.js\"></script>\n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
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
