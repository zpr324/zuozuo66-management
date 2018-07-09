package com.zuozuo66.management.entity;


public class User extends BaseVO {

	private static final long serialVersionUID = -9201557553084695998L;
	
	//用户ID
	private Long userId;
	
	//用户名
	private String username;
	
    //密码
	private String password;
	
	//手机号码
	private String telephone;
	
	//验证码
	private String captchaCode;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
