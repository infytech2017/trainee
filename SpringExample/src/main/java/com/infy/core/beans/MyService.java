package com.infy.core.beans;

import java.util.Date;

public class MyService {

	public void currentDate(String msg){
		System.out.println(new Date()+"::"+msg);
	}
}
