package com.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection con=null;
	static 
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}
	public static Connection getDBConnection()
	{
		String url="jdbc:sqlserver://localhost:1433; databaseName=CYBPOSDB";
		String user="sa";
		String password="scott";
		try {
			if(con==null)
			{
			   con=DriverManager.getConnection(url, user, password);
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return con;
	} 
	/*public static Connection getPoolConnection() 
{

	String url="jdbc:sqlserver://localhost:1433; databaseName=CYBPOSDB";
	String user="sa";
	String password="scott";

	Connection con=null;
	try {
		Context context = new InitialContext();
		DataSource dataSource=(DataSource)context.lookup(url);
		con=dataSource.getConnection(user,password);
	} catch (NamingException e) 
	{
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
  }
	 */
}
