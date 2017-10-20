package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.UserRole;

@Mapper
public interface UserRoleDao {
	
	public List<UserRole> findRolePermissionByUserId(@Param("userId")Long userId,@Param("roleId")Long roleId);
	
	public Integer delRoleUserByUserId(@Param("delteaIds")Long[] delteaIds, @Param("roleId")Long roleId);
	
	public Integer saveUserRoles(@Param("userRoles") List<UserRole> userRoles);
	
} 
 