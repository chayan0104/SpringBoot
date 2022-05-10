package com.Annotation.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.spring.Coder;
@ComponentScan("com.example.spring")
@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAnnotationApplication.class, args);
	
	Coder c1  = context.getBean(Coder.class);
	c1.petInfo();
	
	}

}
