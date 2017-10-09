package _02.filterXSS;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XSSRequestWrapper extends HttpServletRequestWrapper{

	public XSSRequestWrapper(HttpServletRequest request) {
		super(request);
		
	}
	
	@Override
	public String getParameter(String name) {      //textboxa girilen de�er htmlEncode metoduna g�nderilir
		String value=super.getParameter(name);     //sonras�nda ise ilgili karakter varsa yeni karakter ile
		return htmlEncode(value);                  //ile de�i�tirilip return edilir.
	}
	
	public String htmlEncode(String parameter) {
		                                                               //key ilk �nce < de�erini al�yor ve parameter 
		for(String key:encodeMap.keySet()) {                           //stringinde < ile &#60 de�erini de�i�tiriyor
			parameter=parameter.replaceAll(key, encodeMap.get(key));   //sonra key > de�erini al�p &#62 ile de�i�tiriyor.(replaceAll)
		}                        
		return parameter;         
	}
	private static final HashMap<String,String> encodeMap= new HashMap<String,String>();
	static {                           //static alan ilk olarak ko�an k�s�md�r. burda key/value e�le�mesi yap�l�yor.
		encodeMap.put("<","&#60;");    //yukarda replaceAll ile de�er de�i�tirme i�lemi 2. k�s�m oluyor.
		
		encodeMap.put(">","&#62;");
		
		encodeMap.put("'","&#99;");
	}

}
