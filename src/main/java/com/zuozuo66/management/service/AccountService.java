package com.zuozuo66.management.service;

import java.util.List;


import com.zuozuo66.management.entity.Account;
import com.zuozuo66.management.entity.User;

public interface AccountService {
	/**
	 * @describe 创建账户
	 * @param  User 用户
	 * @return Integer 成功标识
	 * @throws Exception
	 * @author zpr324
	 */
	public Integer createAccount(User user) throws Exception;
	
	/**
	 * @describe 创建账户
	 * @param  list<User>用户集合
	 * @return Integer 成功标识
	 * @throws Exception
	 * @author zpr324
	 */
	public Integer createAccountList(List<User> userList) throws Exception;
	
	/**
	 * @describe 更新账户集合
	 * @param  List<Account> 账户集合
	 * @return Integer 成功标识
	 * @throws Exception
	 * @author zpr324
	 */
	public Integer updateAccountList(List<Account> accountList) throws Exception;

	/**
	 * @describe 删除账户集合
	 * @param  List<Account> 账户集合
	 * @return Integer 成功标识
	 * @throws Exception
	 * @author zpr324
	 */
	public Integer delAccountList(List<Account> accountList) throws Exception;
	
	/**
	 * @describe 根据条件查询账户列表
	 * @param  Account 账户
	 * @return List<Account> 账户集合
	 * @throws Exception
	 * @author zpr324
	 */
	public List<Account> findAccountList(Account account) throws Exception;
}
