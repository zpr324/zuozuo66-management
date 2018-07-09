package com.zuozuo66.management.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zuozuo66.management.dao.ProductDao;
import com.zuozuo66.management.entity.Product;
import com.zuozuo66.management.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Integer addProduct(Product product) throws Exception {
		return productDao.addProduct(product);
	}

	@Override
	public Integer addProductList(List<Product> ProductList) throws Exception {
		return null;
	}

	@Override
	public Integer updateProduct(Product product) throws Exception {
		return productDao.updateProduct(product);
	}

	@Override
	public Integer updateProductList(List<Product> ProductList) throws Exception {
		return null;
	}

	@Override
	public Integer delProduct(Product product) throws Exception {
		return productDao.delProduct(product);
	}

	@Override
	public Integer delProductList(List<Product> ProductList) throws Exception {
		return null;
	}

	@Override
	@Cacheable(key="#p0")
	public List<Product> findProductList(Product product) throws Exception {
		return productDao.findProductList(product);
	}

	@Override
	public void resetBaseProduct() throws Exception {
	    int year = LocalDate.now().getYear();
	    String[] animals = {"猪","鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗"};
	    int startIndex = (year+9) % 12;
	 
		List<Product> list = new ArrayList<>();
		int t= 1;
		for (int j = startIndex; j < 12; j++) {
			Product product2 = new Product();
			product2.setStatus(1);
			product2.setProductCategory("Animal");
			product2.setProductName(animals[j]);
			int i = t++;
			String content = ""+i+","+(i+12)+","+(i+24)+","+(i+36);
			if (j == startIndex) {
				content += ","+(i+48);
			}
			product2.setProductContent(content);
			list.add(product2);
		}
		for (int j = 0; j < startIndex; j++) {
			Product product2 = new Product();
			product2.setStatus(1);
			product2.setProductCategory("Animal");
			product2.setProductName(animals[j]);
			int i = t++;
			String content = ""+i+","+(i+12)+","+(i+24)+","+(i+36);
			product2.setProductContent(content);
			list.add(product2);
		}
		
	}

}
