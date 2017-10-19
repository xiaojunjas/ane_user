package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.RolePermission;
@Mapper
public interface RolePermissionDao {

	Long saveRolePermission(RolePermission rolePermission);
	
	Integer saveRolePermissionBatch(@Param("list") List<RolePermission> list);
	
	List<RolePermission> findRolePermissions(@Param("type")Integer type,@Param("refIds")Long[] refIds);
	
	Integer removeRolePermissionsByRefId(@Param("permIds")Long[] permIds,@Param("type")Integer type,@Param("refId")Long refId);

}
