package com.beingjavaguys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//hello.html--> hello.showMessage();
//morning.html--> hello.showmorningMessage();
//afternoon.html--> hello.showafternoonMessage();
//evening.html--> hello.showEveenjinhMessage();

@Controller
public class Hello {
	String message = "Hello Friends !";

	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("from controller");
		return new ModelAndView("hello", "message", message);
	}
	
	@RequestMapping("/morning")
	public ModelAndView showMorningMessage() {
		System.out.println("from controller");
		message="Good Morning";
		return new ModelAndView("hello", "message", message);	
	}
	
	@RequestMapping("/afternoon")
	public ModelAndView showAfterMessage() {
		System.out.println("from controller");
		message="Good Afternoon";
		return new ModelAndView("hello", "message", message);		
		// /hello.html--> home.showMessage();
	}
	
	@RequestMapping("/evening")
	public ModelAndView showEveningMessage() {
		System.out.println("from controller");
		message="Good Evening";
		return new ModelAndView("hello", "message", message);		
		// /hello.html--> home.showMessage();
	}
}
