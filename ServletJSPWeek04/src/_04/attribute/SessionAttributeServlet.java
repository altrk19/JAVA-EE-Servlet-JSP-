//�ncelikle /sessionAttributeServlet �al��t�r�l�r ve session attribute olu�tu�rulur.(set)
//Ard�ndan /getSessionAttributeServlet �al��t�r�l�r ve sessiona ait attributeler consola yaz�l�r.(get)
//burda set ile attribute olu�turduktan sonra chrome ile getAttribute yaparsak consola null yazar.��nk� farkl� taray�c�larda farkl� sessionlar �al���r.
package _04.attribute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionAttributeServlet")
public class SessionAttributeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<String> myList=new ArrayList<String>();
		myList.add("value1");
		myList.add("value2");
		session.setAttribute("sessionAttribute", myList);
		System.out.println("##setAttribute �al��t�r�ld�");
		
	}

}
