//ServletContext Listener tan�mlaman�n 2 y�ntemi var.1)web.xml 2)annotation. bu uygulama da xml yap�s� kullan�lm��t�r

package _03.listener;

import javax.servlet.ServletContextEvent;

public class ServletContextListener implements javax.servlet.ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("##contextInitialized");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("##contextDestroyed");
		
	}

}

/*

Ayn� �rne�i annotation kullanarak yapmak i�in:

@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener{
...
}

�eklinde yaz�lmal�d�r.
*/