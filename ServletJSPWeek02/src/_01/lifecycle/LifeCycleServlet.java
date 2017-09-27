//Servlet Lifecycle olu�mas� i�in /lifecycle linkine t�klanmal�d�r.

//init metodu ve destroy metodu bir kere �a�r�l�r

// web.xml i�erisinde lifecycle ile ilgili bir�ey yaz�lmad�. annotation y�ntemi ile servlet olu�turuldu.
package _01.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("LifeCycleServlet init()");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("LifeCycleServlet doGet()");
		System.out.println("doGet metodu cagrildi");
		System.out.println("Ali Bey");
	}
	
	@Override
	public void destroy() {
		System.out.println("LifeCycleServlet destroy()");
	}
}
