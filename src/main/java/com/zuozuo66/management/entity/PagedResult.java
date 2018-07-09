package com.zuozuo66.management.entity;

import java.io.Serializable;
import java.util.List;

public class PagedResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5793127235132450917L;
	
	
	private Integer totalNum;
	
	private Integer pageCount;
	
	private Integer pageSize;
	
	private Integer pageNum;
	
	private List<T> result;

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}
	
	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}
	
}
