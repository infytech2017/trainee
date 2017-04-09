package com.infy.core.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(value="com.infy.core.beans")
public class MyConfiguration {

	@Bean
	public MyService getService(){
		return new MyService();
	}
}
