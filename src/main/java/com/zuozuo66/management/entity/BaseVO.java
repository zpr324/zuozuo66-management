package com.zuozuo66.management.entity;

import java.io.Serializable;

public class BaseVO implements Serializable {

	private static final long serialVersionUID = 7813837053258175153L;
	
	private Long id;
	
	private Long createBy;
	
	private String createByUsername;
	
	private String creationDate;
	
	private Long updateBy;
	
	private String updateByUsername;
	
	private String updateDate;
	
	private Integer status;
	
	private String enableFlag;
	
	private String startDate;
	
	private String endDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	

	public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCreateByUsername() {
		return createByUsername;
	}

	public void setCreateByUsername(String createByUsername) {
		this.createByUsername = createByUsername;
	}

	public String getUpdateByUsername() {
		return updateByUsername;
	}

	public void setUpdateByUsername(String updateByUsername) {
		this.updateByUsername = updateByUsername;
	}
	
}
