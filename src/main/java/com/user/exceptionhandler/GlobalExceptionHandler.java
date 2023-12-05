package com.user.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(ResourseNotFound.class)
	public ResponseEntity<ApiResponse> handlerExceptionNotFoundException(ResourseNotFound ex){
		String message=ex.getMessage();
		ApiResponse response=ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		return new  ResponseEntity<ApiResponse>(HttpStatus.NOT_FOUND);
		
	}
}
