package _04.response.header;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw =resp.getWriter();
		pw.print("Burak Naber");
		resp.addHeader("username","test kullanici ali");      //response header ekler
		resp.addHeader("username", "test kullanici veli");
		resp.setHeader("password", "eskii");                  //response header ekler
		resp.setHeader("password", "yenii");
		//addHeader ile setHeader arasýndaki fark setHaader ayný isme sahip baþka header varsa override eder
		//addHeader ise yeni bir tane header ekler.
	}
}
