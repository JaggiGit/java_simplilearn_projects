package com.simplilearn.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.simplilearn.jdbc.dto.Product;
import com.simplilearn.jdbc.util.Connectionmanager1;

public class Productdaoimpl implements Productdao
{     
    public Connection connection;
	
	public Productdaoimpl()
     {
		Connectionmanager1 connection = new Connectionmanager1() ;
     }
	@Override 
	public boolean addProduct(Product product)
	{
	    	boolean IsProductAdded=false ;
	    	String query="insert into products values(?,?,?)";
	    	try {
	    		
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1, product.getProduct_id());
				ps.setString(2,product.getProduct_name());
				ps.setDouble(3, product.getProduct_cost());
				
	    		int val = ps.executeUpdate();
	    		if(val>0)
	    		{
	    			IsProductAdded=true;
	    		}
	    		}
	    	catch(SQLException e)
	    	{
	    		e.printStackTrace();
	  	    	}
	    	return IsProductAdded ;
	}

	@Override
	public boolean updateProductCost(int product_id, double product_cost) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int product_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProductById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProductByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
