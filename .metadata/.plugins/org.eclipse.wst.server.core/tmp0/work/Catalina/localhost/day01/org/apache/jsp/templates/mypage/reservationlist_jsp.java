/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-27 05:46:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservationlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/mypage/reservationlist.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/gh/orioncactus/pretendard/dist/web/static/pretendard.css\" />\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>돌봄내역</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"wrap show\">\r\n");
      out.write("		<header id=\"menu\">\r\n");
      out.write("            <section>\r\n");
      out.write("                <div>\r\n");
      out.write("                <img style=\"width: 150px;\r\n");
      out.write("   					 height: 150px;\r\n");
      out.write("    				margin-left: -90px;\r\n");
      out.write("    				margin-top: -33px;\" \r\n");
      out.write("    				src=\"../../static/image/3.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <h1>                 \r\n");
      out.write("                    <a href=\"\" id=\"bannertext\">Save The Animal Relationship</a>\r\n");
      out.write("                </h1>\r\n");
      out.write("                <ul class=\"gnb_pc\" >\r\n");
      out.write("                    <li><a class=\"bannertext\" href=\"\">내주변</a></li>\r\n");
      out.write("                    <li><a class=\"bannertext\" href=\"\">예약내역</a></li>\r\n");
      out.write("                    <li><a class=\"bannertext\" href=\"\">더보기</a></li>\r\n");
      out.write("                    <li><a class=\"bannertext\" href=\"\">로그인</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("        </header>\r\n");
      out.write("		<div class=\"sub_top_wrap\">\r\n");
      out.write("			<div class=\"sub_top bg_kong_2\">\r\n");
      out.write("				<h2>이용내역</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"content\" class=\"sub_wrap my_wrap\">\r\n");
      out.write("			<nav>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a  href=\"info.jsp\">내 정보 관리</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"petsitterform.jsp\">돌보미 신청</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"carelist.jsp\">돌봄 내역</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a class=\"mypageatag\" href=\"reservationlist.jsp\">이용 내역</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"review.jsp\">이용후기</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"report.jsp\">신고목록</a>\r\n");
      out.write("					</li>\r\n");
      out.write("			</nav>\r\n");
      out.write("			<div class=\"align_rt\">\r\n");
      out.write("				<div class=\"reverse_list\">\r\n");
      out.write("					<section>\r\n");
      out.write("						<h3>예약 내역</h3>\r\n");
      out.write("					</section>\r\n");
      out.write("					<section class=\"list_cancel\">\r\n");
      out.write("						<h3>이용 내역</h3>\r\n");
      out.write("						<ul class=\"list_wrap\">\r\n");
      out.write("							<li class=\"reservation-detail\">\r\n");
      out.write("								<div>\r\n");
      out.write("									<p class=\"pic\">\r\n");
      out.write("										<img alt=\"\"\r\n");
      out.write("											src=\"https://image.goodchoice.kr/resize_354x184/adimg_new/4354/24465/90e1e317e0b5a9c2c7cbb7828c8faced.jpg\">\r\n");
      out.write("									</p>\r\n");
      out.write("									<a href=\"\" class=\"product-title\"> \r\n");
      out.write("										<i class=\"bg_w\">이용완료</i>\r\n");
      out.write("										<strong>신촌 라싸</strong> \r\n");
      out.write("										<span>03.27 월 - 03.27 월 • 대실</span>\r\n");
      out.write("									</a>\r\n");
      out.write("									<p class=\"btn_re\">\r\n");
      out.write("										<a href=\"\">다시 예약</a>\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"reservation-detail\">\r\n");
      out.write("								<div>\r\n");
      out.write("									<p class=\"pic\">\r\n");
      out.write("										<img alt=\"\"\r\n");
      out.write("											src=\"https://image.goodchoice.kr/resize_354x184/adimg_new/4354/24465/90e1e317e0b5a9c2c7cbb7828c8faced.jpg\">\r\n");
      out.write("									</p>\r\n");
      out.write("									<a href=\"\" class=\"product-title\"> \r\n");
      out.write("										<i class=\"bg_w\">이용완료</i>\r\n");
      out.write("										<strong>신촌 라싸</strong> \r\n");
      out.write("										<span>03.27 월 - 03.27 월 • 대실</span>\r\n");
      out.write("									</a>\r\n");
      out.write("									<p class=\"btn_re\">\r\n");
      out.write("										<a href=\"\">다시 예약</a>\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"reservation-detail\">\r\n");
      out.write("								<div>\r\n");
      out.write("									<p class=\"pic\">\r\n");
      out.write("										<img alt=\"\"\r\n");
      out.write("											src=\"https://image.goodchoice.kr/resize_354x184/adimg_new/4354/24465/90e1e317e0b5a9c2c7cbb7828c8faced.jpg\">\r\n");
      out.write("									</p>\r\n");
      out.write("									<a href=\"\" class=\"product-title\"> \r\n");
      out.write("										<i class=\"bg_w\">이용완료</i>\r\n");
      out.write("										<strong>신촌 라싸</strong> \r\n");
      out.write("										<span>03.27 월 - 03.27 월 • 대실</span>\r\n");
      out.write("									</a>\r\n");
      out.write("									<p class=\"btn_re\">\r\n");
      out.write("										<a href=\"\">다시 예약</a>\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"reservation-detail\">\r\n");
      out.write("								<div>\r\n");
      out.write("									<p class=\"pic\">\r\n");
      out.write("										<img alt=\"\"\r\n");
      out.write("											src=\"https://image.goodchoice.kr/resize_354x184/adimg_new/4354/24465/90e1e317e0b5a9c2c7cbb7828c8faced.jpg\">\r\n");
      out.write("									</p>\r\n");
      out.write("									<a href=\"\" class=\"product-title\"> \r\n");
      out.write("										<i class=\"bg_w\">이용완료</i>\r\n");
      out.write("										<strong>신촌 라싸</strong> \r\n");
      out.write("										<span>03.27 월 - 03.27 월 • 대실</span>\r\n");
      out.write("									</a>\r\n");
      out.write("									<p class=\"btn_re\">\r\n");
      out.write("										<a href=\"\">다시 예약</a>\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</section>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/mypage/header.js\"></script>\r\n");
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
