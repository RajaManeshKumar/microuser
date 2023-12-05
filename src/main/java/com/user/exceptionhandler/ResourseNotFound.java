package com.user.exceptionhandler;

public class ResourseNotFound extends RuntimeException {
	
	
	public ResourseNotFound() {
		super("Resource not found");
	}
	
	public ResourseNotFound(String message) {
		super(message);
	}

}
