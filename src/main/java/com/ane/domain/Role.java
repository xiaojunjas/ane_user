package com.ane.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Role {

	private Long id;
	private String name;
	private Integer type;//角色类型 0 普通角色 1系统角色(不可删除)
	private Long schoolId;
	private String remark;
	private Integer isDeleted;// 数据有效标识 0 有效1无效/删除

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", type=" + type + ", schoolId=" + schoolId + ", remark=" + remark
				+ ", isDeleted=" + isDeleted + "]";
	}

	
}
