package com.workrig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workrig.dao.LoginRepository;
import com.workrig.model.Login;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private LoginRepository loginrepos;
	
	@Override
	public List<Login> getAllLoggedInUsers() {
		
		return loginrepos.findAll();
	}
	
	public Login getLoggedInUser(String username,String password) {
		Login login = loginrepos.findByUsernameAndPassword(username,password);
		return login;
	}

	@Override
	public Login isUserAuthenticated(String username, String password) {
		boolean isUserAuthenticated = false;
		Login login = getLoggedInUser(username,password);
		if(login != null) {
			if(username.equals(login.getUsername()) && password.equals(login.getPassword())) {
				isUserAuthenticated = true;
				login.setAuthenticated(isUserAuthenticated);
				return login;
			}
		}
		login = new Login();
		login.setAuthenticated(isUserAuthenticated);
		return login;
	}

	
}
