package com.ane.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.Role;

@Mapper
public interface RoleDao {
	
	public Role getRoleById(@Param("id")Long id);
	
	public Integer countRoles(@Param("query")String query);
	
	public List<Role> findRoles( 
			@Param("query")String query,
			@Param("start")Integer start, 
			@Param("limit")Integer limit);
	
	public Integer saveRole(Role role);
	
	public Integer updateRole(Role role);
	
	public Integer updateRoleSelected(Role role);

}
