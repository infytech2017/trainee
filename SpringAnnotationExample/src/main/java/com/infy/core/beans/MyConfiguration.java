package com.infy.core.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value="com.infy.core.beans")
public class MyConfiguration {

	@Bean
	public CurrentDate getCurrentDate(){
		return new CurrentDate();
	}

	@Bean
	@Scope("prototype")
	public Message getMessage(){
		return new Message();
	}
}
