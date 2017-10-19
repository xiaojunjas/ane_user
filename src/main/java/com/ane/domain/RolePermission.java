package com.ane.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RolePermission {

	private Long id;
	private Long permissionId;
	private Integer type;
	private Long refId;
	private Long schoolId;
	private Integer isDeleted;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
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
		return "RolePermission [id=" + id + ", permissionId=" + permissionId + ", type=" + type + ", refId=" + refId
				+ ", schoolId=" + schoolId + ", isDeleted=" + isDeleted + "]";
	}
	
	
}
