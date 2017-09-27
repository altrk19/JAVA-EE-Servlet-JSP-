package _02.servletconfig;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/configAnnotation",initParams=@WebInitParam(name="role",value="admin"))
public class ServletConfigAnnotation extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String role = getServletConfig().getInitParameter("role");
		// ServletConfig config = getServletConfig(); yaz�ld�ktan sonra 
		//config.getIn�tParameter("role"); ile yukar�daki kod ayn�.
	
		//getIn�tParameter() metoduyla @WebInitParam i�erisindeki value de�erine ula��r�z.
		//@WebInitParam(name="",value="") tasla��nda olmal�d�r. name ve value etiketleri olmal�d�r.
		resp.getWriter().println(role);
	}
}
