package com.doak.stringbootMybatisdemo2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doak.stringbootMybatisdemo2.entity.User;
import com.doak.stringbootMybatisdemo2.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	
	public User selectUser(User user){
		return  userMapper.selectUser(user.getUserName(), user.getPassword());
	}

	
}
