//Request dispatch mantýgýnda program çalýþýrken ayný adnda 2 dosyayý çalýþtýrabiliriz. Bu yaklaþýmda request attribute kullanýyoruz.
//Request dispatch mantýgýnda 2 file kullanýlýyor. servlet + jsp

package _05.request.dispatch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _05.request.dispatch.model.Person;
@WebServlet("/person")          //burada istek PersonController'a geldiði zaman JSP'den de faydalanacaðýz.
public class PersonController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	/* Genel mantýk Controller->Service->Dao katmanýna eriþecektir.
	   Dao'dan veri geldikten sonra biz JSP dosyamýza attribute döneriz.
	   Controllerdan direk veri tabaný baglantýsý yapýlmaz.Dao katmanýndan veritabaný baglantýsý yapýlýr.
	 */
		Person person = new Person("Ali","Türk");
		Person person2 = new Person("name1","surname1");
		Person person3 = new Person("name2","surname2");            //bu verilerin databaseden geldigini düþünebiliriz.
		
	//biz servletler içerisinde html kodlarý yazmýstýk bu çok yapýlan birþey degildir.
	//yapmamýz gereken þey datayý alýp jsp dosyasýna veya view dosyasýna dispatch etmek.
		
		List<Person>personList=new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		personList.add(person3);
	//normalde bunlarý taryýcýda yazdýrmak istersek tr td yazmamýz gerekecek kötü bir görüntü ortaya çýkacak.
	//bunu biz jsp ile yapacagýz.Yani bize istekgeldiginde hem servlet çalýþsýn hem de jsp dosyamýz çalýþsýn.bunu yapmak için request dispatch yapacagýz.
	
		//request scope'a obje eklendi.
		req.setAttribute("persons",personList);   //personList'i JSP dosyamýza aktarýyoruz.
		
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/Person/PersonView.jsp");
	//bu noktadan sonra PersonView.jsp dosyasý oluþturuldu. bir istek karsýlandýgýnda isin içine jsp dosyalarýný da katýyoruz
	
		dispatcher.forward(req, resp);
		
		
		
	}
}
