package _04.attribute;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getRequestAttribute")
public class GetRequestAttribute extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String attribute = (String) req.getAttribute("requestAttribute");

		System.out.println("request attribute : " + attribute);

		// request objesine attribute eklenebilir. request attribute sadece
		// ilgili request'e aittir.

		// burda çýktý olarak null deðerini alýrýz. çünkü farklý servletler
	
	}
}