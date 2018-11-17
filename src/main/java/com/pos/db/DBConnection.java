package com.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static 
	{
		try {
			//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
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
	Connection con=null;
	try {
		con=DriverManager.getConnection(url, user, password);
	} catch (SQLException e) 
	{
		e.printStackTrace();
	}
	return con;
}

}
