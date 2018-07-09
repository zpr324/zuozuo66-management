package com.zuozuo66.management.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Transaction extends BaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2244893254924738464L;
	
	private Long transactionId;
	
	private Long accountId;
	
	private BigDecimal transactionAmount;
	
	private String transactionType;
	
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}
