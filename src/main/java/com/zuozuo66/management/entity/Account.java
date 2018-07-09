package com.zuozuo66.management.entity;

import java.math.BigDecimal;

public class Account extends BaseVO {

	private static final long serialVersionUID = -1557141738933492112L;
	
	//账户编号
	private Long accountId;
	
	//账户余额
	private BigDecimal accountBalance;
	
	//用户
	private User user;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
