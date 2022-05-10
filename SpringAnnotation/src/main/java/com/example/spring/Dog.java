package com.example.spring;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component //it will create an object and store in memory 
public class Dog {
	
		
	public Dog() {
		System.out.println("Dog object created");
	}

	public void info() {
		System.out.println("German Shepered");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Dog object Deleted");
	}

}
