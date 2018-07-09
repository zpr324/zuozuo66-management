package com.zuozuo66.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zuozuo66.management.entity.Transaction;

public interface TransactionDao {
	
	public Integer createTransactionList(@Param("list")List<Transaction> TransactionList)throws Exception;
	
	public List<Transaction> findTransactionList(Transaction Transaction)throws Exception;

}
