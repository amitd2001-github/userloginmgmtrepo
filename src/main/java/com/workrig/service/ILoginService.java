package com.workrig.service;

import java.util.List;

import com.workrig.model.Login;

public interface ILoginService {

	public List<Login> getAllLoggedInUsers();
	public Login getLoggedInUser(String username,String password);
	public boolean isUserAuthenticated(String username,String password);
	
}
