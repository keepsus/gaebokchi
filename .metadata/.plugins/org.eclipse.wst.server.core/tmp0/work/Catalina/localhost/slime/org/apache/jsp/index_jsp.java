/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2021-02-09 11:15:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/SlimeProject2/gaebokchi/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uzuslime/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1609668270889L));
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/grid.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/normalize.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/slime/css/index.css\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css\" /><!---->\r\n");
      out.write("<title>우주슬라임</title>   \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!--------HAEDER-------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<header>\r\n");
      out.write("\t<nav id=\"nav\">       \t\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "indexNav.jsp", out, false);
      out.write("           \r\n");
      out.write("\t\t<a href=\"/slime/index.jsp\"><img src=\"/slime/image/logo.jpg\" alt=\"slime logo\" class=\"logo\"></a>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</header>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--------------------------->\r\n");
      out.write("<!--------SIDEBAR-MENU------->\r\n");
      out.write("<!--------------------------->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sideMenu.jsp", out, false);
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!-------SECTION------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<section class=\"section-features1\">\r\n");
      out.write("    <div class=\"hero-text-box\">\r\n");
      out.write("        <h1>enjoy staying at home <br>with slime</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!-------SECTION2------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<section class=\"section-features2\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!------------------->\r\n");
      out.write("\t<!-- 제품뿌려주는 위치 -->\r\n");
      out.write("    <div class=\"row\">    \r\n");
      out.write("    \t<div id=\"goodsIndexList\" sytle align=\"center\">\t\r\n");
      out.write("\t</div>\t \t\r\n");
      out.write("\t<!-- 제품뿌려주는 위치 -->\r\n");
      out.write("\t<!------------------->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<p class=\"md-choice\"><strong>MD추천</strong></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"md-wrap\">\r\n");
      out.write("       <div class=\"md-item-wrapper\">\r\n");
      out.write("           <a href=\"/slime/detailpage/detailPage.jsp\">\r\n");
      out.write("               <div>\r\n");
      out.write("                   <img src=\"/slime/image/img1.jpg\" alt=\"img1\" class=\"md-item-img\">\r\n");
      out.write("               </div>\r\n");
      out.write("           </a>\r\n");
      out.write("           <a href=\"/slime/detailpage/detailPage.jsp\">\r\n");
      out.write("               <div>\r\n");
      out.write("                   <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2> <!--데이터-->\r\n");
      out.write("                   <div class=\"item-price\">\r\n");
      out.write("                       <p class=\"sale-price\">세일가</p><!--데이터-->\r\n");
      out.write("                       <p class=\"normal-price\">정상가</p><!--데이터-->\r\n");
      out.write("                   </div>\r\n");
      out.write("                   <div>\r\n");
      out.write("                       <div class=\"sale-icon\">sale</div><!--데이터-->\r\n");
      out.write("                       <div class=\"md-icon\">md</div><!--데이터-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"md-item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img2.jpg\" alt=\"img2\" class=\"md-item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"md-item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img3.jpg\" alt=\"img3\" class=\"md-item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"md-item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img4.jpg\" alt=\"img4\" class=\"md-item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>    \r\n");
      out.write("    \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!-------SECTION3------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<section>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <p class=\"icon\"><ion-icon name=\"planet-outline\"></ion-icon></p>\r\n");
      out.write("        <p class=\"icon-text\">Handmade Slime</p>\r\n");
      out.write("        <p class=\"dash\">&mdash;</p>\r\n");
      out.write("        <p class=\"product\">product</p>\r\n");
      out.write("        <p class=\"product-text\">\r\n");
      out.write("            슬라임은 감촉과 소리를 통해 스트레스를 해소하고, 정서적 안정에 도움을 주는 제품입니다. \r\n");
      out.write("            <br>본 제품은 Hand•Made 제품이며, 인체에 무해한 재료로 만들었습니다.\r\n");
      out.write("        </p>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!-------SECTION4------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<section>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <p class=\"md-choice\"><strong>크리스탈 슬라임</strong></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img4.jpg\" alt=\"img4\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2><!--데이터-->\r\n");
      out.write("               <div class=\"item-price\">\r\n");
      out.write("                   <p class=\"sale-price\">세일가</p><!--데이터-->\r\n");
      out.write("                   <p class=\"normal-price\">정상가</p><!--데이터-->\r\n");
      out.write("               </div>\r\n");
      out.write("               <div>\r\n");
      out.write("                   <div class=\"sale-icon\">sale</div><!--데이터-->\r\n");
      out.write("                   <div class=\"md-icon\">md</div><!--데이터-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img5.jpg\" alt=\"img5\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img6.jpg\" alt=\"img6\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!-- class=\"wrap\" -->  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img7.jpg\" alt=\"img7\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img8.jpg\" alt=\"img8\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img9.jpg\" alt=\"img9\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!-- class=\"wrap\" -->  \r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img10.jpg\" alt=\"img10\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img11.jpg\" alt=\"img11\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img12.jpg\" alt=\"img12\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!-- class=\"wrap\" --> \r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img13.jpg\" alt=\"img13\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img14.jpg\" alt=\"img14\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item-wrapper\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <img src=\"/slime/image/img15.jpg\" alt=\"img15\" class=\"item-img\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h2 class=\"item-title\">[크리스탈 슬라임]&nbsp;네온시드</h2>\r\n");
      out.write("                <div class=\"item-price\">\r\n");
      out.write("                    <p class=\"sale-price\">세일가</p>\r\n");
      out.write("                    <p class=\"normal-price\">정상가</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"sale-icon\">sale</div>\r\n");
      out.write("                    <div class=\"md-icon\">md</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><!-- class=\"wrap\" --> \r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!-------SECTION5------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<section>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"produce-item\">\r\n");
      out.write("            <p class=\"produce-text1\"><ion-icon name=\"rocket-outline\"></ion-icon></p>\r\n");
      out.write("            <p class=\"produce-text2\">이런 재료로 만들어져요.</p>\r\n");
      out.write("            <p class=\"produce-text3\">엘머스스쿨글루, 엘머스글루올, 아모스물풀, 종이나라 착풀을 사용하여 제작합니다.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("            <img src=\"/slime/image/produce.jpg\" alt=\"produce\" class=\"produce-img\">\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<!-------SECTION6------->\r\n");
      out.write("<!---------------------->\r\n");
      out.write("<section class=\"section-row\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col span-1-of-3\">\r\n");
      out.write("            <h4>고객센터</h4>\r\n");
      out.write("            <p>전화문의 070.4352.0860<br>\r\n");
      out.write("                평일 오전 10시 - 오후 6시<br>\r\n");
      out.write("                주말 & 공휴일 휴무</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col span-1-of-3\">\r\n");
      out.write("            <h4>1:1 문의</h4>\r\n");
      out.write("            <p>궁금한 점이 있으면 문의주세요.<br>\r\n");
      out.write("                친철히 답변해 드리고 있습니다.<br>\r\n");
      out.write("                1:1 문의 게시판을 이용해주세요.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col span-1-of-3\">\r\n");
      out.write("            <h4>배송정보</h4>\r\n");
      out.write("            <p>50,000원 이상 무료배송<br>\r\n");
      out.write("                오후 1시까지 주문 건 당일배송</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--footer-->\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col span-1-of-4\">\r\n");
      out.write("            <ul class=\"footer-nav\">\r\n");
      out.write("                <h3><strong>우주슬라임</strong></h3>\r\n");
      out.write("                <p>상호명 : 핌크리에이티브</p>\r\n");
      out.write("                <p>대표자 : 신동환</p>\r\n");
      out.write("                <p>사업자등록번호 : 105-88-00230</p>\r\n");
      out.write("                <p>서울시 강남구 테헤란로83길 18,<br> 매직킹덤빌딩 10층</p>\r\n");
      out.write("                <p>통신파매업 제2015-서울강남-03630호</p>\r\n");
      out.write("                <p>사업자 정보확인</p>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col span-1-of-4\">\r\n");
      out.write("            <div class=\"footer-nav\">\r\n");
      out.write("                <h3><strong>무통장입금</strong></h3>\r\n");
      out.write("                <p>137-090127-01-022</p>\r\n");
      out.write("                <p>기업은행</p>\r\n");
      out.write("                <p>(주)핌크리에이티브</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col span-1-of-4\">\r\n");
      out.write("            <div class=\"footer-nav\">\r\n");
      out.write("                <h3><strong>고객센터</strong></h3>\r\n");
      out.write("                <p>010-2104-2264</p>\r\n");
      out.write("                <p>카카오톡 : uzuslime</p>\r\n");
      out.write("                <p>월요일 - 금요일 AM 10:00 - 19:00</p>\r\n");
      out.write("                <p>문의 : uzuslime@naver.com<br><br></p>\r\n");
      out.write("                <p>[반품/교환지 주소]</p>\r\n");
      out.write("                <p>경기도 김포시 양촌읍 학운리 3342</p>\r\n");
      out.write("                <p>(주)철저한 물류. 우주슬라임</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col span-1-of-4\">\r\n");
      out.write("            <div class=\"social-links\">\r\n");
      out.write("                <li><a href=\"https://www.facebook.com/uzuslime\"><ion-icon class=\"ion-social-facebook\" name=\"logo-facebook\"></ion-icon></a></li>\r\n");
      out.write("                <li><a href=\"https://twitter.com/?lang=ko\"><ion-icon class=\"ion-social-twitter\" name=\"logo-twitter\"></ion-icon></a></li>\r\n");
      out.write("                <li><a href=\"https://www.instagram.com/uzuslime/\"><ion-icon class=\"ion-social-googleplus\" name=\"logo-google\"></ion-icon></a></li>\r\n");
      out.write("                <li><a href=\"https://www.instagram.com/uzuslime/\"><ion-icon class=\"ion-social-instagram\" name=\"logo-instagram\"></ion-icon></a></li>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row \" id=\"row\">\r\n");
      out.write("        <p>\r\n");
      out.write("            copyright 2018. <strong>우주슬라임</strong> All rights reserved\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>\r\n");
      out.write("            이용약관 <i class=\"ion-ios-heart\" style=\"color: #ea0000; padding: 0 3px;\"></i> 개인정보처리방침\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js\"></script><!---->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script><!---->\r\n");
      out.write("<script src=\"https://unpkg.com/ionicons@5.2.3/dist/ionicons.js\"> </script>\r\n");
      out.write("\r\n");
      out.write("<script type = \"text/javascript\">//index.jsp 에 goodsList 뿌려주는 소스\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\turl: '/slime/goods/getGoodsIndexList',\r\n");
      out.write("\t\tdataType: 'json',\r\n");
      out.write("\t\tsuccess: function(data){\t\t\t\r\n");
      out.write("\t\t\t//alert(JSON.stringify(data)); \r\n");
      out.write(" \t\t\t//console.log(data); \t\t\t\r\n");
      out.write(" \t\t\t$.each(data.list, function(index, items){\r\n");
      out.write(" \t\t\t\t$('<div/>').append($('<img/>',{\r\n");
      out.write(" \t\t\t\t\tsrc: '/slime/storage/'+items.goods_image0,\r\n");
      out.write(" \t\t\t\t\tstyle: 'width: 300px; height: 300px; cursor: pointer;',\r\n");
      out.write(" \t\t\t\t\tclass: items.seq+''\r\n");
      out.write(" \t\t\t\t\t\r\n");
      out.write(" \t\t\t\t})).append($('<td/>',{\r\n");
      out.write(" \t\t\t\t\talign: 'center',\r\n");
      out.write(" \t\t\t\t\ttext: items.goods_title\r\n");
      out.write(" \t\t\t\t\t\r\n");
      out.write(" \t\t\t\t})).append($('<span/>',{\r\n");
      out.write(" \t\t\t\t\talign: 'center',\r\n");
      out.write("\t\t\t\t\ttext: items.goods_sales_price\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write(" \t\t\t\t})).append($('<span/>',{\r\n");
      out.write(" \t \t\t\t\talign: 'center',\r\n");
      out.write(" \t\t\t\t\ttext: items.goods_price\r\n");
      out.write(" \t\t\t\t\t\t\r\n");
      out.write(" \t \t\t\t})).append($('<span/>',{\r\n");
      out.write(" \t \t\t\t\talign: 'center',\r\n");
      out.write(" \t\t\t\t\ttext: items.goods_sales_yn \t\t\t\t\t \t \t\t\t\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t \t\t\t})).append($('<span/>',{\r\n");
      out.write(" \t \t\t\t\talign: 'center',\r\n");
      out.write(" \t\t\t\t\ttext: items.goods_md_yn\r\n");
      out.write(" \t\t\t\t\t \t\t\t\t\t\r\n");
      out.write(" \t \t\t\t})).append($('<span/>',{\r\n");
      out.write(" \t \t\t\t\talign: 'center',\r\n");
      out.write(" \t\t\t\t\ttext: items.goods_hot_yn\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t \t\t\t})).append($('<span/>',{\r\n");
      out.write(" \t \t\t\t\talign: 'center',\r\n");
      out.write(" \t\t\t\t\ttext: items.goods_soldout_yn\r\n");
      out.write(" \t\t\t\t\t \t\t\t\t\t\t\r\n");
      out.write(" \t \t\t\t})).appendTo($('#goodsIndexList'));\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write(" \t\t\t\t//이미지 보기\r\n");
      out.write("\t\t\t\t$('.'+items.seq).click(function(){\r\n");
      out.write("\t\t\t\t\tlocation.href=\"/slime/goods/goodsIndexView?seq=\"+items.seq+\"&pg=\"+data.pg;\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t\t\t});//each\r\n");
      out.write(" \t\t\t\r\n");
      out.write("\t\t},//success\r\n");
      out.write("\t\terror: function(err){\r\n");
      out.write("\t\t\tconsole.log(err);\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});//ajax\r\n");
      out.write("});//ready\r\n");
      out.write("\r\n");
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
