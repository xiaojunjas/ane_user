package com.ane.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserRole {

	private Long id;
	private Long userId;
	private Integer type; //0用户角色  1组织角色
	private Long refId;
	private Long schoolId;
	private Integer isDeleted;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Long getRefId() {
		return refId;
	}
	public void setRefId(Long refId) {
		this.refId = refId;
	}
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", userId=" + userId + ", type=" + type + ", refId=" + refId + ", schoolId="
				+ schoolId + ", isDeleted=" + isDeleted + "]";
	}
	
	
}
