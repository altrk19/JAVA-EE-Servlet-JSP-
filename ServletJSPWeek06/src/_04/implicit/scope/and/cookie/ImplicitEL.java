//Ayný isimde requestAttribute sessionAttribute contextAttribute olursa hangisi çalýþacaktýr?

package _04.implicit.scope.and.cookie;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _01.expression.language.Employee;

@WebServlet("/elImplicit")
public class ImplicitEL extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Employee reqEmployee=new Employee();
		reqEmployee.setName("request scope employee");
		
		Employee sesEmployee=new Employee();
		sesEmployee.setName("session scope employee");
		
		req.setAttribute("employee", reqEmployee);
		req.getSession().setAttribute("employee", sesEmployee);
		
		String str1="request scope str";
		String str2="session scope str";
		String str3="context scope str";
		
		req.setAttribute("str", str1);
		req.getSession().setAttribute("str", str2);
		getServletContext().setAttribute("str", str3);
		
		
		Cookie userNameCookie = new Cookie("userName", "aliBey");
		resp.addCookie(userNameCookie);
		
					
		RequestDispatcher view = req.getRequestDispatcher("_04.implicit.scope.cookie/implicitobject.jsp");
		view.forward(req, resp);
		
	}
	
	
}
