package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.User;

@Mapper
public interface UserDao {
	
	public User getUserByAccount(@Param("account")String account);
	
	public List<User> listUser(@Param("start")Integer start,@Param("limit")Integer limit,@Param("query")String query);
	
	public Integer countListUser(@Param("query")String query);
	
	public Integer delUserByUserId(@Param("userId")Long userId);
	
	public User getUserByUserId(@Param("userId")Long userId);
	
	public Integer editUserByUserId(User user);
	
	public Integer loginUser(@Param("name")String name,@Param("password")String password);
	
	public Integer createUser(@Param("name")String name,@Param("password")String password);

}
