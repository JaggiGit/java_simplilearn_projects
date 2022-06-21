package com.simplilearn.jdbc.client;

import com.simplilearn.jdbc.dto.Product;
import com.simplilearn.jdbc.service.Productservice;
import com.simplilearn.jdbc.service.Productserviceimpl;

public class Client {

	public static void main(String[] args) 
	{
	try {	
		Product product= new Product (2,"Laptop",100000) ;
		Productservice service = new Productserviceimpl();
		
		boolean IsProductAdded = service.addProduct(product);
		if(IsProductAdded==true)	
		{
			System.out.println("Product added successfully");
		}
		else {
			System.out.println("Product addition unsuccessful");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
