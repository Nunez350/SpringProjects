package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	//@GetMapping(path = "/hello-world")

	public StringBuilder helloWorld() {
		String hello = "hello world";
		StringBuilder sb1 = new StringBuilder("hello world");
//	 sb1.reverse();
		return sb1.reverse();
	}


	@GetMapping(path= "/hello-world-bean")
	public  HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world");
	}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
			return new HelloWorldBean(String.format("Hello World , %s",name));
		}
	
	
	

}
