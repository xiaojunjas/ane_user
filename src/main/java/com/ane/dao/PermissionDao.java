package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.Permission;
@Mapper
public interface PermissionDao {

//	Permission getPermissionById(@Param("id") Long id);

	List<Permission> findPermissionsByPId(@Param("pid") Long pid);

	List<Permission> findPermissionsPathAndLeaf(@Param("path")String path, @Param("leaf")Integer leaf);

}
