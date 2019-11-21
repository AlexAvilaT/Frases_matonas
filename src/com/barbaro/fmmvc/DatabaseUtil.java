package com.barbaro.fmmvc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil 
{
	private static final String URL_FORMAT ="jdbc:%s://%s:%s/%s?useUnicode=true" + 
			"&useJDBCCompliantTimezoneShift=true" + /*paramatetros que requiere la base para hacer la conexion */
			"&useLegacyDatetimeCode=false" + 
			"&serverTimezone=UTC";
	public static Connection getConnection()
	{
		String dbms = "mysql";//1
		String host = "localhost";//2
		String port = "3306";//3
		String databaseName = "frases_matonas";//4
		String user = "root";//5
		String password = "root";//6
		String url = String.format(URL_FORMAT, dbms, host, port, databaseName);		//7	

		
		//0: Driver DBMS	
		// El objeto del que deriva todo
		Connection connection = null; //permite crear statement de sql oooooooooooooooooooooooooooooooooooooooohhh
		
		try 
		{
			//instancia del driver en memoria para poder acceder a ella
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			//conexion a la base de datos
			connection = DriverManager.getConnection(url, user, password);  /*esta clase se alimenta del driver*/
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection conn) 
	{
		try {
			conn.close();
		}
		catch(Exception e)
		{
			
		e.printStackTrace();
		}
			
	
}
	

}
