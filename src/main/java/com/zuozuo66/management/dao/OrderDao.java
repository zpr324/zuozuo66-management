package com.zuozuo66.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zuozuo66.management.entity.Order;

public interface OrderDao {
	
	public Integer createOrder(Order order)throws Exception;
	
	public Integer createOrderList(@Param("list")List<Order> orderList)throws Exception;
	
	public Integer updateOrder(Order Order)throws Exception;
	
	public Integer updateOrderList(@Param("list")List<Order> orderList)throws Exception;
	
	public Integer delOrder(Order order)throws Exception;
	
	public Integer delOrderList(@Param("list")List<Order> orderList)throws Exception;
	
	public List<Order> findOrderList(Order order) throws Exception;
	
	public Integer findOrderListCount(Order order) throws Exception;
	

}
