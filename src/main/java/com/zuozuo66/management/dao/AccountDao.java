package com.zuozuo66.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zuozuo66.management.entity.Account;
import com.zuozuo66.management.entity.User;

public interface AccountDao {
	
	public Integer createAccount(User user)throws Exception;
	
	public Integer createAccountList(@Param("list")List<User> userList)throws Exception;
	
	public Integer updateAccount(Account account)throws Exception;
	
	public Integer updateAccountList(@Param("list")List<Account> accountList)throws Exception;
	
	public Integer delAccountByUserId(Long userId)throws Exception;
	
	public Integer delAccountListByUserIds(@Param("list")List<Long> userIds)throws Exception;
	
	public List<Account> findAccountList(Account account) throws Exception;
	
	public Integer findAccountListCount(Account account) throws Exception;
	
	public List<Account> findAccountListByIds(@Param("list")List<Long> userIds)throws Exception;
	
	public Integer findAccountListByIdsCount(@Param("list")List<Long> userIds)throws Exception;

}
