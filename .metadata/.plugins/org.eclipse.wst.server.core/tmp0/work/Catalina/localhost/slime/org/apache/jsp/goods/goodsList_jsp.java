/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-15 01:53:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodsList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/work/main/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uzuslime/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1609398789872L));
    _jspx_dependants.put("jar:file:/D:/work/main/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uzuslime/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\t\r\n");
      out.write("\t#currentPaging{\r\n");
      out.write("\t\tcolor:red;\r\n");
      out.write("\t\ttext-decoration: underline;\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\t#paging{\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.table-box{\r\n");
      out.write("\t\tmargin-top: 5%;\r\n");
      out.write("\t\tmargin-left: 19%;\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\tbottom: 190px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.table-sub-box{\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\tbottom: 100px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write(" \t#goodsPagingDiv{\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t\tmargin-left: 25%;\r\n");
      out.write("\t\tmargin-top: 3%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<form id=\"goodsListForm\" method=\"get\" action=\"goodsCheckDelete\">\r\n");
      out.write("\t<div class=\"table-box\">\r\n");
      out.write("\t\t<table id=\"goodsListMypageTable\" border=\"1\" frame=\"hsides\" rules=\"rows\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"100\"><input type=\"checkbox\" id=\"all\">번호</th>\r\n");
      out.write("\t\t\t\t<th width=\"150\">이미지</th>\r\n");
      out.write("\t\t\t\t<th width=\"150\">상품명</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\">정상가</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\">세일가</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\">재고</th>\t\t\r\n");
      out.write("\t\t\t</tr>\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"table-sub-box\">\r\n");
      out.write("\t\t<div style=\"margin-left: 52%; width: 90px;\"> \r\n");
      out.write("\t\t\t<input type=\"button\" value=\"선택삭제\" id=\"choiceDeleteBtn\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 페이징 처리 -->\r\n");
      out.write("\t\t<div id=\"goodsPagingDiv\" style=\"float: left; width: 700px; text-align: center;\"></div> \r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\turl: '/slime/goods/getGoodsList',\r\n");
      out.write("\t\tdata: 'pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\t//컨트롤러에서 보내온 pg 값을 바로 받는다.\t//id 속성 : $('#id').val() or $('.id').val() //컨트롤러 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\tdataType: 'json',\r\n");
      out.write("\t\tsuccess: function(data){\t\t\t\r\n");
      out.write("\t\t\t//console.log(data);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.each(data.list, function(index, items){\r\n");
      out.write("\t\t\t\t$('<tr/>').append($('<td/>',{\r\n");
      out.write("\t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\ttext: items.seq\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}).prepend($('<input/>', {\t//checkbox 추가\r\n");
      out.write("\t\t\t\t\t\ttype: 'checkbox',\r\n");
      out.write("\t\t\t\t\t\tname: 'check',\r\n");
      out.write("\t\t\t\t\t\tvalue: items.seq\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}))\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t).append($('<td/>',{\r\n");
      out.write("\t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\t//text: items.image1 //table 에 img 띄었으면 필요없음\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}).append($('<img/>',{\r\n");
      out.write("\t\t\t\t\t\tsrc: '/slime/storage/'+items.goods_image0,\r\n");
      out.write("\t\t\t\t\t\tstyle: 'width: 100px; height: 100px; cursor: pointer;',\r\n");
      out.write("\t\t\t\t\t\tclass: items.seq+''\r\n");
      out.write("\t\t\t\t\t}))\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t).append($('<td/>',{\r\n");
      out.write("\t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\ttext: items.goods_title\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})).append($('<td/>',{\r\n");
      out.write("\t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\ttext: items.goods_price.toLocaleString()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})).append($('<td/>',{\r\n");
      out.write("\t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\ttext: (items.goods_sales_price).toLocaleString()\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})).append($('<td/>',{\r\n");
      out.write("\t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\ttext: items.goods_qty\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})).appendTo($('#goodsListMypageTable'));\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//이미지 보기\r\n");
      out.write("\t\t\t\t$('.'+items.seq).click(function(){\r\n");
      out.write("\t\t\t\t\tlocation.href=\"/slime/goods/goodsView?seq=\"+items.seq+\"&pg=\"+data.pg;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});//each\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//페이징 처리 \r\n");
      out.write("\t\t\t$('#goodsPagingDiv').html(data.goodsPaging.pagingHTML);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},//success\r\n");
      out.write("\t\terror: function(err){\r\n");
      out.write("\t\t\tconsole.log(err);\r\n");
      out.write("\t\t}//error\r\n");
      out.write("\t\t\r\n");
      out.write("\t});//ajax\r\n");
      out.write("});//ready\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//연결부분~~~~~~\r\n");
      out.write("\r\n");
      out.write("function goodsPaging(pg){\t\t\t\r\n");
      out.write("\tlocation.href=\"goodsList?pg=\"+pg;\t//.do 만 삭제\t\r\n");
      out.write("}\t\r\n");
      out.write("\r\n");
      out.write("//전체선택 또는 해제\r\n");
      out.write("$('#all').click(function(){\r\n");
      out.write("\t//$('#all').attr('checked'));\t//undefine, checked=\"checked\" 같이 checked 라는 속성이 없음\r\n");
      out.write("\t//$('#all').prop('checked'));\t//true or false\t\r\n");
      out.write("\t/*\r\n");
      out.write("\tif($('#all').attr : attr 사용하면 아니됨\r\n");
      out.write("\t아래 2개 모두 tag 안에 있는 속성을 가져오는 것\r\n");
      out.write("\t.attr() : 문자열로 가져옴!\r\n");
      out.write("\t.prop() : 자바스크립트 값을 가져옴!\r\n");
      out.write("\t*/\r\n");
      out.write("\tif($('#all').prop('checked'))\t//miniproject 와 달리 for문이 필요가 없다.\r\n");
      out.write("\t\t$('input[name=check]').prop('checked', true);\t//true 라는 이름의 속성을 주라는 뜻!\t\t\r\n");
      out.write("\telse\r\n");
      out.write("\t\t$('input[name=check]').prop('checked', false);\t\t\t\r\n");
      out.write("});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("//선택 삭제\r\n");
      out.write("$('#choiceDeleteBtn').click(function(){\r\n");
      out.write("\tlet count = $('input[name=check]:checked').length;\t//table:gt(0) 하는거랑 같은 개념이다.\r\n");
      out.write("\t\r\n");
      out.write("\tif(count == 0)\r\n");
      out.write("\t\talert('먼저 삭제할 항목을 선택하세요!')\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tif(confirm('정말로 삭제하시겠습니까?')){\r\n");
      out.write("\t\t\t$('#goodsListForm').submit();\t//get방식! -> ImageboardController.java 로 가서 코드 작성하자!\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function choiceDelete(){\r\n");
      out.write("\tlet check = document.getElementsByName(\"check\");\r\n");
      out.write("\tlet count = 0;\r\n");
      out.write("\t\r\n");
      out.write("\tfor(var i=0; i<check.length; i++){\r\n");
      out.write("\t\tif(check[i].checked) count++; \r\n");
      out.write("\t}//for\r\n");
      out.write("\t\r\n");
      out.write("\tconsole.log(\"count = \"+count);\r\n");
      out.write("\t\r\n");
      out.write("\tif(count ==0)\r\n");
      out.write("\t\talert(\"삭제할 항목을 선택하세요.\")\r\n");
      out.write("\telse\r\n");
      out.write("\t\tif(confirm(\"정말로 삭제 하시겠습니까?\"))\r\n");
      out.write("\t\t\tdocument.goodsListForm.submit();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}