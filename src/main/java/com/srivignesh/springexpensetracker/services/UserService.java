package com.srivignesh.springexpensetracker.services;

import com.srivignesh.springexpensetracker.models.User;

public interface UserService {
	public User createUser(User user);
	public User getUserByUsername(String username);
	public User saveUser(User user);
}
