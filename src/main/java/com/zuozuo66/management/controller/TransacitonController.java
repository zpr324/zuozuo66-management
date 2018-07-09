package com.zuozuo66.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuozuo66.management.entity.Transaction;
import com.zuozuo66.management.service.TransactionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/transaction")
@Api("后台管理-交易记录服务")
public class TransacitonController {
	@Autowired
	private TransactionService transactionService;
	
	@ApiOperation("查询交易记录")
	@PostMapping("/find")
	public List<Transaction> findTransactionList(Transaction transaction) throws Exception{
		return transactionService.findTransactionList(transaction);
	}
	
	@ApiOperation("创建交易记录")
	@PostMapping("/create")
	public Integer createTransactionList(@RequestBody List<Transaction> transactionList) throws Exception{
		return transactionService.createTransactionList(transactionList);
	}
}
