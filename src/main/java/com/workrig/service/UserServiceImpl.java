package com.workrig.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workrig.dao.LoginRepository;
import com.workrig.dao.UserRepository;
import com.workrig.exception.UserNotFoundException;
import com.workrig.model.Login;
import com.workrig.model.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userrepos;
	
	@Autowired
	private LoginRepository loginrepos;
	
	@Override
	public void registerUser(User user) {
		System.out.println("inside registerUser() of UserServiceImpl " + user);
		userrepos.save(user);
		//Also add the record in Login table
		Login login = new Login();
		login.setUsername(user.getUsername());
		login.setPassword(user.getPassword());
		loginrepos.save(login);

	}

	@Override
	public User getUser(int id) throws UserNotFoundException {
		System.out.println("inside getUser() of UserServiceImpl " + id);
		Optional<User> opuser = userrepos.findById(id);
		if(opuser.isPresent())
		{
		 return opuser.get();
		}else {
			throw new UserNotFoundException("The User with this id is not registered yet");
		}
		
	}

	@Override
	public List<User> getAllUsers() {
		System.out.println("inside getAllUsers() of UserServiceImpl ");
		return userrepos.findAll();
	}

}
