package com.zuozuo66.management.entity;

public class Product extends BaseVO {
	
	private static final long serialVersionUID = -7433212281901585022L;

	private String productCategory;
	
	private String productName;
	
	private String productContent;

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductContent() {
		return productContent;
	}

	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}
	
}
