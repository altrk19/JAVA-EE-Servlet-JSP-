package _03.jspaction;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _03.jspaction.Person;

@WebServlet("/persons")
public class PersonController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person kisi1=new Person("Ali","Bey",55);
		req.setAttribute("liste", kisi1);
		
		//RequestDispatcher dispatcher=req.getRequestDispatcher("person.jsp");
		RequestDispatcher dispatcher2=req.getRequestDispatcher("personUseBean.jsp");
		dispatcher2.forward(req, resp);
		
	}

}
