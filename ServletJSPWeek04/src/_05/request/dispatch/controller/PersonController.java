//Request dispatch mant�g�nda program �al���rken ayn� adnda 2 dosyay� �al��t�rabiliriz. Bu yakla��mda request attribute kullan�yoruz.
//Request dispatch mant�g�nda 2 file kullan�l�yor. servlet + jsp

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
@WebServlet("/person")          //burada istek PersonController'a geldi�i zaman JSP'den de faydalanaca��z.
public class PersonController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	/* Genel mant�k Controller->Service->Dao katman�na eri�ecektir.
	   Dao'dan veri geldikten sonra biz JSP dosyam�za attribute d�neriz.
	   Controllerdan direk veri taban� baglant�s� yap�lmaz.Dao katman�ndan veritaban� baglant�s� yap�l�r.
	 */
		Person person = new Person("Ali","T�rk");
		Person person2 = new Person("name1","surname1");
		Person person3 = new Person("name2","surname2");            //bu verilerin databaseden geldigini d���nebiliriz.
		
	//biz servletler i�erisinde html kodlar� yazm�st�k bu �ok yap�lan bir�ey degildir.
	//yapmam�z gereken �ey datay� al�p jsp dosyas�na veya view dosyas�na dispatch etmek.
		
		List<Person>personList=new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		personList.add(person3);
	//normalde bunlar� tary�c�da yazd�rmak istersek tr td yazmam�z gerekecek k�t� bir g�r�nt� ortaya ��kacak.
	//bunu biz jsp ile yapacag�z.Yani bize istekgeldiginde hem servlet �al��s�n hem de jsp dosyam�z �al��s�n.bunu yapmak i�in request dispatch yapacag�z.
	
		//request scope'a obje eklendi.
		req.setAttribute("persons",personList);   //personList'i JSP dosyam�za aktar�yoruz.
		
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/Person/PersonView.jsp");
	//bu noktadan sonra PersonView.jsp dosyas� olu�turuldu. bir istek kars�land�g�nda isin i�ine jsp dosyalar�n� da kat�yoruz
	
		dispatcher.forward(req, resp);
		
		
		
	}
}
