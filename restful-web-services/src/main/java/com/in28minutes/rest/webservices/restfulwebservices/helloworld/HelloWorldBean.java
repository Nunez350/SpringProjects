package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	private String message;
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message) {
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

	
	
}
