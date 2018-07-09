package com.zuozuo66.management.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zuozuo66.management.entity.User;

@Mapper
public interface UserDao {
	
	public Map<String, Object> findUserById(@Param("id")Long id);
	
	public User login(@Param("user")User user)throws Exception;
	
	public Long addUser(@Param("user")User user)throws Exception;
	
	public Integer updateUser(@Param("user")User user)throws Exception;
	
	public Integer delUser(@Param("user")User user)throws Exception;
	
	public List<User> findUserList(@Param("user")User user)throws Exception;
	
	public User findUserByExample(@Param("user")User user)throws Exception;

}
