package com.zuozuo66.management.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zuozuo66.management.constant.CommonConstant;
import com.zuozuo66.management.dao.UserDao;
import com.zuozuo66.management.entity.CommonResult;
import com.zuozuo66.management.entity.User;
import com.zuozuo66.management.service.AccountService;
import com.zuozuo66.management.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AccountService accountService;
                                                                               
	@Override
	public CommonResult<Integer> login(User user) throws Exception {
		User loginUser = userDao.login(user);
		CommonResult<Integer> result = new CommonResult<>();
		if (loginUser != null) {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
					.getRequestAttributes()).getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("userId", loginUser.getId());
			result.setData(1);
		}else {
			result.setMsg(CommonConstant.FAIL);
			result.setData(0);
		}
		return result;
	}
	
	@Override
	public CommonResult<Integer> logout() throws Exception {
		CommonResult<Integer> result = new CommonResult<>();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("userId", null);
		result.setData(1);
		return result;
	}

	@Override
	@Transactional()
	public Integer addUser(User user) throws Exception {
		User existUser = userDao.findUserByExample(user);
		if (existUser != null) {
			return 0;
		}else {
			userDao.addUser(user);
			accountService.createAccount(user);
			return 1;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	}

	@Override
	public Integer updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	}

	@Override
	public Integer delUser(User user) throws Exception {
		return userDao.delUser(user);
	}

	@Override
	public List<User> findUserList(User user) throws Exception {
		return userDao.findUserList(user);
	}

}
