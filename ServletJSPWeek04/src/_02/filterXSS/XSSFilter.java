//dýþarýdan veri giriþi oldugunda bunu güvenli bir þekilde gerçekleþtirmek(xss saldýrýlarýndan korunmak) için
//projeye filtreleme uyguluyoruz.

//XSSFilter tanýmladýktan sonra XSSRequestWrapper tanýmlandý


package _02.filterXSS;



import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

@WebFilter("/*")       //gelen tüm istekler anlamýna gelir.
public class XSSFilter implements javax.servlet.Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("XSSFilter##doFilter");
		chain.doFilter(new XSSRequestWrapper((HttpServletRequest)request), response);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
