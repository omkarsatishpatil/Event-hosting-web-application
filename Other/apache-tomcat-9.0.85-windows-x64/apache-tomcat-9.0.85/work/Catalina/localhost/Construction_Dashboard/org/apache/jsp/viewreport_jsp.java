/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-05-19 10:52:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import ServersidePackages.ProjectObject;
import ServersidePackages.ClientObject;
import ServersidePackages.EmployeeObject;
import ServersidePackages.VehicleObject;
import ServersidePackages.ReportObject;
import java.util.List;
import com.mysql.cj.jdbc.Blob;
import java.io.*;
import java.sql.*;

public final class viewreport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("ServersidePackages.ProjectObject");
    _jspx_imports_classes.add("java.util.Base64");
    _jspx_imports_classes.add("ServersidePackages.EmployeeObject");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.mysql.cj.jdbc.Blob");
    _jspx_imports_classes.add("ServersidePackages.VehicleObject");
    _jspx_imports_classes.add("ServersidePackages.ClientObject");
    _jspx_imports_classes.add("ServersidePackages.ReportObject");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String managerUsername = (String) request.getParameter("manager_username"); 
      out.write('\n');
 String projectID = (String) request.getParameter("project_id"); 
      out.write('\n');
 String projectName = (String) request.getParameter("project_name"); 
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
      out.write("      <link rel=\"stylesheet\" href=\"assets/css/organizerpage.css\">\n");
      out.write("\n");
      out.write("      <title>Manager Dashboard</title>\n");
      out.write("      <style>\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(to right bottom, #ffffff, #02effe);\n");
      out.write("            color: #fff;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .poster-image {\n");
      out.write("            width: 200px; /* Adjust width as needed */\n");
      out.write("            height: 250px; /* Auto adjust height to maintain aspect ratio */\n");
      out.write("        }\n");
      out.write("        .org_container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: grid;\n");
      out.write("            gap: 20px;\n");
      out.write("        }\n");
      out.write("        .section {\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: linear-gradient(to right bottom, #319da4c9, #3231a4);\n");
      out.write("            text-align: center;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .heading{\n");
      out.write("            height: min-content;\n");
      out.write("        }\n");
      out.write("        .action_btn{\n");
      out.write("            height: min-content;\n");
      out.write("            cursor: pointer;\n");
      out.write("            display: flex;\n");
      out.write("            \n");
      out.write("            h2{\n");
      out.write("                    background: linear-gradient(to right bottom, #45f0fbc9, #3231a4);\n");
      out.write("                    margin: auto;\n");
      out.write("                    width: 48%;\n");
      out.write("                    border-radius: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h2:hover{\n");
      out.write("                background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h3{\n");
      out.write("                    background: linear-gradient(to right bottom, #45f0fbc9, #3231a4);\n");
      out.write("                    margin: auto;\n");
      out.write("                    text-align: center;\n");
      out.write("                    font-weight: bold;\n");
      out.write("                    font-size: 24px;\n");
      out.write("                    padding: 20px;\n");
      out.write("                    border-radius: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h3:hover{\n");
      out.write("                background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            form{\n");
      out.write("                /*box-shadow: 0 0 0px 0 #ffffff;*/\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        /* Profile Section */\n");
      out.write("        .profile {\n");
      out.write("            background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("            padding: 40px;\n");
      out.write("            height: 730px;\n");
      out.write("            overflow: auto;\n");
      out.write("            scrollbar-width: none;\n");
      out.write("            \n");
      out.write("            h2{\n");
      out.write("                background: linear-gradient(to right bottom, #319da4c9, #3231a4);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        .profile p {\n");
      out.write("            margin: 10px 0;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        .profile button {\n");
      out.write("            background: linear-gradient(to right bottom, #00f0ff, #0018ff);\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .profile button:hover {\n");
      out.write("            background: linear-gradient(to right bottom, #0018ff, #000000);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .edit{\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("            .cancel-button{\n");
      out.write("                background: linear-gradient(to right bottom, #00f0ff, #0018ff);\n");
      out.write("                color: #fff;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding-bottom: 7px;\n");
      out.write("                padding-left: 15px;\n");
      out.write("                padding-right: 15px;\n");
      out.write("                margin-left: 5px;\n");
      out.write("            }\n");
      out.write("            .cancel-button:hover{\n");
      out.write("                background: linear-gradient(to right bottom, #0018ff, #000000);\n");
      out.write("            }\n");
      out.write("            .back-button{\n");
      out.write("                background: linear-gradient(to right bottom, #00f0ff, #0018ff);\n");
      out.write("                color: #fff;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin-left: 420px;\n");
      out.write("                width: 100px;\n");
      out.write("                height: 25px;\n");
      out.write("                position: fixed;\n");
      out.write("                margin-top: 650px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .back-button:hover{\n");
      out.write("                background: linear-gradient(to right bottom, #0018ff, #000000);\n");
      out.write("            }\n");
      out.write("            .logout-button{\n");
      out.write("                background: linear-gradient(to right bottom, #00f0ff, #0018ff);\n");
      out.write("                color: #fff;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding-bottom: 7px;\n");
      out.write("                padding-left: 15px;\n");
      out.write("                padding-right: 15px;\n");
      out.write("                margin-left: 5px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .logout-button:hover{\n");
      out.write("                background: linear-gradient(to right bottom, #0018ff, #000000);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("        /* Events Section */\n");
      out.write("        .events {\n");
      out.write("            background: linear-gradient(to right bottom, #3231a4, #319da4c9);\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));\n");
      out.write("            gap: 20px;\n");
      out.write("            padding: 20px;\n");
      out.write("            height: 730px;\n");
      out.write("            overflow-y: scroll;\n");
      out.write("            scrollbar-width: none;\n");
      out.write("        }\n");
      out.write("        .event {\n");
      out.write("            background: linear-gradient(to right bottom, hsl(258.09deg 76.62% 70.36%), #dcacacba);\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            transition: transform 0.3s;\n");
      out.write("            cursor: pointer;\n");
      out.write("            position: relative;\n");
      out.write("            height: 290px;\n");
      out.write("            column-gap: 20px;\n");
      out.write("        }\n");
      out.write("        .event:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("        }\n");
      out.write("        .event h3 {\n");
      out.write("            margin: 0 0 10px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .event p {\n");
      out.write("            margin: 5px 0;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        .event-info {\n");
      out.write("            color: rgba(255, 255, 255, 0.7);\n");
      out.write("        }\n");
      out.write("        .msg-details{\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 40px 10px 10px 10px;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        .event-actions {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 10px;\n");
      out.write("            right: 10px;\n");
      out.write("            opacity: 0;\n");
      out.write("            transition: opacity 0.3s;\n");
      out.write("        }\n");
      out.write("        .event:hover .event-actions {\n");
      out.write("            opacity: 1;\n");
      out.write("        }\n");
      out.write("        .event-actions button {\n");
      out.write("            background: linear-gradient(to right bottom, #00f0ff, #0018ff);\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("            font-size: 14px;\n");
      out.write("            margin: 5px 5px;\n");
      out.write("            width: 150px;\n");
      out.write("        }\n");
      out.write("        .event-actions button:hover {\n");
      out.write("            background: linear-gradient(to right bottom, #0018ff, #000000);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .event_form{\n");
      out.write("            margin: 10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .post-button{\n");
      out.write("            background: linear-gradient(to right bottom, #00f0ff, #0018ff);\n");
      out.write("        }\n");
      out.write("        .post-button:hover{\n");
      out.write("            background: linear-gradient(to right bottom, #0018ff, #000000);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .msg-desc{\n");
      out.write("            height: 200px;\n");
      out.write("            overflow-y: scroll;\n");
      out.write("            scrollbar-width: none;\n");
      out.write("            text-align: justify;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .msg_info{\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("          .checkbox-wrapper-1 *,\n");
      out.write("  .checkbox-wrapper-1 ::after,\n");
      out.write("  .checkbox-wrapper-1 ::before {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted {\n");
      out.write("    margin: 0;\n");
      out.write("    width: 0;\n");
      out.write("    height: 0;\n");
      out.write("    display: inline;\n");
      out.write("    -webkit-appearance: none;\n");
      out.write("    -moz-appearance: none;\n");
      out.write("    appearance: none;\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted + label:before {\n");
      out.write("    content: \"\";\n");
      out.write("    display: inline-block;\n");
      out.write("    vertical-align: top;\n");
      out.write("    height: 1.15em;\n");
      out.write("    width: 1.15em;\n");
      out.write("    margin-right: 0.6em;\n");
      out.write("    color: rgba(0, 0, 0, 0.275);\n");
      out.write("    border: solid 0.06em;\n");
      out.write("    box-shadow: 0 0 0.04em, 0 0.06em 0.16em -0.03em inset, 0 0 0 0.07em transparent inset;\n");
      out.write("    border-radius: 0.2em;\n");
      out.write("    background: url('data:image/svg+xml;charset=UTF-8,<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" xml:space=\"preserve\" fill=\"white\" viewBox=\"0 0 9 9\"><rect x=\"0\" y=\"4.3\" transform=\"matrix(-0.707 -0.7072 0.7072 -0.707 0.5891 10.4702)\" width=\"4.3\" height=\"1.6\" /><rect x=\"2.2\" y=\"2.9\" transform=\"matrix(-0.7071 0.7071 -0.7071 -0.7071 12.1877 2.9833)\" width=\"6.1\" height=\"1.7\" /></svg>') no-repeat center, white;\n");
      out.write("    background-size: 0;\n");
      out.write("    will-change: color, border, background, background-size, box-shadow;\n");
      out.write("    transform: translate3d(0, 0, 0);\n");
      out.write("    transition: color 0.1s, border 0.1s, background 0.15s, box-shadow 0.1s;\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:enabled:active + label:before,\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:enabled + label:active:before {\n");
      out.write("    box-shadow: 0 0 0.04em, 0 0.06em 0.16em -0.03em transparent inset, 0 0 0 0.07em rgba(0, 0, 0, 0.1) inset;\n");
      out.write("    background-color: #f0f0f0;\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:checked + label:before {\n");
      out.write("    background-color: #3B99FC;\n");
      out.write("    background-size: 0.75em;\n");
      out.write("    color: rgba(0, 0, 0, 0.075);\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:checked:enabled:active + label:before,\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:checked:enabled + label:active:before {\n");
      out.write("    background-color: #0a7ffb;\n");
      out.write("    color: rgba(0, 0, 0, 0.275);\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:focus + label:before {\n");
      out.write("    box-shadow: 0 0 0.04em, 0 0.06em 0.16em -0.03em transparent inset, 0 0 0 0.07em rgba(0, 0, 0, 0.1) inset, 0 0 0 3.3px rgba(65, 159, 255, 0.55), 0 0 0 5px rgba(65, 159, 255, 0.3);\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:focus:active + label:before,\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:focus + label:active:before {\n");
      out.write("    box-shadow: 0 0 0.04em, 0 0.06em 0.16em -0.03em transparent inset, 0 0 0 0.07em rgba(0, 0, 0, 0.1) inset, 0 0 0 3.3px rgba(65, 159, 255, 0.55), 0 0 0 5px rgba(65, 159, 255, 0.3);\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted:disabled + label:before {\n");
      out.write("    opacity: 0.5;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted.dark + label:before {\n");
      out.write("    color: rgba(255, 255, 255, 0.275);\n");
      out.write("    background-color: #222;\n");
      out.write("    background-image: url('data:image/svg+xml;charset=UTF-8,<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" xml:space=\"preserve\" fill=\"rgba(34, 34, 34, 0.999)\" viewBox=\"0 0 9 9\"><rect x=\"0\" y=\"4.3\" transform=\"matrix(-0.707 -0.7072 0.7072 -0.707 0.5891 10.4702)\" width=\"4.3\" height=\"1.6\" /><rect x=\"2.2\" y=\"2.9\" transform=\"matrix(-0.7071 0.7071 -0.7071 -0.7071 12.1877 2.9833)\" width=\"6.1\" height=\"1.7\" /></svg>');\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted.dark:enabled:active + label:before,\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted.dark:enabled + label:active:before {\n");
      out.write("    background-color: #444;\n");
      out.write("    box-shadow: 0 0 0.04em, 0 0.06em 0.16em -0.03em transparent inset, 0 0 0 0.07em rgba(255, 255, 255, 0.1) inset;\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted.dark:checked + label:before {\n");
      out.write("    background-color: #a97035;\n");
      out.write("    color: rgba(255, 255, 255, 0.075);\n");
      out.write("  }\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted.dark:checked:enabled:active + label:before,\n");
      out.write("  .checkbox-wrapper-1 [type=checkbox].substituted.dark:checked:enabled + label:active:before {\n");
      out.write("    background-color: #c68035;\n");
      out.write("    color: rgba(0, 0, 0, 0.275);\n");
      out.write("  }\n");
      out.write("  .check_field{\n");
      out.write("      display: ruby;\n");
      out.write("  }\n");
      out.write("  .input-field{\n");
      out.write("      margin-top: 10px;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("      display: none;\n");
      out.write("      height: 250px;\n");
      out.write("      overflow-y: scroll;\n");
      out.write("  }\n");
      out.write("  table, th, td{\n");
      out.write("      border: 1px solid black;\n");
      out.write("  }\n");
      out.write("  h4{\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  .poster-image{\n");
      out.write("      height: 500px;\n");
      out.write("      width: 500px;\n");
      out.write("  }\n");
      out.write("    </style>\n");
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
      out.write("    \n");
      out.write("   <div class=\"org_container\">\n");
      out.write("        <!-- Profile Section -->\n");
      out.write("        <div id=\"profile\" class=\"section profile\">\n");
      out.write("            <h3>Hello, ");
      out.print( managerUsername );
      out.write("!</h3><br>\n");
      out.write("            <h2>");
      out.print( projectName );
      out.write("</h2><br>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br><br><h2>View Daily Progress Reports</h2><br><br>\n");
      out.write("    <div style=\"display: grid;\">\n");
      out.write("        ");

            List<ReportObject> report_dataList = (List<ReportObject>) request.getAttribute("report_dataList");
            for (ReportObject data : report_dataList) {
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div id=\"date_report_");
      out.print( data.getProgressDate() );
      out.write("\" style=\"display: grid;\">\n");
      out.write("            <h3>Progress Report</h3>\n");
      out.write("            <p><strong>Report Date: </strong>");
      out.print( data.getProgressDate() );
      out.write("</p><br>\n");
      out.write("            <p><strong>Weather: </strong>");
      out.print( data.getWeather() );
      out.write("</p><br>\n");
      out.write("            <p><strong>Temperature: </strong>");
      out.print( data.getTemperature() );
      out.write("</p><br>\n");
      out.write("            <p><strong>Work Done: </strong>");
      out.print( data.getWorkdone() );
      out.write("</p><br>\n");
      out.write("            <p><strong>Challenges: </strong>");
      out.print( data.getChallenges() );
      out.write("</p><br>\n");
      out.write("            <p><strong>Next Steps: </strong>");
      out.print( data.getNextsteps() );
      out.write("</p><br>\n");
      out.write("            \n");
      out.write("            ");

            }
        
      out.write("\n");
      out.write("        \n");
      out.write("            <h4><strong>Material Used: </strong></h4><br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    List<ReportObject> report_dataList1 = (List<ReportObject>) request.getAttribute("report_dataList1");
                    for (ReportObject data1 : report_dataList1) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( data1.getMaterialname() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( data1.getMaterialquantity() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("            <br><h4><strong>Equipments Used: </strong></h4><br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    List<ReportObject> report_dataList2 = (List<ReportObject>) request.getAttribute("report_dataList2");
                    for (ReportObject data1 : report_dataList2) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( data1.getEqipmentname() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( data1.getEquipmentquantity() );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("            <br><h4><strong>Progress Photos: </strong></h4><br>\n");
      out.write("            \n");
      out.write("            <div style=\"display: flex; margin: auto; padding: 5px;\">\n");
      out.write("                ");

                    List<ReportObject> report_dataList3 = (List<ReportObject>) request.getAttribute("report_dataList3");
                    for (ReportObject data1 : report_dataList3) {
                
      out.write("\n");
      out.write("                <div style=\"padding: 5px;\">\n");
      out.write("                ");

                    Blob posterBlob = data1.getProgressphoto();
                    if (posterBlob != null) {
                        try (InputStream inputStream = posterBlob.getBinaryStream()) {
                            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                            byte[] buffer = new byte[4096];
                            int bytesRead = -1;
                            while ((bytesRead = inputStream.read(buffer)) != -1) {
                                outputStream.write(buffer, 0, bytesRead);
                            }
                            byte[] imageBytes = outputStream.toByteArray();
                            String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                            out.println("<img src=\"data:image/jpeg;base64," + base64Image + "\" class=\"poster-image\">");
                        } catch (SQLException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("<script>\n");
      out.write("</script>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
