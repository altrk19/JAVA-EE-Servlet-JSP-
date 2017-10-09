//_01.RequestParams package altýnda kullanýcýnýn göndermiþ oldugu verileri okuduk.
//_02.requestMethods package'nda ise tarayýcýnýn göndermiþ oldugu verileri okuyoruz.

package _02.request.methods;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestMethodServlet")
public class RequestMethodsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Locale locale=req.getLocale();                           //hangi ülke bilgisi
		int serverPort=req.getServerPort();                      //Request'in ilk karþýlandýðý port
		int localPort=req.getLocalPort();                        //Request'in tamamlandýðý port
		int remotePort=req.getRemotePort();                      //isteðin gönderildiði porttur. çýktý: 18691
		String remoteAddr=req.getRemoteAddr();                   //ip adresi
		String serverName=req.getServerName();                   //server adý :localhost
		ServletContext context =req.getServletContext();         //servlet context 
		String hostName=req.getHeader("host");                   //host'un header bilgileri
		String httpMethod=req.getMethod();
		
		
		System.out.println(locale);
		System.out.println(serverPort);
		System.out.println(localPort);
		System.out.println(remotePort);
		System.out.println(remoteAddr);
		System.out.println(serverName);
		System.out.println(context);
		System.out.println(hostName);
		System.out.println(httpMethod);
		
		System.out.println("Header Names #####");
		Enumeration<String> headerNames=req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String hname=headerNames.nextElement();
			String hvalue=req.getHeader(hname);
			System.out.println(hname+" "+hvalue);
		}
		
	}
}
