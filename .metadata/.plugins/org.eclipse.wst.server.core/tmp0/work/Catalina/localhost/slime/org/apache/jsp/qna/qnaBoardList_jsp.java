/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-05 06:40:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qnaBoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/grid.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/qnaBoard.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/normalize.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/index.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>우주슬라임</title>   \r\n");
      out.write("     \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <!--------HAEDER-------->\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("        \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../indexNav.jsp", out, false);
      out.write("           \r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>   \r\n");
      out.write("\r\n");
      out.write("   <!---------------------->\r\n");
      out.write("   <!------QnA목차------->\r\n");
      out.write("   <!---------------------->\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"qnaTableList\"> \r\n");
      out.write("    <section class=\"qnaTable\">\r\n");
      out.write("        <div id=\"qna_list_wrap\">\r\n");
      out.write("            <table id=\"boardListTable\" border=\"1\" cellpadding=\"3\" cellspacing=\"0\" frame=\"hsides\" rules=\"rows\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th width=\"180\">글번호</th>\r\n");
      out.write("                    <th width=\"500\">제목</th>\r\n");
      out.write("                    <th width=\"180\">작성자</th>\r\n");
      out.write("                    <th width=\"100\">조회수</th>\r\n");
      out.write("                    <th width=\"180\">작성일</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <!------글쓰기 버튼------->\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <div id=\"QnaWriteBtn\">\r\n");
      out.write("        <a href=\"/slime/qna/qnaWriteForm.jsp\" role=\"button\" class=\"writeFormBtn\">작성하기</a> \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <!------QnA페이지------->\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <section class=\"qnaPg\">\r\n");
      out.write("    <div id=\"boardPagingDiv\" class=\"paging\" style=\"text-align: center;\"></div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <!------QnA검색---------->\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <section class=\"qnaSearch\">\r\n");
      out.write("        <form id=\"boardSearchForm\">\r\n");
      out.write("        <input type=\"hidden\" name=\"pg\" value=\"1\">\r\n");
      out.write("            <div style=\"text-align: center;\">\r\n");
      out.write("                <select name=\"searchType\" style=\"width: 100px;\">\r\n");
      out.write("                    <option value=\"subject\" selected>제목</option>\r\n");
      out.write("                    <option value=\"member_id\">아이디</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("                <input type=\"search\" name=\"keyword\" id=\"keyword\" autocomplete=\"off\">\r\n");
      out.write("                <input type=\"button\" value=\"검색\" id=\"boardSearchBtn\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </section>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- <script>\r\n");
      out.write("\tfunction openNav() {\r\n");
      out.write("\t\tdocument.getElementById('mySideNav').style.width = '250px';\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction closeNav() {\r\n");
      out.write("\t\tdocument.getElementById('mySideNav').style.width = '0';\r\n");
      out.write("\t}\r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/qnaBoardList.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script><!---->\r\n");
      out.write("<script src=\"https://unpkg.com/ionicons@5.2.3/dist/ionicons.js\"> </script>\r\n");
      out.write("<script>\r\n");
      out.write("function boardPaging(pg){\r\n");
      out.write("\tvar keyword = document.getElementById(\"keyword\").value;\r\n");
      out.write("\tif(keyword == \"\"){\r\n");
      out.write("\t\tlocation.href = 'qnaBoardList?pg='+pg;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$('input[name=pg]').val(pg);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//강제로 이벤트를 발생\r\n");
      out.write("\t\t//[2]페이지에서 다시 검색 버튼을 누르면 2페이지부터 찾는다\r\n");
      out.write("\t\t//다시 검색 버튼을 눌렀을 때는 1페이지부터 검색을 할 수 있도록 정의한다.\r\n");
      out.write("\t\t$('#boardSearchBtn').trigger('click', 'research');\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
