package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.RoleDao;
import com.ane.domain.Role;

@RestController
@RequestMapping("/v1")
public class RoleController {

	@Autowired
	public RoleDao roleDao;
	
	@RequestMapping(value="/roles/{id}", method=RequestMethod.GET)
	public Role getRoleById(@PathVariable("id")Long id){
		return roleDao.getRoleById(id);
	}
	
	@RequestMapping(value="/roles/count", method=RequestMethod.GET)
	public Integer countRoles(String query){
		return roleDao.countRoles(query);
	}
	
	@RequestMapping(value="/roles", method=RequestMethod.GET)
	public List<Role> findRoles(String query,Integer start,Integer limit){
		return roleDao.findRoles(query, start, limit);
	}
	
	@RequestMapping(value="/roles", method=RequestMethod.POST)
	public Long saveRole(@RequestBody Role role){
		roleDao.saveRole(role);
		return role.getId();
	}
	
	@RequestMapping(value="/roles", method=RequestMethod.PUT)
	public Integer updateRole(@RequestBody Role role){
		return roleDao.updateRole(role);
	}
	
	@RequestMapping(value="/roles", method=RequestMethod.PATCH)
	public Integer updateRoleSelected(@RequestBody Role role){
		return roleDao.updateRoleSelected(role);
	}
	
	
}
