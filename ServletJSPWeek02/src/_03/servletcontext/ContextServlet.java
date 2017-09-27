package _03.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextServlet")
public class ContextServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		//ServletContext context2=getServletConfig().getServletContext();      // ikiside aynýdýr	
		
		ServletConfig config = getServletConfig();
		String name=config.getInitParameter("username");
	
		
		
		String email=context.getInitParameter("email");                            // name stringi neden null? çünkü name configden çekiyor. servlete ait parametre olmadýgý için null.
		resp.getWriter().print(name +"  "+email+"<br>"+"<br>"+"<br>");             //config servletten çeker , context projeden çeker.
		
		
		String realPath =context.getRealPath("/test.txt");                         //realPath-->test.txt dosyasýnýn uzantýsýný döndürür
		resp.getWriter().print("test.txt realPath: "+realPath+"<br>");
		
		String contextPath =context.getContextPath();                               //contextPath --> projenin baþlýðýný döndürür.
		resp.getWriter().print("context Path : "+contextPath+"<br>");
		
		String serverInfo=context.getServerInfo();	                                //serverInfo --> Kullanýlan serverýn adýný döndürür
		resp.getWriter().print("serverInfo : "+serverInfo+"<br>");
		
	}
}
