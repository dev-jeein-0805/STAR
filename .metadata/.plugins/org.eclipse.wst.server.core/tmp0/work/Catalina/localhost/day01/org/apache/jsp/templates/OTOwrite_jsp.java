/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-17 06:51:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OTOwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>자주 묻는 질문</title>\r\n");
      out.write("<link href=\"../static/css/OTOwrite.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrap show\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <header>\r\n");
      out.write("        <section>\r\n");
      out.write("            <h1><a class=\"\" href=\"/day01/templates/OTOwrite.jsp\" title=\"star\">STAR</a></h1>\r\n");
      out.write("            <button type=\"button\" class=\"btn_menu nav_open \">메뉴</button>\r\n");
      out.write("            <button type=\"button\" class=\"btn_srch srch_open \">검색</button>\r\n");
      out.write("            <ul class=\"gnb_pc\">\r\n");
      out.write("                    <li><a href=\"\">Main Category1</a></li>\r\n");
      out.write("                    <li><a href=\"\">Main Category2</a></li>\r\n");
      out.write("                    <li class=\"over\">\r\n");
      out.write("                    <button type=\"button\"><span>더보기</span></button>\r\n");
      out.write("                    <ul class=\"list_03\" style=\"display: none; opacity: 1;\">\r\n");
      out.write("	                    <li><a href=\"\">문의게시판</a></li>\r\n");
      out.write("	                    <li><a href=\"\">1:1 문의</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </section>\r\n");
      out.write("    </header>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Sub Top -->\r\n");
      out.write("<div class=\"sub_top_wrap\">\r\n");
      out.write("	<div class=\"sub_top bg_kong_3\">\r\n");
      out.write("		<h2>더보기</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //Sub Top -->\r\n");
      out.write("\r\n");
      out.write("<!-- Content  -->\r\n");
      out.write("<div id=\"content\" class=\"sub_wrap more_wrap\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Nav -->\r\n");
      out.write("	<nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"/more/faq\">자주 묻는 질문</a></li>\r\n");
      out.write("        <li><a href=\"/more/inquiry\" class=\"active\">1:1 문의</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div class=\"align_rt\">\r\n");
      out.write("		<!-- Inquiry -->\r\n");
      out.write("		<div class=\"inquiry\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Tab -->\r\n");
      out.write("			<div class=\"tab\">\r\n");
      out.write("				<span class=\"tab_btn\">나의 문의 내역</span>\r\n");
      out.write("				<span class=\"tab_btn active\">새 문의 작성</span>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- 리스트 -->\r\n");
      out.write("			<div class=\"tab_each\" style=\"display:block\">\r\n");
      out.write("\r\n");
      out.write("			<!-- 작성 -->\r\n");
      out.write("			<div class=\"tab_each\">\r\n");
      out.write("					<form name=\"inq-form\" method=\"post\" action=\"/more/inquiry_submit\">\r\n");
      out.write("						<div class=\"alert_top\">\r\n");
      out.write("							<p>저희 STAR서비스 이용 중 불편하신 점을 문의주시면 <em>최대한 빠른 시일내에 답변 드리겠습니다.</em></p>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<section class=\"info_wrap\">\r\n");
      out.write("							<b>카테고리유형</b>\r\n");
      out.write("							<select name=\"room_type\" id=\"\" class=\"select_type_2\">\r\n");
      out.write("								<option value=\"\">카테고리유형을 선택하세요</option>\r\n");
      out.write("																<option value=\"1\">회원 계정 문의</option>\r\n");
      out.write("																<option value=\"2\">돌봄이 관련 문의</option>\r\n");
      out.write("																<option value=\"3\">미정</option>\r\n");
      out.write("																<option value=\"6\">미정</option>\r\n");
      out.write("																<option value=\"5\">미정</option>\r\n");
      out.write("																<option value=\"7\">미정</option>\r\n");
      out.write("																<option value=\"10\">미정</option>\r\n");
      out.write("																<option value=\"11\">미정</option>\r\n");
      out.write("														</select>\r\n");
      out.write("	\r\n");
      out.write("							<b>문의유형</b>\r\n");
      out.write("							<select name=\"inq_type\" id=\"inq_type\" class=\"select_type_2\">\r\n");
      out.write("								<option value=\"\">문의유형을 선택하세요</option>\r\n");
      out.write("																<option value=\"8\">회원정보</option>\r\n");
      out.write("																<option value=\"7\">예약신청</option>\r\n");
      out.write("																<option value=\"9\">예약취소</option>\r\n");
      out.write("																<option value=\"2\">이용문의</option>\r\n");
      out.write("																<option value=\"1\">퀘스트조건문의</option>\r\n");
      out.write("																<option value=\"4\">기타</option>\r\n");
      out.write("																<option value=\"3\">미정</option>\r\n");
      out.write("																<option value=\"10\">미정</option>\r\n");
      out.write("																<option value=\"99\">미정</option>\r\n");
      out.write("														</select>\r\n");
      out.write("	\r\n");
      out.write("							<div class=\"phone-block\">\r\n");
      out.write("								<b>휴대폰 번호</b>\r\n");
      out.write("								<p class=\"inp_wrap\"><input class=\"js-phone-number\" data-type=\"phoneNumber\" type=\"tel\" maxlength=\"11\" name=\"uphone\" value=\"\" placeholder=\"선택사항입니다.\"><button type=\"button\" class=\"reset_val\">초기화</button></p>\r\n");
      out.write("							</div>\r\n");
      out.write("	\r\n");
      out.write("							<div class=\"email-block\">\r\n");
      out.write("								<b>제목</b>\r\n");
      out.write("								<p class=\"inp_wrap\"><input data-email-validate=\"\" class=\"js-email-string\" type=\"email\" value=\"\" name=\"uemail\" placeholder=\"선택사항입니다.\"><button type=\"button\" class=\"reset_val\">초기화</button></p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</section>\r\n");
      out.write("\r\n");
      out.write("						<section class=\"text_wrap\">\r\n");
      out.write("							<b>문의내용</b>\r\n");
      out.write("							<div>\r\n");
      out.write("								<textarea name=\"content\" id=\"questionTextarea\"></textarea>\r\n");
      out.write("								<ul class=\"placeholder_txt\">\r\n");
      out.write("									<li>문의하실 내용을 10자 이상 입력해 주세요.</li>\r\n");
      out.write("									<li>문의하시는 제휴점 이름과 예약정보를 남겨주시면 보다 빠른 상담이 가능합니다.</li>\r\n");
      out.write("									<li>문의 내용 작성 시 개인정보가 입력되지 않도록 주의 부탁드립니다.</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</section>\r\n");
      out.write("						<section class=\"btn_wrap \">\r\n");
      out.write("							<button class=\"btn_blue_fill\" type=\"button\" onclick=\"$.inqSubmit();\">작성 완료</button>\r\n");
      out.write("						</section>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //Content  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"align\">\r\n");
      out.write("            <ul class=\"link\">\r\n");
      out.write("                <li><a href=\"http://www.naver.com/\" target=\"_blank\">회사소개</a><span>|</span></li>\r\n");
      out.write("                <li><a href=\"http://www.naver.com/\" data-default=\"term\">이용약관</a><span>|</span></li>\r\n");
      out.write("                <li><a href=\"http://www.naver.com/\" data-default=\"privacy\">개인정보처리방침</a><span>|</span></li>\r\n");
      out.write("                <li><a href=\"http://www.naver.com/\" target=\"_blank\">돌봄예약신청</a><span>|</span></li>\r\n");
      out.write("                <li><a href=\"http://www.naver.com/\" target=\"_blank\">돌봄이용후기</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <p><b>고객센터 1588-5890</b><span>오전 9시 - 오후 6시</span></p>\r\n");
      out.write("            <address>\r\n");
      out.write("                <span>(주) STAR컴퍼니</span>\r\n");
      out.write("								주소 : 서울 강남구 테헤란로 146 | 대표이사 : STAR | 사업자등록번호: 010-12-34567 | 전자우편주소 : star@star.kr<br>\r\n");
      out.write("                통신판매번호 : 2023-서울강남-01001 | 관광사업자 등록번호: 제2023-01호 | 전화번호 : 1588-5890 | 호스팅서비스제공자의 상호 표시: (주) STAR컴퍼니<br>\r\n");
      out.write("                <span class=\"order\">(주) STAR컴퍼니는 서비스예약중개자로서 서비스제공의 당사자가 아니며, 서비스의 예약, 이용과 관련한 의무와 책임은 각 이용자에게 있습니다.</span><br>\r\n");
      out.write("                Copyright STAR COMPANY Corp. All rights reserved.\r\n");
      out.write("            </address>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("	<!-- 상단으로 -->\r\n");
      out.write("	<button class=\"btn_go_top\" onclick=\"moveTop();\" style=\"display: none;\">상단으로</button>\r\n");
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
