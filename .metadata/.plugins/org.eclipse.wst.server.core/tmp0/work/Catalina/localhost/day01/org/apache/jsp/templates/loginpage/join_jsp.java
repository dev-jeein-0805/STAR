/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-26 07:18:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.loginpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../static/css/loginpage/join.css\" type=\"text/css\">\r\n");
      out.write("<title>회원가입|STAR</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"layer_fix pop_login pop_mem_reserve fix_disable\">\r\n");
      out.write("       <section>\r\n");
      out.write("          <form id=\"joinForm\" action=\"https://www.goodchoice.kr/user/joinProcess\" autocomplete=\"off\" method=\"post\" novalidate=\"novalidate\">\r\n");
      out.write("              <input type=\"hidden\" name=\"yeogi_token\" value=\"6a6e8bbde2bc868605204597f7ec1653\">\r\n");
      out.write("      \r\n");
      out.write("            <input type=\"hidden\" name=\"privacy_auxiliary_policy\">\r\n");
      out.write("            <input type=\"hidden\" name=\"location_policy\">\r\n");
      out.write("            <input type=\"hidden\" name=\"marketing_acceptance\">\r\n");
      out.write("      \r\n");
      out.write("              <div class=\"fix_title\">\r\n");
      out.write("                  <h1 class=\"page_head\"><a href=\"https://www.goodchoice.kr/\" title=\"여기어때\">여기어때</a></h1>\r\n");
      out.write("              </div>\r\n");
      out.write("      \r\n");
      out.write("              <div class=\"join\">\r\n");
      out.write("                  <strong class=\"sub_title\">회원가입</strong>\r\n");
      out.write("                  <b>아이디</b>\r\n");
      out.write("                  <div class=\"inp_type_2 form-errors\">\r\n");
      out.write("                     <!-- focus / err -->\r\n");
      out.write("                      <input type=\"email\" name=\"uid\" id=\"gcuseremail\" placeholder=\"이메일 주소를 입력해주세요.\">\r\n");
      out.write("                  <label id=\"gcuseremail_msg\" class=\"validate_msg_label\" style=\"color: red;\"></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("      \r\n");
      out.write("                  <b>비밀번호</b>\r\n");
      out.write("                  <div class=\"inp_type_2 form-errors form-password-rule\">\r\n");
      out.write("                      <input type=\"password\" name=\"upw\" placeholder=\"비밀번호를 입력해주세요.\" id=\"new_pw\">\r\n");
      out.write("                  <label id=\"new_pw_msg\" class=\"validate_msg_label\"></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("      \r\n");
      out.write("                  <b>비밀번호 확인</b>\r\n");
      out.write("                  <div class=\"inp_type_2 form-errors\">\r\n");
      out.write("                      <input type=\"password\" name=\"upw_retry\" placeholder=\"비밀번호를 다시 입력해주세요.\" id=\"new_pw_re\">\r\n");
      out.write("                  <label id=\"new_pw_re_msg\" class=\"validate_msg_label\"></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  <b>이 름</b>\r\n");
      out.write("                  <div class=\"inp_type_2 form-errors form-username\">\r\n");
      out.write("                      <input type=\"text\" name=\"uname\" id=\"gcusername\" placeholder=\"이름을 입력해주세요.\">\r\n");
      out.write("                  <label id=\"name2\" class=\"validate_msg_label\" style=\"color: red;\"></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  <button type=\"button\" id=\"joinBtn\" class=\"btn_link gra_left_right_red btn_user_submit\"  style=\"background-color: rgb(250, 250, 250); color: rgba(0, 0, 0, 0.16); border: none;\">\r\n");
      out.write("                     <span>가입하기</span>\r\n");
      out.write("                  </button>\r\n");
      out.write("              </div>\r\n");
      out.write("          </form>\r\n");
      out.write("      </section>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write(" $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("    var youhyo =/([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$/ ;\r\n");
      out.write("    var youhyoname = /^[가-힣]{2,4}$/; \r\n");
      out.write("    var buttonhwal = document.getElementById('joinBtn');\r\n");
      out.write("    \r\n");
      out.write("//아이디 \r\n");
      out.write("$(\"#gcuseremail\").blur(function(){\r\n");
      out.write("    var email = $(\"#gcuseremail\").val();\r\n");
      out.write("\r\n");
      out.write("    if( email == '' || email == 'undefined') {\r\n");
      out.write("        $(\"#gcuseremail_msg\").css('color','red');\r\n");
      out.write("        $(\"#gcuseremail_msg\").text('이메일을 입력해 주세요');  \r\n");
      out.write("        return false;\r\n");
      out.write("}\r\n");
      out.write("    else if(! youhyo.test(email)  ) {\r\n");
      out.write("        $(\"#gcuseremail_msg\").css('color','red');\r\n");
      out.write("        $(\"#gcuseremail_msg\").text('사용할 수 없는 이메일 입니다.');\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    else if( youhyo.test(email)  ) {\r\n");
      out.write("        $(\"#gcuseremail_msg\").css('color','blue');\r\n");
      out.write("        $(\"#gcuseremail_msg\").text('사용할 수 있는 이메일 입니다.');\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// 비번\r\n");
      out.write("$(\"#new_pw_re\").blur(function(){\r\n");
      out.write("    \r\n");
      out.write("    var pass = $(\"#new_pw\").val();\r\n");
      out.write("    var passcheck = $(\"#new_pw_re\").val();\r\n");
      out.write("\r\n");
      out.write(" if(passcheck == pass){\r\n");
      out.write("    $(\"#new_pw_re_msg\").css('color','blue');\r\n");
      out.write("    $(\"#new_pw_re_msg\").text('비밀번호가 일치합니다.');\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" else if(passcheck != pass){\r\n");
      out.write("    $(\"#new_pw_re_msg\").css('color','red');\r\n");
      out.write("    $(\"#new_pw_re_msg\").text('비밀번호가 일치하지 않습니다.');\r\n");
      out.write("    return false;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(\"#new_pw\").blur(function(){\r\n");
      out.write("\r\n");
      out.write("var pass = $(\"#new_pw\").val();\r\n");
      out.write("var passcheck = $(\"#new_pw_re\").val();\r\n");
      out.write("\r\n");
      out.write("if(passcheck == pass){\r\n");
      out.write("$(\"#new_pw_re_msg\").css('color','blue');\r\n");
      out.write("$(\"#new_pw_re_msg\").text('비밀번호가 일치합니다.');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else if(passcheck != pass){\r\n");
      out.write("$(\"#new_pw_re_msg\").css('color','red');\r\n");
      out.write("$(\"#new_pw_re_msg\").text('비밀번호가 일치하지 않습니다.');\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("// 이름\r\n");
      out.write("$(\"#gcusername\").blur(function(){\r\n");
      out.write("\r\n");
      out.write("    var name = $(\"#gcusername\").val();\r\n");
      out.write("\r\n");
      out.write("    if( name == '' || name == 'undefined') {\r\n");
      out.write("        $(\"#name2\").css('color','red');\r\n");
      out.write("        $(\"#name2\").text('이름을 입력해주세요.');  \r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    else if(! youhyoname.test(name)  ) {\r\n");
      out.write("        $(\"#name2\").css('color','red');\r\n");
      out.write("        $(\"#name2\").text('제대로된 이름을 입력해주세요.');\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    else if(youhyoname.test(name)){\r\n");
      out.write("        $(\"#name2\").css('color','blue');\r\n");
      out.write("        $(\"#name2\").text('사용할 수 있는 이름 입니다.');\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("});    \r\n");
      out.write("      \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
