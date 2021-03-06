package _07.url.rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/urlRewrite")
public class URLRewrite extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		session.setAttribute("key", "my value");
		
		PrintWriter pw=resp.getWriter();
		
		String nonEncodeUrl="getSessionAttribute";          //aşağıda href linki içerisine bu string yazılarak ilgili servlete gidilir.
		
		
		String encodeUrl=resp.encodeUrl("getSessionAttribute");               //tarayıcıdan cookileri kapattıktan sonra bu uygulamayı çalıştır!!!
		pw.print("<html><body>");
		pw.println("Giris encodeURL metodu kullanilmadan : <a href=\""+nonEncodeUrl+"\">Click Here</a>"+"<br>");       //encodeURL metodu kullanırsak cookie'si kapalı tarayıcılarda
		pw.println("Giris encodeURL metodu kullanip      : <a href=\""+encodeUrl+"\">Click Here</a>");                 //sessionAttribute'lee ulaşabiliriz.
		pw.print("</body></html>");
	}
	
}
