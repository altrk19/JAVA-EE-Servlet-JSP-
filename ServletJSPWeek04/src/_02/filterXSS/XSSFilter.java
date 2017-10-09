//d��ar�dan veri giri�i oldugunda bunu g�venli bir �ekilde ger�ekle�tirmek(xss sald�r�lar�ndan korunmak) i�in
//projeye filtreleme uyguluyoruz.

//XSSFilter tan�mlad�ktan sonra XSSRequestWrapper tan�mland�


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

@WebFilter("/*")       //gelen t�m istekler anlam�na gelir.
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
