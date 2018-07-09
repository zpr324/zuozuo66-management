package com.zuozuo66.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuozuo66.management.entity.Account;
import com.zuozuo66.management.entity.CommonResult;
import com.zuozuo66.management.entity.User;
import com.zuozuo66.management.service.AccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/account")
@Api("管理-账户服务")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@ApiOperation("添加账户")
	@PostMapping("/add")
	public CommonResult<Integer> createAccountList(@RequestBody List<User> userList){
		CommonResult<Integer> result  = new CommonResult<>();
		try {
			 accountService.createAccountList(userList);
			 result.setData(1);
		} catch (Exception e) {
			result.setData(0);
			result.setMsg(e.getMessage());
			result.setStatus(400);
		}
		return result;
	}
	
	@ApiOperation("查询账户列表")
	@PostMapping("/find")
	public List<Account> findAccountList(Account account) throws Exception{
		return accountService.findAccountList(account);
	}
	
	@ApiOperation("账户操作")
	@PostMapping("/operate")
	public CommonResult<Integer> operateAccount(List<Account> accountList) throws Exception{
		Integer result = accountService.updateAccountList(accountList);
		return new CommonResult<Integer>(result); 
	}

}
