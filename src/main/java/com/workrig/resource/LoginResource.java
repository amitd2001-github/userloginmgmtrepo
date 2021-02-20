package com.workrig.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.workrig.model.Login;
import com.workrig.model.User;
import com.workrig.service.ILoginService;


@RestController
@CrossOrigin(origins = "*")
public class LoginResource {
	
	@Autowired
	private ILoginService loginservice;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/login")
	public List<Login> getAllUsers() {
		System.out.println("inside getAllUsers() of UserResource ");
		return loginservice.getAllLoggedInUsers();
		
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/checklogin/{username}/{password}")
	public Login checkCredentials(@PathVariable String username, @PathVariable String password) {
		System.out.println("inside checkCredentials() of LoginResource ");
		return loginservice.isUserAuthenticated(username, password);
		
	}
}
