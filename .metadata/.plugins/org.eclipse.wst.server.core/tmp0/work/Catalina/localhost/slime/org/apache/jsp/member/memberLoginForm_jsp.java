/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-15 01:52:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.math.BigInteger;

public final class memberLoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.security.SecureRandom");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.math.BigInteger");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/memberLoginForm.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css\" />\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("   \t<script>\r\n");
      out.write("\t\t$('.link-find').click(function (event) {\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t$(this).modal({\r\n");
      out.write("\t\t\t\t\tcloseExisting: false\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t});   \t\t\t\r\n");
      out.write("/*    \t\t$(function() {\r\n");
      out.write("   \t\t}); */\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"modal-header\">\r\n");
      out.write("        <h2 class=\"login-header\">로그인</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\t\t<div class=\"memberLoginForm\"> <!-- 가운데 정렬하려고 잡아놨음. -->\r\n");
      out.write("\t        <form action=\"\" name=\"memberLoginForm\" class=\"loginForm\">\r\n");
      out.write("\t            <div class=\"box-login\">    \r\n");
      out.write("\t                <div class=\"input-text\">\r\n");
      out.write("\t                    <input type=\"text\" id=\"loginId\" name=\"loginId\" placeholder=\"아이디 입력\">\r\n");
      out.write("\t                    <div id=\"loginIdDiv\"></div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                \r\n");
      out.write("\t                <div class=\"input-text\">\r\n");
      out.write("\t                    <input type=\"password\" id=\"loginPwd\" name=\"loginPwd\" placeholder=\"비밀번호 입력\">\r\n");
      out.write("\t                    <div id=\"loginPwdDiv\"></div>\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            \r\n");
      out.write("\t            <div>\r\n");
      out.write("\t                <input type=\"button\" id=\"loginBtn\" class=\"loginBtn\" value=\"로그인\" sytle=\"margin-bottom:10px;\">\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div style=\"margin-top:10px;\">\r\n");
      out.write("\t\t\t\t\t                \t            <!--네이버 로그인-->\r\n");
      out.write("\t\t\t\t\t\t\t\t");

						    String clientId = "bpePMEMFqUEtjH5x7Ira";//애플리케이션 클라이언트 아이디값";
						    String redirectURI = URLEncoder.encode("http://localhost:8080/slime/", "UTF-8");
						    SecureRandom random = new SecureRandom();
						    String state = new BigInteger(130, random).toString();
						    String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
						    apiURL += "&client_id=" + clientId;
						    apiURL += "&redirect_uri=" + redirectURI;
						    apiURL += "&state=" + state;
						    session.setAttribute("state", state);
						 
      out.write("\r\n");
      out.write("\t\t\t\t\t  <a href=\"");
      out.print(apiURL);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t  <img height=\"40\" width=\"308\" src=\"/slime/image/naver.jpg\"/>\r\n");
      out.write("\t\t\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t\t</div> \r\n");
      out.write("\t            \r\n");
      out.write("\r\n");
      out.write("\t          \t            \r\n");
      out.write("\t            <div class=\"login-append\" style=\"margin-left:10px;\">\r\n");
      out.write("\t                <div class=\"inp-chk\">\r\n");
      out.write("\t                    <input type=\"checkbox\" id=\"keepLogin\" class=\"inp-radio\" name=\"keepLogin\">\r\n");
      out.write("\t                    <span class=\"txt-lab\">로그인 상태 유지</span>                 \r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                <span>\r\n");
      out.write("\t                    <a data-dismiss=\"modal\" href=\"/slime/member/memberSearch\" rel=\"modal:open\" class=\"link-find\">아이디·비밀번호 찾기</a>\r\n");
      out.write("\t                </span>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            \r\n");
      out.write("\t        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js\"></script> <!-- 위아래 순서가 바뀌면 안된다 -->\r\n");
      out.write("       \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/slime/js/member.js?ver=1\"></script>\t<!-- 위아래 순서가 바뀌면 안된다 -->\r\n");
      out.write("        \r\n");
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
