//Tarayýcýdaki cookie'yi okuma kodu
//ilk önce ResponseCookieServle sýnýfý ile cookie oluþturulur ve burada okunur
package _05.response.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookieServlet")
public class ResponseGetCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		if(cookies != null) {
			for(Cookie c:cookies) {
				PrintWriter pw=resp.getWriter();
				pw.print(c.getName()+" "+c.getValue()+" cookie'si okundu");
				//System.out.println(c.getName()+" "+c.getValue()+"cookie'si okundu");
				
			}			
		}
		else {
			PrintWriter pw=resp.getWriter();
			pw.print("no cookie");
		}
			
	}

}
