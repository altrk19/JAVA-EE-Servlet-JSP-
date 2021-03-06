package _03.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/contextServlet")        // bu servlete ait config objesinde parametre yok. olu�turmak i�in  
@WebServlet(urlPatterns="/contextServlet",initParams=@WebInitParam(name="var",value="value"))
public class ContextServlet extends HttpServlet{     //@WebServlet(urlPatterns="/configAnnotation",initParams=@WebInitParam(name="role",value="admin")) yap�s� kullan�lmal�d�r.

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		//ServletContext context2=getServletConfig().getServletContext();      // ikiside ayn�d�r	
		
		ServletConfig config = getServletConfig();
		String name=config.getInitParameter("var");
	
		
		
		String email=context.getInitParameter("email");                            // name stringi neden null? ��nk� name configden �ekiyor. servlete ait parametre olmad�g� i�in null.
		resp.getWriter().print(name +"  "+email+"<br>"+"<br>"+"<br>");             //config servletten �eker , context projeden �eker.
		
		
		String realPath =context.getRealPath("/test.txt");                         //realPath-->test.txt dosyas�n�n uzant�s�n� d�nd�r�r
		resp.getWriter().print("test.txt realPath: "+realPath+"<br>");
		
		String contextPath =context.getContextPath();                               //contextPath --> projenin ba�l���n� d�nd�r�r.
		resp.getWriter().print("context Path : "+contextPath+"<br>");
		
		String serverInfo=context.getServerInfo();	                                //serverInfo --> Kullan�lan server�n ad�n� d�nd�r�r
		resp.getWriter().print("serverInfo : "+serverInfo+"<br>");
		
	}
}
