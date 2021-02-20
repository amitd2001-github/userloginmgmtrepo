package com.workrig.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workrig.exception.UserNotFoundException;
import com.workrig.model.Address;
import com.workrig.model.User;
import com.workrig.service.IUserService;

@RestController
@CrossOrigin(origins = "*")
public class UserResource {
	
	@Autowired
	private IUserService userservice;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/user")
	public void registerUser(@RequestBody User user) {
		System.out.println("inside registerUser() of UserResource " + user);
		userservice.registerUser(user);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) throws UserNotFoundException {
		System.out.println("inside getUserById() of UserResource " + id);
		return userservice.getUser(id);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/user")
	public List<User> getAllUsers() {
		System.out.println("inside getAllUsers() of UserResource ");
		return userservice.getAllUsers();
		
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable int id) {
		System.out.println("inside deleteUserById() of UserResource");
		userservice.deleteUser(id);
	}
	
}

/*
 {
    "userid": 0,
    "username": "amitd",
    "password": "baby",
    "addr": {
        "addrid": 0,
        "country": "India",
        "state" : "Maharashtra",
        "city": "Pune",
        "street": "MG Road",
        "zip": 411004
    },
    "email": "amitd@gmail.com",
    "firstname": "Amit",
    "lastname": "Deshpande",
    "mobileno": "9850980543",
    "adharno": "012345678901"
}
*/

/*
 
  {
    "userid": 0,
    "username": null,
    "password": null,
    "addr": {
        "addrid": 0,
        "country": null,
        "state": null,
        "city": null,
        "street": null,
        "zip": 0
    },
    "email": null,
    "firstname": null,
    "lastname": null,
    "mobileno": null,
    "adharno": null
}
  
 */
