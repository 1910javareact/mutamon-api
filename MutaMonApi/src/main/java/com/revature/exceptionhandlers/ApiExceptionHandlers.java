package com.revature.exceptionhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandlers {
	
	@ExceptionHandler(value = {NullPointerException.class})
	public ResponseEntity<Object> DoesNotExist(NullPointerException e){
		System.out.println(e);
		return new ResponseEntity<Object>("The Resource Does Not Exist", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {Throwable.class})
	public ResponseEntity<Object> catchAll(Throwable e){
		System.out.println(e);
		return new ResponseEntity<Object>("something Went Wrong", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}