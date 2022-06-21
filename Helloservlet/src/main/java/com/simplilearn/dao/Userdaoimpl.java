package com.simplilearn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.simplilearn.dto.User;
import com.simplilearn.util.ConnectionManagerimpl;

public class Userdaoimpl implements Userdao
{ 
           Connection connection ;
           
           public Userdaoimpl()
           {
        	   connection = new ConnectionManagerimpl().getconnection();
           }
	@Override
	public boolean Validateuser(User user) 
	{
		boolean Isuservalid = false ;
		
		String query = "select * from userdetails where user_name= ? and password= ? " ;
		try {
			PreparedStatement statement = connection.prepareStatement(query) ;
			statement.setString(1,user.getUsername());
			statement.setString(1,user.getPassword());
			
			ResultSet resultset = statement.executeQuery() ;
			
			if(resultset.next()==true)
			{
				Isuservalid = true ;
			}
			return Isuservalid ;
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		return Isuservalid ;
	}

}
