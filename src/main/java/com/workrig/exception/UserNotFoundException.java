package com.workrig.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)   //404 Not Found
public class UserNotFoundException extends Exception {
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
