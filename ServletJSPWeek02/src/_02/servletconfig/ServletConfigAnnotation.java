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
		// ServletConfig config = getServletConfig(); yazýldýktan sonra 
		//config.getInýtParameter("role"); ile yukarýdaki kod ayný.
	
		//getInýtParameter() metoduyla @WebInitParam içerisindeki value deðerine ulaþýrýz.
		//@WebInitParam(name="",value="") taslaðýnda olmalýdýr. name ve value etiketleri olmalýdýr.
		resp.getWriter().println(role);
	}
}
