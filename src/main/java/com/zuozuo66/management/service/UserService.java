package com.zuozuo66.management.service;

import java.util.List;

import com.zuozuo66.management.entity.CommonResult;
import com.zuozuo66.management.entity.User;

public interface UserService {
	
	
	public CommonResult<Integer> login(User user)throws Exception;
	
	public CommonResult<Integer> logout()throws Exception;
	
	public Integer addUser(User user)throws Exception;
	
	public Integer updateUser(User user)throws Exception;
	
	public Integer delUser(User user)throws Exception;
	
	public List<User> findUserList(User user)throws Exception;

}
