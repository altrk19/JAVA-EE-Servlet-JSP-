//ServletContext Listener tanýmlamanýn 2 yöntemi var.1)web.xml 2)annotation. bu uygulama da xml yapýsý kullanýlmýþtýr

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

Ayný örneði annotation kullanarak yapmak için:

@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener{
...
}

þeklinde yazýlmalýdýr.
*/