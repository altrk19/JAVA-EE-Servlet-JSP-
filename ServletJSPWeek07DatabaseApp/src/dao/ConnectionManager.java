package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionManager {
	//DataSource connectionlar� y�netir. Datasource �zerinden connectionlar� elde edece�iz.
	public DataSource getMYSQLDataSource() {
		Properties props=new Properties();
							//�imdi properties dosyas�n�n i�erisindeki datalar� okumam�z laz�m.db.properties dosyas� src alt�nda yer almaktad�r.
							//yani classpath i�erisindedir. B�yle oldugu i�in classloader kullanabiliriz.
	
		//getClass().getClassLoader().getResourceAsStream("db.properties");//Bu �ekilde classpath'deki t�m dosyalar� okuyabiliriz. Bu geriye InputStream d�nd�recektir.
		
		InputStream is=getClass().getClassLoader().getResourceAsStream("db.properties");
		
		
		//Kulland�g�m�z veritaban�na g�re bir datasource olu�turmam�z gerekiyor.Bu nedenle MySqlDataSource nesnesi olu�turuyoruz
		MysqlDataSource mySqlDataSource=null;
		
		try {
			props.load(is);
			mySqlDataSource=new MysqlDataSource();				//Bu nesnenin set metodu ile db.properties klas��r�ndeki verileri setliyoruz.
			mySqlDataSource.setURL(props.getProperty("url"));                   //Veritaban�n�n bilgilerini set ettik. veritaban� user,�ifresi,url 
			mySqlDataSource.setUser(props.getProperty("username"));
			mySqlDataSource.setPassword(props.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mySqlDataSource;
		
	}                                
}
