/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-10 06:54:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodsIndexView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/grid.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/normalize.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/index.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/myPageOrder.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css\" />\r\n");
      out.write("<title>우주슬라임-제품상세 페이지</title>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!--------HAEDER-------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<header>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div class=\"row\">       \t\t\t\r\n");
      out.write("\t\t\t<a href=\"../index.jsp\"><img src=\"/slime/image/logo.jpg\" alt=\"slime logo\" class=\"logo\"></a>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../indexNav.jsp", out, false);
      out.write("           \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\t\r\n");
      out.write("</header>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--------------------------->\r\n");
      out.write("<!--------SIDEBAR-MENU------->\r\n");
      out.write("<!--------------------------->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../sideMenu.jsp", out, false);
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- SECTION -->\r\n");
      out.write("<section>\r\n");
      out.write("<form name=\"goodsIndexViewForm\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<img id=\"goods_image0\" width=\"200\" height=\"200\">\r\n");
      out.write("\t\t\t<img id=\"goods_image1\" width=\"200\" height=\"200\"> \t\r\n");
      out.write("\t\t</div>   \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"section\">\r\n");
      out.write("\t\t\t상품명: <span id=\"goods_titleSpan\"></span><br>\r\n");
      out.write("\t\t\t제품가격 : <span id=\"goods_priceSpan\"></span>\r\n");
      out.write("\t\t\t할인가격 : <span id=\"goods_sales_priceSpan\"></span><br>\r\n");
      out.write("\t\t\t<span id=\"goods_contentSpan\"></span>\r\n");
      out.write("\t\t\t원산지 : <span id=\"goods_countrySpan\"></span><br>\r\n");
      out.write("\t\t\t적립포인트 : <span id=\"goods_pointSpan\"></span><br>\r\n");
      out.write("\t\t\t배송비 : <span id=\"goods_deli_priceSpan\"></span>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<input type=\"button\" value=\"목록\" onclick=\"location.href='goodsIndexList?pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"detailInformation\">\r\n");
      out.write("\t\t\t<img id=\"goods_image2\" alt=\"s01e 제품상세 설명\">\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER -->\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <ul class=\"social-links\">\r\n");
      out.write("            <li><a href=\"#\"><ion-icon class=\"ion-social-facebook\" name=\"logo-facebook\"></ion-icon></a></li>\r\n");
      out.write("            <li><a href=\"#\"><ion-icon class=\"ion-social-twitter\" name=\"logo-twitter\"></ion-icon></a></li>\r\n");
      out.write("            <li><a href=\"#\"><ion-icon class=\"ion-social-googleplus\" name=\"logo-google\"></ion-icon></a></li>\r\n");
      out.write("            <li><a href=\"#\"><ion-icon class=\"ion-social-instagram\" name=\"logo-instagram\"></ion-icon></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <p>\r\n");
      out.write("            copyright 2018. <strong>우주슬라임</strong> All rights reserved\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            <strong>이용약관</strong>\r\n");
      out.write("            <strong>개인정보처리방침</strong>\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- side menu 모달창으로 쓰려면 필요 -->\r\n");
      out.write("<script>\r\n");
      out.write("function openNav() {\r\n");
      out.write("\tdocument.getElementById('mySideNav').style.width = '250px';\r\n");
      out.write("}\r\n");
      out.write("function closeNav() {\r\n");
      out.write("\tdocument.getElementById('mySideNav').style.width = '0';\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js\"></script><!---->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script><!---->\r\n");
      out.write("<script src=\"https://unpkg.com/ionicons@5.2.3/dist/ionicons.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\turl: '/slime/goods/getGoodsView',\r\n");
      out.write("\t\tdata: 'seq=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("\t\tdataType: 'json',\r\n");
      out.write("\t\tsuccess: function(data){\t\t\t\r\n");
      out.write("\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t$('#goods_image0').attr('src', '../storage/'+data.goodsDTO.goods_image0);\r\n");
      out.write("\t\t\t$('#goods_image1').attr('src', '../storage/'+data.goodsDTO.goods_image1);\r\n");
      out.write("\t\t\t$('#goods_image2').attr('src', '../storage/'+data.goodsDTO.goods_image2);\r\n");
      out.write("\t\t\t$('#goods_titleSpan').text(data.goodsDTO.goods_title);\t\t\t\r\n");
      out.write("\t\t\t$('#goods_priceSpan').text(data.goodsDTO.goods_price.toLocaleString());\r\n");
      out.write("\t\t\t$('#goods_sales_priceSpan').text(data.goodsDTO.goods_sales_price.toLocaleString());\r\n");
      out.write("\t\t\t$('#goods_contentSpan').text(data.goodsDTO.goods_content);\r\n");
      out.write("\t\t\t$('#goods_countrySpan').text(data.goodsDTO.goods_country);\r\n");
      out.write("\t\t\t$('#goods_pointSpan').text(data.goodsDTO.goods_point);\r\n");
      out.write("\t\t\t$('#goods_deli_priceSpan').text(data.goodsDTO.goods_deli_price);\r\n");
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
