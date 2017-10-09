package _02.filterXSS;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XSSRequestWrapper extends HttpServletRequestWrapper{

	public XSSRequestWrapper(HttpServletRequest request) {
		super(request);
		
	}
	
	@Override
	public String getParameter(String name) {      //textboxa girilen deðer htmlEncode metoduna gönderilir
		String value=super.getParameter(name);     //sonrasýnda ise ilgili karakter varsa yeni karakter ile
		return htmlEncode(value);                  //ile deðiþtirilip return edilir.
	}
	
	public String htmlEncode(String parameter) {
		                                                               //key ilk önce < deðerini alýyor ve parameter 
		for(String key:encodeMap.keySet()) {                           //stringinde < ile &#60 deðerini deðiþtiriyor
			parameter=parameter.replaceAll(key, encodeMap.get(key));   //sonra key > deðerini alýp &#62 ile deðiþtiriyor.(replaceAll)
		}                        
		return parameter;         
	}
	private static final HashMap<String,String> encodeMap= new HashMap<String,String>();
	static {                           //static alan ilk olarak koþan kýsýmdýr. burda key/value eþleþmesi yapýlýyor.
		encodeMap.put("<","&#60;");    //yukarda replaceAll ile deðer deðiþtirme iþlemi 2. kýsým oluyor.
		
		encodeMap.put(">","&#62;");
		
		encodeMap.put("'","&#99;");
	}

}
