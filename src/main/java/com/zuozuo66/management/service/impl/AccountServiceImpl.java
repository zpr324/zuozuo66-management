package com.zuozuo66.management.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuozuo66.management.dao.AccountDao;
import com.zuozuo66.management.entity.Account;
import com.zuozuo66.management.entity.User;
import com.zuozuo66.management.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;

	@Override
	public Integer createAccount(User user) throws Exception {
		accountDao.createAccount(user);
		return 1;
	}
	
	@Override
	public Integer createAccountList(List<User> userList) throws Exception {
		accountDao.createAccountList(userList);
		return 1;
	}

	@Override
	public Integer updateAccountList(List<Account> accountList) throws Exception {
		accountDao.updateAccountList(accountList);
		return 1;
	}

	@Override
	public Integer delAccountList(List<Account> accountList) throws Exception {
		List<Long> userIds = new ArrayList<>();
		accountList.forEach(account ->userIds.add(account.getUser().getUserId()));
		Integer result = accountDao.delAccountListByUserIds(userIds);
		return result;
	}

	@Override
	public List<Account> findAccountList(Account account) throws Exception {
		return accountDao.findAccountList(account);
	}


}
