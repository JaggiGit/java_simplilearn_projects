package com.simplilearn.jdbc.dao;

import java.util.Set;

import com.simplilearn.jdbc.dto.Product;

public interface Productdao {
	
	public boolean addProduct(Product product);
	public boolean updateProductCost(int product_id,double product_cost);
	public boolean deleteProduct(int product_id);
	public Set<Product> getAllProducts();
    public Product searchProductById();
    public Product searchProductByName();
}
