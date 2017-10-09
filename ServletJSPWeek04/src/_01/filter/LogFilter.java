//uygulama form.html sayfas�ndan �al��t�r�lmaya ba�lan�r
//bilgiler girildikten sonra submit butonu action olarak /login linkini a�ar ve loginServlet'in �al��t�r�lmas�n� tetikler.
//loginServlet servleti �al��t�r�lmadan �nce filtreleme i�lemi uygulan�r ki�inin IP adresi konsola yaz�l�r ve sonras�nda servlet �al��t�r�l�r.


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
