/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-14 08:22:39 UTC
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/SlimeProject2/gaebokchi/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uzuslime/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1609668270889L));
    _jspx_dependants.put("jar:file:/D:/SlimeProject2/gaebokchi/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uzuslime/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\r\n");
      out.write("\t\t\t<a href=\"/slime/index.jsp\"><img src=\"/slime/image/logo.jpg\" alt=\"slime logo\" class=\"logo\"></a>           \r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("<form name=\"qnaViewForm\">\r\n");
      out.write("<section id=\"qnaViewSection\">\r\n");
      out.write("<input type=\"hidden\" name=\"seq\" id=\"seq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"pg\" id=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
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
      out.write("                            \t<!-- 작성자 -->\t\r\n");
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
      out.write("                                    <input type=\"button\" id=\"qnaList\" value=\"목록\" onclick=\"location.href='/slime/qna/qnaBoardList'\">\r\n");
      out.write("                             </span>\r\n");
      out.write("                             \r\n");
      out.write("                             </div><!--viewOutSpan-->\r\n");
      out.write("                         </div><!--viewOut-->\r\n");
      out.write("                     </div><!--view_wrap-->\r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                </div><!--qnaContent-->\r\n");
      out.write("            </div>\r\n");
      out.write("</div><!--modal -->          \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write(" <div class=\"reply\"><!--댓글 내용 보이는 부분-->\r\n");
      out.write("\t <div class=\"replyWrite\">\r\n");
      out.write("\t                     \t<div class=\"writer_reply\">\r\n");
      out.write("\t                     \t\t<input type=\"text\" class=\"writer_reply\" id=\"writer_reply\" name=\"writer\" placeholder=\"작성자 아이디\" style=\"width=30px;\"><br/>\r\n");
      out.write("\t                     \t\t<input type=\"text\" class=\"content_reply\" id=\"content_reply\" name=\"content\" placeholder=\"댓글 내용\">\r\n");
      out.write("\t                     \t</div><!--writer_reply-->\r\n");
      out.write("\t                     \t<div id=\"buttons\">\r\n");
      out.write(" \t \t\t\t\t\t\t\t<button type=\"reset\" class=\"replyresetBtn\">취소</button>\r\n");
      out.write(" \t \t\t\t\t\t\t\t<button type=\"button\" class=\"replyWriteBtn\" onclick=\"mode(4)\">댓글 남기기</button>\r\n");
      out.write("  \t\t\t\t\t\t\t</div>\r\n");
      out.write("\t</div><!--replyWrite -->\r\n");
      out.write("\t                 \t<ul class=\"replyList\" style=\"list-style:none;\">\r\n");
      out.write("                 \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                 \t</ul>\r\n");
      out.write("</div><!--reply-->\r\n");
      out.write("</section><!--qnaViewSection-->\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" function mode(num){\r\n");
      out.write("\tif(num==1){//글수정\r\n");
      out.write("\t\tdocument.qnaViewForm.method=\"post\";\r\n");
      out.write("\t\tdocument.qnaViewForm.action=\"qnaModifyForm\";//컨트롤러로\r\n");
      out.write("\t\tdocument.qnaViewForm.submit();//seq랑 pg들구가는 거\r\n");
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
      out.write("\t}else if(num==4){//댓글\r\n");
      out.write("\t\tdocument.qnaViewForm.method=\"post\";\r\n");
      out.write("\t\tdocument.qnaViewForm.action=\"replyWrite\";\r\n");
      out.write("\t\tdocument.qnaViewForm.submit();\r\n");
      out.write("\t\t/*여기서 */\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\turl: '/slime/qna/getBoard',//이 주소로 데이터를 보낸다.-> 컨트롤러로 연결\r\n");
      out.write("\t\tdata: 'seq='+$('#seq').val(),\r\n");
      out.write("\t\tdataType : 'json',//컨트롤러에서 돌아오는 데이터는 json타입이다\r\n");
      out.write("\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t//alert(JSON.stringify(data));\r\n");
      out.write("\t\t\t//console.log(\"여기는 qnaView\"+data);//이거는 f12번 눌러서의 console\r\n");
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
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /qna/qnaView.jsp(98,19) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/qna/qnaView.jsp(98,19) '${replyList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${replyList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /qna/qnaView.jsp(98,19) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("replyList");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                 \t\t\t<li>\r\n");
            out.write("    \t\t\t\t\t\t\t<hr style=\"margin-top:12px; margin-bottom:10px;\">\r\n");
            out.write("    \t\t\t\t\t\t\t\t<span class=\"replyWriter\"> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyList.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("    \t\t\t\t\t\t\t\t<span class=\"replyDate\">");
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("    \t\t\t\t\t\t\t\t</span>\r\n");
            out.write("    \t\t\t\t\t\t\t\t<div class=\"replyContent\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyList.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("  \t\t\t\t\t\t\t</li>\r\n");
            out.write("                 \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /qna/qnaView.jsp(102,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyList.regdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /qna/qnaView.jsp(102,36) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }
}
