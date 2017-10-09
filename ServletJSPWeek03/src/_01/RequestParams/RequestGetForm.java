//listbox'ýn html karþýlýðý <select>
//radiobutton'Un html karþýlýgý <input type="radio" />
//checkbox ayný <input type="checkbox" />

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


//ilk olarak /formGet.html sayfasý çalýþtýrýlýr ve oradan submit ile /requestGetForm Servleti çalýþtýrýlýr.
@WebServlet("/requestGetForm")
public class RequestGetForm extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("RequestGetForm#doGet");
		
		/*
		//1. yöntem
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
		
		
		//2. yöntem. döngü ile tüm bilgileri yazdýrdýk
		PrintWriter pw = resp.getWriter();
		Map<String, String[]> parameterMap=req.getParameterMap();            //getParameterMap() metodu request parametrelerinin name ve value bilgilerini map yapýsý içerisinde return eder.
		for(Map.Entry<String,String[]> entry : parameterMap.entrySet()) {
			pw.println(entry.getKey()+""+Arrays.asList(entry.getValue())+"<br>");
		}
		
			
		
	}

}
