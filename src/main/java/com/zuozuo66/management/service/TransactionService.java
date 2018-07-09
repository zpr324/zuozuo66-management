package com.zuozuo66.management.service;

import java.util.List;

import com.zuozuo66.management.entity.Transaction;

public interface TransactionService {
	
	/**
	 * 
	 * @author zuozuo
	 * @param  Transaction 交易记录entity
	 * @return List<Transaction> 交易记录集合
	 * @throws Exception
	 */
	public List<Transaction> findTransactionList(Transaction transaction) throws Exception;
	
	/**
	 * 
	 * @author zuozuo
	 * @param  List<Transaction> 交易记录集合
	 * @return flag 成功标识
	 * @throws Exception
	 */
	public Integer createTransactionList(List<Transaction> transactionList) throws Exception;

}
