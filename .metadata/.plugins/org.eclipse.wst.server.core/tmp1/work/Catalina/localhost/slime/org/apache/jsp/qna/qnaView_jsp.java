/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-04 10:27:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qnaView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1609668270889L));
    _jspx_dependants.put("jar:file:/D:/SlimeProject/gaebokchi/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/uzuslime/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/grid.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/qnaBoard.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/normalize.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/slime/css/qnaView.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <title>우주슬라임</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!---------------------->    \r\n");
      out.write("    <!--------HAEDER-------->\r\n");
      out.write("    <!---------------------->\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("        \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../indexNav.jsp", out, false);
      out.write("           \r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("<form name=\"qnaViewForm\">\r\n");
      out.write("<section id=\"qnaViewSection\">\r\n");
      out.write("<input type=\"hidden\" name=\"seq\" id=\"seq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"pg\" id=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<div class=\"viewModal\" id=\"qnaViewTotal\">\r\n");
      out.write("\t <div class=\"qnaView\">\r\n");
      out.write("                <div class=\"qnaContent\">\r\n");
      out.write("                    <div class=\"qnaHeader\">\r\n");
      out.write("                        <div class=\"qnaTitle\">\r\n");
      out.write("                        \t<!--제목-->\r\n");
      out.write("                            <div class=\"subject\" id=\"subjectSpan\">제목들어가는 곳\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"qnaFix\">\r\n");
      out.write("                            \t\t<!-- 작성자 -->\t\r\n");
      out.write("                            \t<span class=\"idSpan\" id=\"idSpan\" >작성자</span>\r\n");
      out.write("                                <span class=\"qnaModify\" id=\"qnaModify\">\r\n");
      out.write("                                    <input type=\"button\" id=\"qnaModify\" value=\"수정\" onclick=\"mode(1)\">\r\n");
      out.write("                                    <input type=\"button\" id=\"qnaDelete\"  value=\"삭제\" onclick=\"mode(2)\">\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <hr style=\"height:3px; border:0; margin:0px;\">\r\n");
      out.write("                    </div><!--header-->\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"qna_content\" style=\"white-space\">\r\n");
      out.write("                        <div class=\"qna_body_wrap\">\r\n");
      out.write("                        <div class=\"qna_body\" id=\"contentSpan\">\r\n");
      out.write("\t\t\t\t\t\t\t\t내용들어오는 곳\r\n");
      out.write("                        </div><!--qna_body-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- qna_content -->\r\n");
      out.write("                    <div class=\"view_wrap\">\r\n");
      out.write("                        <div class=\"viewOut\">\r\n");
      out.write("                        \t<hr style=\"background-color: lightgray;\">\r\n");
      out.write("                        \t<div class=\"viewOutSpan\">\r\n");
      out.write("                        \t<span class=\"qnaReply\">\r\n");
      out.write("                                    <input type=\"button\" id=\"qnaReply\" value=\"답글\" onclick=\"mode(3)\">\r\n");
      out.write("                             </span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"qnaList\">\r\n");
      out.write("                                    <input type=\"button\" id=\"qnaList\" value=\"목록\" onclick=\"location.href='/slime/qna/qnaBoardList.jsp'\">\r\n");
      out.write("                             </span>\r\n");
      out.write("                             </div><!--viewOutSpan-->\r\n");
      out.write("                         </div><!--viewOut-->\r\n");
      out.write("                     </div><!--view_wrap-->\r\n");
      out.write("                </div><!--qnaContent-->\r\n");
      out.write("            </div>\r\n");
      out.write("</div><!--modal -->\r\n");
      out.write("</section>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" function mode(num){\r\n");
      out.write("\tif(num==1){//글수정\r\n");
      out.write("\t\tdocument.qnaViewForm.method=\"post\";\r\n");
      out.write("\t\tdocument.qnaViewForm.action=\"qnaModifyForm\";//컨트롤러로\r\n");
      out.write("\t\tdocument.qnaViewForm.submit();\r\n");
      out.write("\t\r\n");
      out.write(" \t}else if(num==2){//글삭제\r\n");
      out.write("\t\tif(confirm(\"정말로 삭제하시겠습니까?\")){\r\n");
      out.write("\t\t\tdocument.qnaViewForm.method=\"post\";\r\n");
      out.write("\t\t\tdocument.qnaViewForm.action=\"qnaDeleteForm\";//얼럿이 떳을때 확인을 누르면 전송\r\n");
      out.write("\t\t\tdocument.qnaViewForm.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write(" \t\r\n");
      out.write(" \t}else if(num==3){//답글\r\n");
      out.write("\t\tdocument.qnaViewForm.method=\"post\";\r\n");
      out.write("\t\tdocument.qnaViewForm.action=\"qnaReplyForm\";\r\n");
      out.write("\t\tdocument.qnaViewForm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script> /* 여기의 스크립트가 같아서 이 두줄을 지우니까 글이 불러와지지 않았다. */\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\turl: '/slime/qna/getBoard',//이 주소로 데이터를 보낸다.-> 컨트롤러로 연결\r\n");
      out.write("\t\tdata: 'seq='+$('#seq').val(),\r\n");
      out.write("\t\tdataType : 'json',//컨트롤러에서 돌아오는 데이터는 json타입이다\r\n");
      out.write("\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t//alert(JSON.stringify(data));\r\n");
      out.write("\t\t\tconsole.log(\"여기는 qnaView\"+data);//이거는 f12번 눌러서의 console\r\n");
      out.write("\t\t\t$('#subjectSpan').text(data.qnaDTO.subject);\r\n");
      out.write("/* \t\t\t$('#seqSpan').text(data.boardDTO.seq); */\r\n");
      out.write("\t\t\t$('#idSpan').text(data.qnaDTO.member_id);\r\n");
      out.write("/* \t\t\t$('#hitSpan').text(data.boardDTO.hit); */\r\n");
      out.write("\t\t\t$('#contentSpan').text(data.qnaDTO.content);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(data.memId == data.qnaDTO.member_id)\r\n");
      out.write("\t\t\t\t$('#qnaModify').show();\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\t$('#qnaModify').hide();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function(err){\r\n");
      out.write("\t\t\tconsole.log(err);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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
