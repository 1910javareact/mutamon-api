package com.revature.services;

import com.revature.models.User;

public interface UserService {

	public User findUserByUsernameAndPassword(String username, String password);

	public User save(User user);
}
