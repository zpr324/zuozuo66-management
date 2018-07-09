package com.zuozuo66.management.service;

import java.util.List;

import com.zuozuo66.management.entity.Product;

public interface ProductService {
	
	public Integer addProduct(Product product)throws Exception;
	
	public Integer addProductList(List<Product> ProductList)throws Exception;
	
	public Integer updateProduct(Product product)throws Exception;
	
	public Integer updateProductList(List<Product> ProductList)throws Exception;
	
	public Integer delProduct(Product product)throws Exception;
	
	public Integer delProductList(List<Product> ProductList)throws Exception;
	
	public List<Product> findProductList(Product product)throws Exception;
	
	public void resetBaseProduct() throws Exception;

}
