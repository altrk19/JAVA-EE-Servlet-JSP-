//ilk önce contextAttributeServlet çalýþtýrýlýr ve setAttribute metodu ile attribute eklenir
//ardýndan getContextAttributeServlet ile eklenen attribute okunur

package _04.attribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextAttributeServlet")
public class ContextAttributeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		context.setAttribute("attribueName1", "myValue1");
	}
}
