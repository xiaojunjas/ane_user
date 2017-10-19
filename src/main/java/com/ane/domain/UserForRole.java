package com.ane.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserForRole {
	
	private long id;
	private String account;
	private String password;
	private String avatar;
	private int type;
	private String name;
	private long telephone;
	private int status;
	private long updateBy;
	private Date createDate;
	private Date updateDate;
	private boolean isDeleted;
	private Long schoolId;
	
	private Long userRoleId;
	private String roleName;
	private List<Long> orgIds;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(long updateBy) {
		this.updateBy = updateBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<Long> getOrgIds() {
		return orgIds;
	}
	public void setOrgIds(List<Long> orgIds) {
		this.orgIds = orgIds;
	}
	@Override
	public String toString() {
		return "UserForRole [id=" + id + ", account=" + account + ", password=" + password + ", avatar=" + avatar
				+ ", type=" + type + ", name=" + name + ", telephone=" + telephone + ", status=" + status
				+ ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", isDeleted=" + isDeleted + ", schoolId=" + schoolId + ", userRoleId=" + userRoleId + ", roleName="
				+ roleName + ", orgIds=" + orgIds + "]";
	}
	
	
	
}
