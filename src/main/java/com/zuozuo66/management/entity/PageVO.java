package com.zuozuo66.management.entity;

import java.io.Serializable;

public class PageVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8812345405861971875L;
	
	private Integer curPage;
	
	private Integer pageSize;
	
	private Integer startIndex;
	
	private Integer endIndex;

	public Integer getCurPage() {
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

}
