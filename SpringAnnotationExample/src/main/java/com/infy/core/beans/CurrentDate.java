package com.infy.core.beans;

import java.util.Date;

public class CurrentDate {
	public CurrentDate() {
		//System.out.println("Default Constructor called for Message");
	}

	public void currentDate(String msg){
		System.out.println(new Date()+"::"+msg);
	}
}
