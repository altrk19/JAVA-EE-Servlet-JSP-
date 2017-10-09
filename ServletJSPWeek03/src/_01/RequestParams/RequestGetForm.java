//listbox'�n html kar��l��� <select>
//radiobutton'Un html kar��l�g� <input type="radio" />
//checkbox ayn� <input type="checkbox" />

package _01.RequestParams;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//ilk olarak /formGet.html sayfas� �al��t�r�l�r ve oradan submit ile /requestGetForm Servleti �al��t�r�l�r.
@WebServlet("/requestGetForm")
public class RequestGetForm extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("RequestGetForm#doGet");
		
		/*
		//1. y�ntem
		String firstName=req.getParameter("firstName");
		String lastname=req.getParameter("lastName");
		String gender=req.getParameter("gender");
		String medeniDurum=req.getParameter("medeni durum");
		String[] langs =req.getParameterValues("lang");
		
		PrintWriter pw = resp.getWriter();
		pw.println(firstName);
		pw.println(lastname);
		pw.println(gender);
		pw.println(medeniDurum);
		pw.println(Arrays.asList(langs));*/
		
		
		//2. y�ntem. d�ng� ile t�m bilgileri yazd�rd�k
		PrintWriter pw = resp.getWriter();
		Map<String, String[]> parameterMap=req.getParameterMap();            //getParameterMap() metodu request parametrelerinin name ve value bilgilerini map yap�s� i�erisinde return eder.
		for(Map.Entry<String,String[]> entry : parameterMap.entrySet()) {
			pw.println(entry.getKey()+""+Arrays.asList(entry.getValue())+"<br>");
		}
		
			
		
	}

}
