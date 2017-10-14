//uygulamayý jsp sayfasý üzerinden çalýþtýrýyoruz.
package _06.function.el;

public class ELFunction {
	//public static olmalý
	public static int calculate(int n1,int n2) {      //function.tld dosyamýz WEB-INF klasörü altýnda olmalýdýr.
		return (n1+n2)*5;
	}
}
