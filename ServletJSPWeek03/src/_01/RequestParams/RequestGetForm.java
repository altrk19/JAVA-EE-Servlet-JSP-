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
		pw.println(Arrays.asList(langs));
		
		//html sayfas�nda girilen i�erikleri console'da yazd�rd�k
		Map<String,String[]> parameterMap =req.getParameterMap();
		for(Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println(entry.getKey()+" "+Arrays.asList(entry.getValue()));
		}
			
		
		
	}

}
