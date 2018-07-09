package com.zuozuo66.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zuozuo66.management.entity.CommonResult;
import com.zuozuo66.management.entity.User;
import com.zuozuo66.management.service.UserService;
import com.zuozuo66.management.util.BaseUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(value="用户接口")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value="用户登录",notes="获取用户登录信息")
	@RequestMapping(value="/login",method=RequestMethod.GET )
	public CommonResult<Integer> login(User user) throws Exception {
		return userService.login(user);
	}
	

	@ApiOperation(value="添加用户",notes="添加用户信息")
	@RequestMapping(value="/add",method=RequestMethod.POST )
	public Integer addUser(User user) throws Exception {
		return userService.addUser(user);
	}

	@ApiOperation(value="更新用户",notes="更新用户信息")
	@RequestMapping(value="/update",method=RequestMethod.POST )
	public Integer updateUser(User user) throws Exception {
		return userService.updateUser(user);
	}

	@ApiOperation(value="删除用户",notes="删除用户")
	@RequestMapping(value="/del",method=RequestMethod.POST )
	public Integer delUser(User user) throws Exception {
		return userService.delUser(user);
	}
	
	@ApiOperation(value="sayHello",code=123)
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "hello world";
	}
	
	@ApiOperation(value="getUserId",notes="获取当前用户ID")
	@GetMapping("/getUserId")
	public Long getCurUserId() {
		return BaseUtil.getCurrentUerId();
	}

}
