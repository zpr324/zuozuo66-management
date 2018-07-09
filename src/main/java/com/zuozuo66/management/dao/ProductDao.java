package com.zuozuo66.management.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zuozuo66.management.entity.Product;

public interface ProductDao {
	
	public Integer addProduct(@Param("product")Product product)throws Exception;
	
	public Integer addProductList(@Param("list")List<Product> ProductList)throws Exception;
	
	public Integer updateProduct(@Param("product")Product product)throws Exception;
	
	public Integer updateProductList(@Param("list")List<Product> ProductList)throws Exception;
	
	public Integer delProduct(@Param("product")Product product)throws Exception;
	
	public Integer delProductList(@Param("list")List<Product> ProductList)throws Exception;
	
	public List<Product> findProductList(@Param("product")Product product)throws Exception;
	
	public Map<String, Object> test(@Param("list")List<List<String>> list) throws Exception;

}
