//uygulama form.html sayfasýndan çalýþtýrýlmaya baþlanýr
//bilgiler girildikten sonra submit butonu action olarak /login linkini açar ve loginServlet'in çalýþtýrýlmasýný tetikler.
//loginServlet servleti çalýþtýrýlmadan önce filtreleme iþlemi uygulanýr kiþinin IP adresi konsola yazýlýr ve sonrasýnda servlet çalýþtýrýlýr.


package _01.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		String Ip=req.getRemoteAddr();
		System.out.println("IP : "+Ip);
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
