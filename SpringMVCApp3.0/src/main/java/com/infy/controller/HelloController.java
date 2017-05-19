package com.infy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//hello.html--> hello.showMessage();
//morning.html--> hello.showmorningMessage();
//afternoon.html--> hello.showafternoonMessage();
//evening.html--> hello.showEveenjinhMessage();

@Controller
public class HelloController {
	String message = "Hello Friends !";

	@RequestMapping("/hello")
	public ModelAndView showHelloMessage() {
		System.out.println("from controller");
		message = "Hello Friends !";
		return new ModelAndView("hello", "msgHello", message);
	}
	
	@RequestMapping("/morning")
	public ModelAndView showMorningMessage() {
		System.out.println("from controller");
		message="Sheshji, Good Morning";
		return new ModelAndView("morning", "msgMor", message);	
	}
	
	@RequestMapping("/afternoon")
	public ModelAndView showAfternoonMessage() {
		System.out.println("from controller");
		message="Chanda, Good Afternoon";
		return new ModelAndView("afternoon", "msgAft", message);		
		// /hello.html--> home.showMessage();
	}
	
	@RequestMapping("/evening")
	public ModelAndView showEveningMessage() {
		System.out.println("from controller");
		message="Good Evening";
		return new ModelAndView("evening", "msgEvn", message);
		}	
		// /hello.html--> home.showMessage();
		
		@RequestMapping("/shesh")
		public ModelAndView showSheshMessage() {
			System.out.println("from controller");
			message="Hi guys R u free?";
			return new ModelAndView("shesh", "msgShe", message);		
	}
}
