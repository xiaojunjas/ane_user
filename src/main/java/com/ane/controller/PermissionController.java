package com.ane.controller;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.PermissionDao;
import com.ane.dao.RolePermissionDao;
import com.ane.dao.UserDao;
import com.ane.dao.UserRoleDao;
import com.ane.domain.Permission;
import com.ane.domain.RolePermission;
import com.ane.domain.User;
import com.ane.domain.UserRole;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;


@RestController
@RequestMapping("/v1")
public class PermissionController {

	@Autowired
	private RolePermissionDao rolePermissionDao;
	@Autowired
	private PermissionDao permissionDao;
	@Autowired
	private UserRoleDao userRoleDao;
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/permissions/pid", method=RequestMethod.GET)
	public List<Permission> findPermissionsByPId(Long pid){
		return permissionDao.findPermissionsByPId(pid);
	}
	
	@RequestMapping(value="/permissions/user", method=RequestMethod.GET)
	public List<Permission> findMyPerMissions(String path,@RequestParam("userId") Long userId){
		User user = userDao.getUserByUserId(userId);
		path = Strings.isNullOrEmpty(path)?null:path+"%";
		List<Permission> perms = permissionDao.findPermissionsPathAndLeaf(path,null);
		if("admin".equals(user.getAccount())) return perms;
	
		List<UserRole> userRoles = userRoleDao.findRolePermissionByUserId(user.getId(),null);
		List<Long> roleIds = Lists.newArrayList();
//		List<Long> orgIds = Lists.newArrayList();
		for (UserRole userRole : userRoles) {
			if(userRole.getType().equals(1)){
				roleIds.add(userRole.getRefId());
			} /*else if(userRole.getType().equals(1)){
				orgIds.add(userRole.getRefId());
			} */
		}
		
		//个人权限校验
		Long[] userIds = {userId};
		List<RolePermission> myRolePerms =rolePermissionDao.findRolePermissions(2, userIds);
		
		//角色权限校验
		/*if(roleIds.size()>0){
			List<RolePermission> rolePerms = rolePermissionDao.findRolePermissions(1, roleIds.toArray(new Long[]{}));
			myRolePerms.addAll(rolePerms);
		}*/
		
		Set<Long> panelRolePermIdSet = myRolePerms.stream().collect(Collectors.mapping(RolePermission::getPermissionId, Collectors.toSet()));
		perms = perms.stream().filter(item->panelRolePermIdSet.contains(item.getId())).collect(Collectors.toList());
	
		return perms;
	}

}
