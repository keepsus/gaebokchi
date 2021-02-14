package etc;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class OrderOrigin implements Filter{
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
			throws IOException, ServletException 
	{ 
		HttpServletResponse response = (HttpServletResponse) res; 
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.setHeader("Access-Control-Allow-Origin", "*");


		chain.doFilter(req, res); 
	}
	public void init(FilterConfig filterConfig) {} 
	public void destroy() {}




}




//<!-- CORS setting -->
//<filter>
//<filter-name>filterName</filter-name> 
//<filter-class>etc.OrderOrigin</filter-class> 
//</filter>
//<filter-mapping> 
//<filter-name>filterName</filter-name> 
//<url-pattern>https://kapi.kakao.com</url-pattern>  <!-- 필터가 적용될 대상: url 패턴-->
//</filter-mapping>