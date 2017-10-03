package _01.RequestParams;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ilk olarak /formPost.html sayfasý çalýþtýrýlýr ve oradan submit ile /requestPostForm Servleti çalýþtýrýlýr.
@WebServlet("/requestPostForm")
public class RequestPostForm extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("RequestPostForm#doPost");
		
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
	
	}

}
