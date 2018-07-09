package com.zuozuo66.management.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Order extends BaseVO implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8843545284593110833L;

	private Long orderId;
	
	private Long orderNumber;
	
	private String orderIssue;

	private String orderContent;
	
	private BigDecimal orderInvestment;
	
	private BigDecimal orderMultiple;
	
	private BigDecimal orderBenifit;

	private Product product;
	
	private User user;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderIssue() {
		return orderIssue;
	}

	public void setOrderIssue(String orderIssue) {
		this.orderIssue = orderIssue;
	}

	public String getOrderContent() {
		return orderContent;
	}

	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}

	public BigDecimal getOrderInvestment() {
		return orderInvestment;
	}

	public void setOrderInvestment(BigDecimal orderInvestment) {
		this.orderInvestment = orderInvestment;
	}

	public BigDecimal getOrderMultiple() {
		return orderMultiple;
	}

	public void setOrderMultiple(BigDecimal orderMultiple) {
		this.orderMultiple = orderMultiple;
	}

	public BigDecimal getOrderBenifit() {
		return orderBenifit;
	}

	public void setOrderBenifit(BigDecimal orderBenifit) {
		this.orderBenifit = orderBenifit;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
