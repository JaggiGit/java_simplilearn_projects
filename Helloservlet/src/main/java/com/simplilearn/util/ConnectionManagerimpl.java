package com.simplilearn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerimpl implements ConnectionManager
{
    Connection connection = null ;

	public Connection getconnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jaggi1" ,"root","root");
			
			
		}
		catch(ClassNotFoundException | SQLException  e )
		{
			((Throwable) e).printStackTrace();
		}
		
		
		return connection ;
	}
  
}
