/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-15 02:31:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodsView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".contents {\r\n");
      out.write("    white-space: pre-line;\r\n");
      out.write("    word-break: break-all;\r\n");
      out.write("    width: 450px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".goods-item-box{\r\n");
      out.write("\tmargin-left: 20%;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tbottom: 130px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div class=\"goods-item-box\">\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"goodsViewForm\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"seq\" id=\"seq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"pg\" id=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<table id=\"goodsViewTable\" cellpadding=\"5\" frame=\"hsides\" rules=\"rows\">\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t        <td rowspan=\"4\">\r\n");
      out.write("\t\t            <img id=\"goods_image0\" width=\"200\" height=\"200\">\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t        <td rowspan=\"4\">\r\n");
      out.write("\t\t            <img id=\"goods_image1\" width=\"200\" height=\"200\">\r\n");
      out.write("\t\t        </td>\t\r\n");
      out.write("\t\t        <td width = \"250\">\r\n");
      out.write("\t\t        \t상품명: <span id=\"goods_titleSpan\"></span>\r\n");
      out.write("\t\t        \t<div id=\"goods_titleSpanDiv\" style=\"color: red; font-size:8pt; font-weigth:bold;\"></div>\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    <tr> \r\n");
      out.write("\t\t        <td width=\"250\">\r\n");
      out.write("\t\t\t\t\t정상가 : <span id=\"goods_priceSpan\"></span>\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t        <td width=\"250\">\r\n");
      out.write("\t\t\t\t\t세일가 : <span id=\"goods_sales_priceSpan\"></span>\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t        <td width=\"250\">\r\n");
      out.write("\t\t\t\t\t재고 : <span id=\"goods_qtySpan\"></span>\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t        <td colspan=\"3\" height=\"200\" valign=\"top\">\r\n");
      out.write("\t\t            <pre class=\"contents\"><span id=\"goods_contentSpan\"></span></pre>\r\n");
      out.write("\t\t            <div id=\"goods_contentSpanDiv\" style=\"color: red; font-size:8pt; font-weigth:bold;\"></div>\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input type=\"button\" value=\"목록\" onclick=\"location.href='goodsList?pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("\t\t<span id=\"goodsViewSpan\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"제품정보 수정\" onclick=\"mode(1)\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"제품정보 삭제\" onclick=\"mode(2)\">\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src= \"../js/goods.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function mode(num){\r\n");
      out.write("\tif(num==1){//제품정보 수정\r\n");
      out.write("\t\tdocument.goodsViewForm.method=\"post\";\r\n");
      out.write("\t\tdocument.goodsViewForm.action=\"goodsModifyForm\";\r\n");
      out.write("\t\tdocument.goodsViewForm.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else if(num==2){//제품정보 삭제\r\n");
      out.write("\t\tif(confirm(\"정말로 삭제하시겠습니까?\")){\r\n");
      out.write("\t\t\tdocument.goodsViewForm.method=\"post\";\r\n");
      out.write("\t\t\tdocument.goodsViewForm.action=\"goodsViewDeleteForm\";\r\n");
      out.write("\t\t\tdocument.goodsViewForm.submit();\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}//mode\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\turl: '/slime/goods/getGoodsView',\r\n");
      out.write("\t\tdata: 'seq=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("\t\tdataType: 'json',\r\n");
      out.write("\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t//console.log(data);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tlet total = data.goodsDTO.goods_price * data.goodsDTO.goods_qty;\r\n");
      out.write("\t\t\t$('#goods_image0').attr('src', '../storage/'+data.goodsDTO.goods_image0);\r\n");
      out.write("\t\t\t$('#goods_image1').attr('src', '../storage/'+data.goodsDTO.goods_image1);\r\n");
      out.write("\t\t\t$('#goods_image2').attr('src', '../storage/'+data.goodsDTO.goods_image2);\r\n");
      out.write("\t\t\t$('#goods_image3').attr('src', '../storage/'+data.goodsDTO.goods_image3);\r\n");
      out.write("\t\t\t$('#goods_titleSpan').text(data.goodsDTO.goods_title);\t\t\t\r\n");
      out.write("\t\t\t$('#goods_priceSpan').text(data.goodsDTO.goods_price.toLocaleString());\r\n");
      out.write("\t\t\t$('#goods_sales_priceSpan').text(data.goodsDTO.goods_sales_price.toLocaleString());\r\n");
      out.write("\t\t\t$('#goods_qtySpan').text(data.goodsDTO.goods_qty);\r\n");
      out.write("\t\t\t$('#totalSpan').text(total.toLocaleString());\r\n");
      out.write("\t\t\t$('#goods_contentSpan').text(data.goodsDTO.goods_content);\r\n");
      out.write("\t\t\t\r\n");
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
}
