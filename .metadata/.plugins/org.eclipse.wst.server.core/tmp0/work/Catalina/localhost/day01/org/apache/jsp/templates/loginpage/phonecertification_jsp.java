/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-26 07:18:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.loginpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phonecertification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"../../static/css/loginpage/phonecertification.css\" type=\"text/css\">\r\n");
      out.write("<title>회원가입|STAR</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"layer_fix pop_login pop_mem_reserve\">\r\n");
      out.write("	    <section>\r\n");
      out.write("		    <div class=\"fix_title\">\r\n");
      out.write("		        <strong>휴대폰 본인 확인</strong>\r\n");
      out.write("		    </div>\r\n");
      out.write("		\r\n");
      out.write("		    <p>\r\n");
      out.write("				원활한 서비스 제공을 위해, 휴대폰 번호를 입력해주세요.\r\n");
      out.write("		    </p>\r\n");
      out.write("		\r\n");
      out.write("		    <div class=\"phone_confirm\">\r\n");
      out.write("		        <div id=\"sendCode\">\r\n");
      out.write("		            <strong>휴대폰 번호</strong>\r\n");
      out.write("		            <section>\r\n");
      out.write("		                <div class=\"inp_wrap remove\">\r\n");
      out.write("		                    <input type=\"tel\" id=\"phone_number\" maxlength=\"11\">\r\n");
      out.write("		                    <button type=\"button\" class=\"btn_checked\">확인</button>\r\n");
      out.write("		                </div>\r\n");
      out.write("		                <button type=\"button\" class=\"btn_send btn_confirm\">인증번호 전송</button>\r\n");
      out.write("		                <!-- 활성화 클래스 'active' -->\r\n");
      out.write("		            </section>\r\n");
      out.write("		        </div>\r\n");
      out.write("		        <div id=\"verificationCode\">\r\n");
      out.write("		            <strong>인증번호</strong>\r\n");
      out.write("		            <section>\r\n");
      out.write("		                <div class=\"inp_wrap remove\">\r\n");
      out.write("		                    <input type=\"tel\" id=\"digit\" minlength=\"4\" maxlength=\"4\">\r\n");
      out.write("		                    <span class=\"timer\">&nbsp;</span>\r\n");
      out.write("		                </div>\r\n");
      out.write("		                <button type=\"button\" class=\"btn_ok btn_confirm\" data-verification-type=\"call\" data-verification-next=\"joinTemplate\">확인</button>\r\n");
      out.write("		            </section>\r\n");
      out.write("		        </div>\r\n");
      out.write("		        <input type=\"hidden\" id=\"phone_certification_point\" value=\"SIGINUP\" style=\"display: none;\">\r\n");
      out.write("		    </div>\r\n");
      out.write("		</section>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var timeId = null\r\n");
      out.write("var regExp = /^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?([0-9]{3,4})-?([0-9]{4})$/;\r\n");
      out.write("var setSeconds = 180;\r\n");
      out.write("var setSendSeconds = 60;\r\n");
      out.write("\r\n");
      out.write("var sendCodeUrl = '/verification/sendCode';\r\n");
      out.write("var verifyCodeUrl = '/verification/verifyCode';\r\n");
      out.write("\r\n");
      out.write("var phoneNumberId = '#phone_number';\r\n");
      out.write("var digitId = '#digit';\r\n");
      out.write("var certificationPoint = \"#phone_certification_point\";\r\n");
      out.write("\r\n");
      out.write("var verificationCodeId = '#verificationCode';\r\n");
      out.write("\r\n");
      out.write("var sendButtonId = 'button.btn_send.btn_confirm';\r\n");
      out.write("var sendOkButtonId = 'button.btn_ok.btn_confirm';\r\n");
      out.write("var sendcheckButtonId = 'button.btn_checked';\r\n");
      out.write("var timerId = '#verificationCode span.timer';\r\n");
      out.write("\r\n");
      out.write("function buildTimeFormat(seconds) {\r\n");
      out.write("    function str_pad_left(string,pad,length) {\r\n");
      out.write("        return (new Array(length+1).join(pad)+string).slice(-length);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return str_pad_left(Math.floor(seconds / 60),'0',2) +\r\n");
      out.write("        ':'+ str_pad_left(Math.floor(seconds % 60),'0',2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function printTimecount(){ // 초 카운트\r\n");
      out.write("    var finalTime = buildTimeFormat(setSeconds);\r\n");
      out.write("    \r\n");
      out.write("    $(timerId).html(finalTime);\r\n");
      out.write("\r\n");
      out.write("    setSeconds--;\r\n");
      out.write("\r\n");
      out.write("    if (setSeconds < 0) { // 종료\r\n");
      out.write("        clearTimecount();\r\n");
      out.write("        cencelSend();\r\n");
      out.write("\r\n");
      out.write("        toastPop('인증번호가 만료되었습니다. 재전송 해주시기 바랍니다.');\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setTimecount() {\r\n");
      out.write("    clearTimecount();\r\n");
      out.write("    cencelSend();\r\n");
      out.write("    \r\n");
      out.write("    timeId = setInterval(printTimecount, 1000);\r\n");
      out.write("\r\n");
      out.write("    if ($(verificationCodeId).css('display') == 'none') {\r\n");
      out.write("        $(verificationCodeId).fadeIn(250);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(sendcheckButtonId).show();\r\n");
      out.write("    $(sendButtonId).html('재전송');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function clearTimecount() {\r\n");
      out.write("    if (timeId !== null) {\r\n");
      out.write("        clearInterval(timeId);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    timeId = null;\r\n");
      out.write("    setSeconds = 180;\r\n");
      out.write("\r\n");
      out.write("    var finalTime = buildTimeFormat(setSeconds);\r\n");
      out.write("\r\n");
      out.write("    $(timerId).html(finalTime);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function cencelSend() {\r\n");
      out.write("    $(verificationCodeId).hide();\r\n");
      out.write("    $(digitId).val('');\r\n");
      out.write("    $(sendcheckButtonId).hide();\r\n");
      out.write("    $(sendOkButtonId).removeClass('active');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).on('keyup', phoneNumberId, function () {\r\n");
      out.write("    var str = $(this).val().replace(/[^0-9]/gi, '');\r\n");
      out.write("\r\n");
      out.write("    clearTimecount();\r\n");
      out.write("    cencelSend();\r\n");
      out.write("\r\n");
      out.write("    $(this).data('phoneverify', 'N');\r\n");
      out.write("    $(this).val(str.replace(regExp, \"$1$2$3\"));\r\n");
      out.write("\r\n");
      out.write("    if (regExp.exec(str) == null || $(sendButtonId).hasClass('dbclicked')) {\r\n");
      out.write("        $(sendButtonId).removeClass('active');\r\n");
      out.write("    } else {\r\n");
      out.write("        $(sendButtonId).addClass('active');\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).on('keyup', digitId, function () {\r\n");
      out.write("    $(this).val($(this).val().replace(/[^0-9]/gi, ''));\r\n");
      out.write("\r\n");
      out.write("    if ($(this).val().length != 4) {\r\n");
      out.write("        $(sendOkButtonId).removeClass('active');\r\n");
      out.write("    } else {\r\n");
      out.write("        $(sendOkButtonId).addClass('active');\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).on('click', sendButtonId, function () {\r\n");
      out.write("    var data = {\r\n");
      out.write("        phone_number: $(phoneNumberId).val(),\r\n");
      out.write("        certification_point: $(certificationPoint).val()\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    if ($(this).hasClass('dbclicked')) {\r\n");
      out.write("        // cencelSend();\r\n");
      out.write("        toastPop(\"1분 후에 다시 시도해주세요.\");\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (data.phone_number.length == 0) {\r\n");
      out.write("        cencelSend();\r\n");
      out.write("        toastPop('휴대폰 번호를 입력하세요.');\r\n");
      out.write("\r\n");
      out.write("        $(this).removeClass('active');\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (regExp.exec(data.phone_number) == null) {\r\n");
      out.write("        cencelSend();\r\n");
      out.write("        toastPop('휴대폰 번호 형식이 아닙니다.');\r\n");
      out.write("\r\n");
      out.write("        $(this).removeClass('active');\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $.post(sendCodeUrl, data, function (result) {\r\n");
      out.write("        $(sendButtonId).removeClass('active');\r\n");
      out.write("\r\n");
      out.write("        if (result.code == 200) {\r\n");
      out.write("            $(sendButtonId).addClass('dbclicked');\r\n");
      out.write("            $(phoneNumberId).data('phoneverify', 'N');\r\n");
      out.write("\r\n");
      out.write("            setTimecount();\r\n");
      out.write("            \r\n");
      out.write("            setTimeout(function () {\r\n");
      out.write("                $(sendButtonId).removeClass('dbclicked');\r\n");
      out.write("                $(sendButtonId).addClass('active');\r\n");
      out.write("            }, setSendSeconds * 1000);\r\n");
      out.write("        } else {\r\n");
      out.write("            cencelSend();\r\n");
      out.write("            toastPop(result.message);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(document).on('click', sendOkButtonId, function () {\r\n");
      out.write("    spin_dimm();\r\n");
      out.write("    var type = $(this).data('verification-type');\r\n");
      out.write("    var next = $(this).data('verification-next');\r\n");
      out.write("    var argument = $(this).data('verification-argument');\r\n");
      out.write("    var data = {\r\n");
      out.write("        phone_number: $(phoneNumberId).val(),\r\n");
      out.write("        digit: $(digitId).val(),\r\n");
      out.write("        certification_point: $(certificationPoint).val()\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    if (data.phone_number.length == 0) {\r\n");
      out.write("        spin_dimm_off();\r\n");
      out.write("\r\n");
      out.write("        toastPop('휴대폰 번호를 입력하세요.');\r\n");
      out.write("\r\n");
      out.write("        $(sendOkButtonId).removeClass('active');\r\n");
      out.write("        $(phoneNumberId).data('phoneverify', 'N');\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (regExp.exec(data.phone_number) == null) {\r\n");
      out.write("        spin_dimm_off();\r\n");
      out.write("        toastPop('휴대폰 번호 형식이 아닙니다.');\r\n");
      out.write("\r\n");
      out.write("        $(sendOkButtonId).removeClass('active');\r\n");
      out.write("        $(phoneNumberId).data('phoneverify', 'N');\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $.post(verifyCodeUrl, data, function (result) {\r\n");
      out.write("        spin_dimm_off();\r\n");
      out.write("        $(sendOkButtonId).removeClass('active');\r\n");
      out.write("\r\n");
      out.write("        if (result.code == 200) {\r\n");
      out.write("            $(phoneNumberId).data('phoneverify', 'Y');\r\n");
      out.write("\r\n");
      out.write("            switch(type) {\r\n");
      out.write("                case 'call':\r\n");
      out.write("                    clearTimecount();\r\n");
      out.write("                    cencelSend();\r\n");
      out.write("\r\n");
      out.write("                    window[next](argument);\r\n");
      out.write("                    break;\r\n");
      out.write("                case 'link':\r\n");
      out.write("                    window.location.href = next;\r\n");
      out.write("                    break;\r\n");
      out.write("                default:\r\n");
      out.write("                    window.location.href = '/';\r\n");
      out.write("            }\r\n");
      out.write("        } else {\r\n");
      out.write("            if (result.code == 302) {\r\n");
      out.write("                clearTimecount();\r\n");
      out.write("                cencelSend();\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            toastPop(result.message);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("   \r\n");
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
