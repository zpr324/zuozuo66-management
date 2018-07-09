package com.zuozuo66.management.entity;

import java.io.Serializable;

import com.zuozuo66.management.constant.CommonConstant;

public class CommonResult<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1358059489975406788L;

	public CommonResult() {
		super();
	}
	
	public CommonResult(T data) {
		super();
		this.data = data;
	}

	private String msg = CommonConstant.SUCCESS;
	
	private T data;
	
	private Integer status = 200;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
