//2. yöntem olan annotation yöntemi aþaðýda verilmiþtir.
//bu yöntemde web.xml içerisine gidilip servlet oluþturulmuyor. web.xml'e gidip varolan servlet map ediliyor.

package _01.hello.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/annotation.servlet")
public class AnnotationServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.print("Hello Servlet with Annotation");	
		System.out.println("merhaba");
	}
}
