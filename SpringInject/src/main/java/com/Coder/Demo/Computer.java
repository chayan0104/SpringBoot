package com.Coder.Demo;

import javax.annotation.PreDestroy;

public class Computer {
	private String brand;

	//no argument constructor
	public Computer() {
		super();
		System.out.println("No argument constructor - Computer class");
	}

	
	//argument constructor
	public Computer(String brand) {
		super();
		
		this.brand = brand;
		System.out.println("all argument constructor - Computer class");
	}
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	@PreDestroy
	public void destroy() {
		System.out.println("Computer class destroyed");
	}
	
	

}
