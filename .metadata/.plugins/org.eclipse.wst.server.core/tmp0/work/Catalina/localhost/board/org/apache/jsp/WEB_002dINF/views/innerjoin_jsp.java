/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-03-12 05:36:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class innerjoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- font awesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" media=\"screen\" title=\"no title\" charset=\"utf-8\">\r\n");
      out.write("<!-- Custom style -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\" title=\"no title\" charset=\"utf-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("      <article class=\"container\" >\r\n");
      out.write("        <div class=\"page-header text-center\" >\r\n");
      out.write("          <h1>회원가입 <small>Sign up</small></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"InputId\">아이디</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"Id\" placeholder=\"아이디\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn pull-right \" type=\"button\">아이디체크</button>            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"InputPassword1\">비밀번호</label>\r\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"Password\" placeholder=\"비밀번호\">\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"InputPassword2\">비밀번호 확인</label>\r\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"Password2\" placeholder=\"비밀번호 확인\">\r\n");
      out.write("              <p class=\"help-block\">비밀번호 확인을 위해 다시 한번 입력 해 주세요</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"username\">이름</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"Name\" placeholder=\"이름을 입력해 주세요\">\r\n");
      out.write("            </div>\r\n");
      out.write("                     \r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("              <label for=\"InputNumber\">전화 번호</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"PhoneNum\" placeholder=\"전화 번호를 입력해 주세요\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"InputEmail\">이메일 주소</label>\r\n");
      out.write("              <input type=\"email\" class=\"form-control\" id=\"Email\" placeholder=\"이메일 주소를 입력해 주세요\">\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"InputCompany\">업체명</label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"Company\" placeholder=\"업체명을 입력해 주세요\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("            <table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align:left;border:1px solid #e0e0e0;background-color:f9f9f9;padding:5px\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-top:7px;padding-bottom:5px;font-weight:bold;padding-left:7px;\">※ 개인정보 수집 및 이용에 관한 안내</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-left:10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:97%;height:95px;font-size:11px;letter-spacing: -0.1em;border:1px solid #c5c5c5;background-color:#fff;padding-left:14px;padding-top:7px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t1. 수집 개인정보 항목 : 이름, 전화번호, 이메일 주소, 업체명 <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t2. 개인정보의 수집 및 이용목적 : 제휴신청에 따른 본인확인 및 원활한 의사소통 경로 확보 <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t3. 개인정보의 이용기간 : 모든 검토가 완료된 후 3개월간 이용자의 조회를 위하여 보관하며, 이후 해당정보를 지체 없이 파기합니다. <br />\r\n");
      out.write("\t\t\t\t\t\t\t\t4. 그 밖의 사항은 개인정보취급방침을 준수합니다.\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding-top:7px;padding-left:5px;padding-bottom:7px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"info\" value=\"1\" class=\"input_radio\"> 개인정보 수집 및 이용에 대해 동의합니다.\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <div class=\"form-group text-center\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-info\" onclick=\"location.href='/WEB-INF/views/join_ok.jsp'\">회원가입<i class=\"fa fa-check spaceLeft\"></i></button>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-warning\">취소<i class=\"fa fa-times spaceLeft\"></i></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </article>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
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
