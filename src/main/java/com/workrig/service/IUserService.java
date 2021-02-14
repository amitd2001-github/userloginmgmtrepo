package com.workrig.service;

import java.util.List;

import com.workrig.exception.UserNotFoundException;
import com.workrig.model.User;

public interface IUserService {
	
	public void registerUser(User user);
	public User getUser(int id) throws UserNotFoundException;
	public List<User> getAllUsers();

}
