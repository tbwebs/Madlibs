package com.revature.madlibDAOs;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager 
{
	private static Connection connection;

	//format is httpprotocol:sqltype://serverURL:port#/databaseName
	private static String connectString = "jdbc:postgresql://salt.db.elephantsql.com:5432/zohqusqo",
		username = "zohqusqo",
		password = "d7ZnvZaVK6gON0FUdfstbE1txT4Hy56h";
	
	public static Connection getConnect()
	{
		//this will not compile w/o a try/catch block
		try 
		{
			if(connection == null || connection.isClosed())
			{
				//this ensures the driver class is loaded 
				//it needs the maven dependency in the POM file
				Class.forName("org.postgresql.Driver");
				
				//this uses driver manager to make sure there is a suitable driver to make connection
				//it will use postgresql driver to setup io stream to pass data between app and DB
				connection = DriverManager.getConnection(connectString, username, password);
			}
			
			return connection;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
