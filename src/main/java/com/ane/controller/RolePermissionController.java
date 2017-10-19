package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.RolePermissionDao;
import com.ane.domain.RolePermission;


@RestController
@RequestMapping("/v1")
public class RolePermissionController {

	@Autowired
	public RolePermissionDao rolePermissionDao;
	
	@RequestMapping(value="/rolePermissions", method=RequestMethod.POST)
	public Long saveRolePermissions(@RequestBody RolePermission rolePermission){
		return rolePermissionDao.saveRolePermission(rolePermission);
	}
	
	@RequestMapping(value="/rolePermissions/batch", method=RequestMethod.POST)
	public Integer saveRolePermissions(@RequestBody List<RolePermission> list){
		return rolePermissionDao.saveRolePermissionBatch(list);
	}
	
	@RequestMapping(value="/rolePermissions", method=RequestMethod.GET)
	public List<RolePermission> findRolePermissions(Integer type,Long... refIds){
		return rolePermissionDao.findRolePermissions(type, refIds);
	}
	
	@RequestMapping(value="/rolePermissions", method=RequestMethod.DELETE)
	public Integer removeRolePermissionsByRefId(Long[] permIds,Integer type,Long refId){
		return rolePermissionDao.removeRolePermissionsByRefId(permIds, type, refId);
	}
	
	
	

}
