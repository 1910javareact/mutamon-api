package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService {

	private UserDao ud;
	
	@Autowired
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
	}
	
	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		return ud.findUserByUsernameAndPassword(username, password);
	}

}
