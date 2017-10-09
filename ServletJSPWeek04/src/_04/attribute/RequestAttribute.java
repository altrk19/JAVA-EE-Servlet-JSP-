package _04.attribute;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/requestAttribute")
public class RequestAttribute extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setAttribute("requestAttribute", "my request attribute");
		// request objesine attribute ekleyebiliriz.
		// request attribute sadece ilgili request icin gecerlidir.
		
		String attribute = (String) req.getAttribute("requestAttribute");

		System.out.println("request attribute : " + attribute); //burda çýktý "my request attribute" olur. fakat getRequestAttribute servletine ayný kod yazýldýgý zaman bu çýktýyý alamayýz.
																//Çünkü requestAttributeler sadece ilgili servlette çalýþýrlar.
		                                                       	
	}
}