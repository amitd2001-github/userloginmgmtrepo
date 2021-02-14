package com.workrig.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class MyResponseEntityHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //newly added
	public final ExceptionResponse handleAllExceptions(Exception ex, WebRequest req) {
		System.out.println("inside handleAllExceptions of MyResponseEntityHandler");
		ExceptionResponse expResp = new ExceptionResponse(new Date(),ex.getMessage(),"Internal Server Error");
		//return new ResponseEntity(expResp,HttpStatus.INTERNAL_SERVER_ERROR);
		return expResp;
	}
	
	@ExceptionHandler({UserNotFoundException.class})
	@ResponseStatus(HttpStatus.NOT_FOUND) //newly added
	//public final ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException enf, WebRequest req){
	public final ExceptionResponse handleEmployeeNotFoundException(UserNotFoundException unf, WebRequest req){
		System.out.println("inside handleEmployeeNotFoundException of MyResponseEntityHandler");
		ExceptionResponse expResp = new ExceptionResponse(new Date(),unf.getMessage(),"User with a given ID is not found");
		//return new ResponseEntity(expResp,HttpStatus.NOT_FOUND);
		return expResp;
	}
	
	

}
