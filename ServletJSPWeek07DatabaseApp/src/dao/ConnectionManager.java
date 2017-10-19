package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionManager {
	//DataSource connectionlarý yönetir. Datasource üzerinden connectionlarý elde edeceðiz.
	public DataSource getMYSQLDataSource() {
		Properties props=new Properties();
							//þimdi properties dosyasýnýn içerisindeki datalarý okumamýz lazým.db.properties dosyasý src altýnda yer almaktadýr.
							//yani classpath içerisindedir. Böyle oldugu için classloader kullanabiliriz.
	
		//getClass().getClassLoader().getResourceAsStream("db.properties");//Bu þekilde classpath'deki tüm dosyalarý okuyabiliriz. Bu geriye InputStream döndürecektir.
		
		InputStream is=getClass().getClassLoader().getResourceAsStream("db.properties");
		
		
		//Kullandýgýmýz veritabanýna göre bir datasource oluþturmamýz gerekiyor.Bu nedenle MySqlDataSource nesnesi oluþturuyoruz
		MysqlDataSource mySqlDataSource=null;
		
		try {
			props.load(is);
			mySqlDataSource=new MysqlDataSource();				//Bu nesnenin set metodu ile db.properties klasöüründeki verileri setliyoruz.
			mySqlDataSource.setURL(props.getProperty("url"));                   //Veritabanýnýn bilgilerini set ettik. veritabaný user,þifresi,url 
			mySqlDataSource.setUser(props.getProperty("username"));
			mySqlDataSource.setPassword(props.getProperty("password"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mySqlDataSource;
		
	}                                
}
