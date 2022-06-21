package com.simplilearn.jdbc.service;

import java.util.Set;

import com.simplilearn.jdbc.dao.Productdao;
import com.simplilearn.jdbc.dao.Productdaoimpl;
import com.simplilearn.jdbc.dto.Product;

public class Productserviceimpl implements Productservice
{     
	private Productdao dao ;
	public Productserviceimpl() {
		dao = new Productdaoimpl() ;
	}

	@Override
	public boolean addProduct(Product product) {
		
		return dao.addProduct(product) ;
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
