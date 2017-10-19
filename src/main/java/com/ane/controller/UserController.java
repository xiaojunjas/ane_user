package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.UserDao;
import com.ane.domain.User;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	public UserDao userDao;
	
	@RequestMapping(value="/user/account", method=RequestMethod.GET)
	public User getUserByAccount(String account){
		return userDao.getUserByAccount(account);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> listUser(Integer start,Integer limit,String query){
		return userDao.listUser(start,limit,query);
	}
	
	@RequestMapping(value="/users/count", method=RequestMethod.GET)
	public Integer countListUser(String query){
		return userDao.countListUser(query);
	}
	
	@RequestMapping(value="/user/userId", method=RequestMethod.DELETE)
	public Integer delUserByUserId(Long userId){
		return userDao.delUserByUserId(userId);
	}
	
	@RequestMapping(value="/user/id", method=RequestMethod.GET)
	public User getUserByUserId(Long userId){
		return userDao.getUserByUserId(userId);
	}
	
	@RequestMapping(value="/user/userId", method=RequestMethod.PUT)
	public Integer editUserByUserId(@RequestBody User user){
		return userDao.editUserByUserId(user);
	}
	
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public Integer loginUser(String name,String password){
		return userDao.loginUser(name,password);
	}
	
	@RequestMapping(value="/user/create", method=RequestMethod.POST)
	public Integer createUser(String name,String password){
		return userDao.createUser(name,password);
	}
}
