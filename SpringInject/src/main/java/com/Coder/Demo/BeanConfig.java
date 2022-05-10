package com.Coder.Demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public Coder coder1(@Qualifier("computer1")Computer computer) {
		Coder c1 = new Coder(1000,"Ram","Java",computer);
		
//		c1.setId(1000);
//		c1.setName("Ram");
//		c1.setLanguage("Java");
//		c1.setComputer(computer);
		
		return c1;
		
	}
	
	
	
	@Bean
	public Computer computer1() {
		Computer com1 = new Computer("Asus");
	//	com1.setBrand("Asus");
		
		return com1;
		
		
	}

}
