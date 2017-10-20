package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.UserDao;
import com.ane.dao.UserRoleDao;
import com.ane.domain.UserRole;

@RestController
@RequestMapping("/v1")
public class UserRoleController {

	@Autowired
	public UserRoleDao userRoleDao;
	
	@Autowired
	public UserDao userDao;
	
	@RequestMapping(value="/userRoles/userId/roleId", method=RequestMethod.GET)
	public List<UserRole> findRolePermissionByUserId(Long userId,Long roleId){
		return userRoleDao.findRolePermissionByUserId(userId, roleId);
	}
	
	@RequestMapping(value="/userRoles/batch", method=RequestMethod.POST)
	public Integer saveUserRoles(@RequestBody List<UserRole> userRoles){
		return userRoleDao.saveUserRoles(userRoles);
	}
	
	@RequestMapping(value="/userRoles/userId", method=RequestMethod.PUT)
	public Integer delRoleUserByUserId(Long[] delteaIds,Long roleId){
		return userRoleDao.delRoleUserByUserId(delteaIds,roleId);
	}
 
}
