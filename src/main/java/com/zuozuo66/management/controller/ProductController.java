package com.zuozuo66.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zuozuo66.management.entity.Product;
import com.zuozuo66.management.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
@Api(value="产品接口")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@ApiOperation(value="查询产品",notes="获取所有产品信息")
	@RequestMapping(value="/find",method=RequestMethod.POST )
	public List<Product> findProductList(Product product) throws Exception {
		return productService.findProductList(product);
	}
	
	@ApiOperation(value="新增产品",notes="新增产品信息")
	@RequestMapping(value="/add",method=RequestMethod.POST )
	public Integer addProduct(Product product) throws Exception {
		return productService.addProduct(product);
	}
	
	@ApiOperation(value="更新产品",notes="更新产品信息")
	@RequestMapping(value="/update",method=RequestMethod.POST )
	public Integer updateProduct(Product product) throws Exception {
		return productService.updateProduct(product);
	}
	
	@ApiOperation(value="重置产品",notes="重置基础产品信息")
	@RequestMapping(value="/reset",method=RequestMethod.POST )
	public void resetProduct() throws Exception {
		productService.resetBaseProduct();
	}
	

}
