package com.Injection.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.Coder.Demo.BeanConfig;
import com.Coder.Demo.Coder;

@SpringBootApplication
@Import({BeanConfig.class})  //used to get all bean configuration from a class 
public class SpringInjectApplication {

	public static void main(String[] args) {
		//starts all needed to run the application
		ApplicationContext context = SpringApplication.run(SpringInjectApplication.class, args);
	
		Coder c1 = (Coder) context.getBean("coder1");
		System.out.println("Name is "+ c1.getName()+" id is "+ c1.getId()+" and lauange is "+c1.getLanguage());
		System.out.println("Using "+ c1.getComputer().getBrand());
	
	}
}
