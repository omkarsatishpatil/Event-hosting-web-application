/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-05-19 10:49:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
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
      out.write("      <link rel=\"stylesheet\" href=\"assets/css/contactpage.css\">\n");
      out.write("\n");
      out.write("      <title>Event Management Website</title>\n");
      out.write("      \n");
      out.write("      <style>\n");
      out.write("          \n");
      out.write("\n");
      out.write("        @import url(\"https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap\");\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-family: \"Poppins\", sans-serif;\n");
      out.write("}\n");
      out.write("          body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(to right bottom, #ffffff, #02effe);\n");
      out.write("            color: #fff;\n");
      out.write("            display: flex;\n");
      out.write("            min-height: 100vh;\n");
      out.write("  width: 100%;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("        }\n");
      out.write("p{\n");
      out.write("    font-weight: bolder;\n");
      out.write("    color: white;\n");
      out.write("    background: linear-gradient(to right bottom, hsl(258.09deg 76.62% 70.36%), #dcacacba);\n");
      out.write("    padding: 15px 15px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    box-shadow: 0 4px 10px rgba(0, 0, 0, 5);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact_container{\n");
      out.write("  max-width: 1120px;\n");
      out.write("  margin-inline: 1.5rem;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact_container .contact_content {\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: space-between;\n");
      out.write("  z-index: 2;\n");
      out.write("}\n");
      out.write(".contact_container .contact_content .left-side {\n");
      out.write("  width: 25%;\n");
      out.write("  height: 100%;\n");
      out.write("  display: flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  margin-top: 15px;\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 2;\n");
      out.write("  font-weight: bolder; \n");
      out.write("  color: white;\n");
      out.write("  background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("  border-radius: 15px; \n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write(".contact_content .left-side::before {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  height: 130%;\n");
      out.write("  width: 3px;\n");
      out.write("  right: -35px;\n");
      out.write("  top: 50%;\n");
      out.write("  transform: translateY(-50%);\n");
      out.write("  background: linear-gradient(to right bottom, #319da4c9, #3231a4);\n");
      out.write("  z-index: 2;\n");
      out.write("}\n");
      out.write(".contact_content .left-side .details {\n");
      out.write("  margin: 14px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".contact_content .left-side .details i {\n");
      out.write("  font-size: 30px;\n");
      out.write("  color: #3e2093;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  z-index: 2;\n");
      out.write("}\n");
      out.write(".content .left-side .details .topic {\n");
      out.write("  font-size: 18px;\n");
      out.write("  font-weight: 500;\n");
      out.write("}\n");
      out.write(".content .left-side .details .text-one,\n");
      out.write(".content .left-side .details .text-two {\n");
      out.write("  font-size: 14px;\n");
      out.write("  color: white;\n");
      out.write("  z-index: 2;\n");
      out.write("  background-color: rgba(245, 148, 39, 0.4);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact_container .contact_content .right-side {\n");
      out.write("  width: 75%;\n");
      out.write("  margin-left: 75px;\n");
      out.write("  z-index: 2;\n");
      out.write("  background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("  padding: 30px;\n");
      out.write("  border-radius: 15px; \n");
      out.write("}\n");
      out.write(".contact_content .right-side .topic-text {\n");
      out.write("  font-size: 30px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: white;\n");
      out.write("    z-index: 2;\n");
      out.write("    align-content: center;\n");
      out.write("    padding: 15px 15px;\n");
      out.write("}\n");
      out.write(".right-side .input-box {\n");
      out.write("  height: 55px;\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 12px 0;\n");
      out.write("}\n");
      out.write(".right-side .input-box input,\n");
      out.write(".right-side .input-box textarea {\n");
      out.write("  height: 100%;\n");
      out.write("  width: 100%;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  font-size: 16px;\n");
      out.write("  background: #f0f1f8;\n");
      out.write("  border-radius: 6px;\n");
      out.write("  padding: 0 15px;\n");
      out.write("  resize: none;\n");
      out.write("}\n");
      out.write(".right-side .message-box {\n");
      out.write("  min-height: 110px;\n");
      out.write("}\n");
      out.write(".right-side .input-box textarea {\n");
      out.write("  padding-top: 6px;\n");
      out.write("}\n");
      out.write(".right-side .button {\n");
      out.write("  display: inline-block;\n");
      out.write("  margin-top: 12px;\n");
      out.write("}\n");
      out.write(".right-side .button input[type=\"submit\"] {\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 18px;\n");
      out.write("  outline: none;\n");
      out.write("  border: none;\n");
      out.write("  padding: 8px 16px;\n");
      out.write("  border-radius: 6px;\n");
      out.write("  background: linear-gradient(to right bottom, #319da4c9, #3231a4);\n");
      out.write("  cursor: pointer;\n");
      out.write("  transition: all 0.3s ease;\n");
      out.write("}\n");
      out.write(".button input[type=\"submit\"]:hover {\n");
      out.write("  background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 950px) {\n");
      out.write("  .contact_container {\n");
      out.write("    width: 90%;\n");
      out.write("    padding: 30px 40px 40px 35px;\n");
      out.write("  }\n");
      out.write("  .contact_container .contact_content .right-side {\n");
      out.write("    width: 75%;\n");
      out.write("    margin-left: 55px;\n");
      out.write("    z-index: 2;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@media (max-width: 820px) {\n");
      out.write("  .contact_container {\n");
      out.write("    margin: 40px 0;\n");
      out.write("    height: 100%;\n");
      out.write("  }\n");
      out.write("  .contact_container .contact_content {\n");
      out.write("    flex-direction: column-reverse;\n");
      out.write("    z-index: 2;\n");
      out.write("  }\n");
      out.write("  .contact_container .contact_content .left-side {\n");
      out.write("    width: 100%;\n");
      out.write("    flex-direction: row;\n");
      out.write("    margin-top: 40px;\n");
      out.write("    justify-content: center;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("  }\n");
      out.write("  .contact_container .contact_content .left-side::before {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("  .contact_container .contact_content .right-side {\n");
      out.write("    width: 100%;\n");
      out.write("    margin-left: 0;\n");
      out.write("    z-index: 2;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("      </style>\n");
      out.write("      \n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   <!--==================== HEADER ====================-->\n");
      out.write("      <header class=\"header\" id=\"header\">\n");
      out.write("        <nav class=\"nav container\">\n");
      out.write("            <a href=\"#\" class=\"nav__logo\">\n");
      out.write("                <img src=\"assets/img/logo.svg\" alt=\"logo\">\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <div class=\"nav__menu\" id=\"nav-menu\">\n");
      out.write("                <ul class=\"nav__list\">\n");
      out.write("                    <li class=\"nav__item\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav__link\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav__item\" style=\"display: none;\">\n");
      out.write("                       <form action=\"Servlet?id=all_events\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"id\" value=\"all_events\">\n");
      out.write("    <button id=\"event_btn\" type=\"submit\" class=\"nav__link\">Events</button>\n");
      out.write("</form>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav__item\">\n");
      out.write("                        <a href=\"#\" class=\"nav__link\" onclick=\"eventNav()\">Events</a>\n");
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
      out.write("                    <a href=\"participant_login.jsp\" class=\"nav__button-ghost\">I am an Participant</a>\n");
      out.write("                    <a href=\"login.jsp\" class=\"nav__button-ghost\">I am an Organizer</a>\n");
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
      out.write("<body>\n");
      out.write("      <!--==================== MAIN ====================-->\n");
      out.write("      <main class=\"main\">\n");
      out.write("         <!--==================== HOME ====================-->\n");
      out.write("         \n");
      out.write("                        <div class=\"contact_container\">\n");
      out.write("      <div class=\"contact_content\">\n");
      out.write("        <div class=\"left-side\">\n");
      out.write("          <div class=\"address details\">\n");
      out.write("            <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("            <div class=\"topic\">Address</div>\n");
      out.write("            <div class=\"text-one\">Lohegaon, Pune</div>\n");
      out.write("            <div class=\"text-two\">Maharashtra, India</div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"phone details\">\n");
      out.write("            <i class=\"fas fa-phone-alt\"></i>\n");
      out.write("            <div class=\"topic\">Phone</div>\n");
      out.write("            <div class=\"text-one\">+91 9503194613</div>\n");
      out.write("            <div class=\"text-two\">+91 8012389456</div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"email details\">\n");
      out.write("            <i class=\"fas fa-envelope\"></i>\n");
      out.write("            <div class=\"topic\">Email</div>\n");
      out.write("            <div class=\"text-one\">abhigodse@gmail.com</div>\n");
      out.write("            <div class=\"text-two\">info.festavista@gmail.com</div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right-side\">\n");
      out.write("          <div class=\"topic-text\">Send us a message</div>\n");
      out.write("          <p>If you have any work from us or any types of queries related to our website, you can send us message from here. It's our pleasure to help you.</p>\n");
      out.write("          <form action=\"ContactServlet?request_id=sendMessage\" method=\"post\">\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("              <input type=\"text\" name=\"sender_name\" placeholder=\"Enter your name\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("              <input type=\"text\" name=\"sender_email\" placeholder=\"Enter your email\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box message-box\">\n");
      out.write("              <textarea name=\"message\" placeholder=\"Enter your message\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button\">\n");
      out.write("              <input class=\"button\" type=\"submit\" value=\"Send Now\" />\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("               \n");
      out.write("            \n");
      out.write("      </main>\n");
      out.write("      \n");
      out.write("     ");
 Boolean messageSendingSuccess = (Boolean) request.getAttribute("messageSendingSuccess"); 
      out.write('\n');
 if (messageSendingSuccess != null) { 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var message = ");
      out.print( messageSendingSuccess ? "'Message Sent successful!'" : "'Error in sending message. Please try again.'" );
      out.write(";\n");
      out.write("        alert(message);\n");
      out.write("    </script>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("          function eventNav(){\n");
      out.write("              document.getElementById(\"event_btn\").click();\n");
      out.write("          }\n");
      out.write("      </script>\n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("   \n");
      out.write("\n");
      out.write("<script src=\"assets/js/gsap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- MAIN JS -->\n");
      out.write("<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"script.js\"></script>\n");
      out.write("   \n");
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
