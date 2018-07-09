package com.zuozuo66.management.service;

import java.util.List;

import com.zuozuo66.management.entity.Order;

public interface OrderService {
	public Integer addOrder(Order Order)throws Exception;
	
	public Integer addOrderList(List<Order> OrderList)throws Exception;
	
	public Integer updateOrder(Order Order)throws Exception;
	
	public Integer updateOrderList(List<Order> OrderList)throws Exception;
	
	public Integer delOrder(Order Order)throws Exception;
	
	public Integer delOrderList(List<Order> OrderList)throws Exception;
	
	public List<Order> findOrderList(Order Order)throws Exception;
	
	public void resetBaseOrder() throws Exception;

}
