package _02.servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
		
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		resp.getWriter().print(name+ "<br>");
		resp.getWriter().print(password+ "<br>");
		
		String servletName = config.getServletName();
		resp.getWriter().print(servletName + "<br>");
		Enumeration <String> names = config.getInitParameterNames();
		resp.getWriter().print(names+ "<br>");
		
		
		
	}

}
