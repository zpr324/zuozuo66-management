package com.zuozuo66.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuozuo66.management.dao.TransactionDao;
import com.zuozuo66.management.entity.Transaction;
import com.zuozuo66.management.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionDao transactionDao; 

	@Override
	public List<Transaction> findTransactionList(Transaction transaction) throws Exception {
		return transactionDao.findTransactionList(transaction);
	}

	@Override
	public Integer createTransactionList(List<Transaction> transactionList) throws Exception {
		transactionDao.createTransactionList(transactionList);
		return 1;
	}

}
