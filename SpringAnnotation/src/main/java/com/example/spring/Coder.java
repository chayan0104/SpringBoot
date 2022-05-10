 package com.example.spring;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder{
	
	@Autowired // automatically inject object 
	Dog dog;
	
	
	public Coder() {
		System.out.println("Coder object created");
	}

	public void petInfo() {
		dog.info();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Coder object deleted");
	}
}
