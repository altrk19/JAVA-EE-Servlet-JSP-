package _03.response.encoding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseEncodingServlet")
public class ResponseEncodingServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String defaultEncoding=resp.getCharacterEncoding();
		System.out.println(defaultEncoding);  //ISO-88589-1  t�rk�e karakter desteklemez. bizim 8859-9 ile yazmam�z laz�m
		
		resp.setCharacterEncoding("ISO-8859-9");       // bu method println metodundan once cagrilmaldir!
		PrintWriter pw = resp.getWriter();
		pw.println("�i�����");                         // karakter kodlamas� yap�lmazsa t�rk�e karakterler ekrana bas�lmaz
		
	
	  
		/*
		//2. y�ntem
		resp.setCharacterEncoding("UTF-8");
		PrintWriter pw = resp.getWriter();             //UTF-8 t�rk�e karakterler i�in kullan�l�r
	  	
 		pw.print("<html>");
        pw.print("<head> <meta charset='UTF-8'> </head>");
        pw.print("<body>");
        pw.println("<p>������</p>");
        pw.print("</body> </html>");
		*/
		
		
	
		
		
				
	}
}
