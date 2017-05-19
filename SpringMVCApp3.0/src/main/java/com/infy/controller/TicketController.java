package com.infy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TicketController {

		String message = "Hello sir/mam !";

		@RequestMapping("/tinsert")
		public ModelAndView showTinsertMessage() {
			System.out.println("This is Tinsert method");
			message = "Hello insert the data !";
			return new ModelAndView("tinsert", "msgTins", message);
		}
		
		@RequestMapping("/tconform")
		public ModelAndView showConformMessage() {
			System.out.println("This is conform method");
			message="Your ticket booking successfull";
			return new ModelAndView("tconform", "msgCon", message);	
		}
		
		@RequestMapping("/tupdate")
		public ModelAndView showTupdateMessage() {
			System.out.println("This is T update method");
			message="Your data is updated successfully";
			return new ModelAndView("tupdate", "msgTup", message);		
			
		}
		@RequestMapping("/tcancle")
		public ModelAndView showTcanclrMessage() {
			System.out.println("This is cancle method");
			message="Your ticket cancle successfull";
			return new ModelAndView("tcancle", "msgTca", message);
			}	
			// /hello.html--> home.showMessage();
			
			@RequestMapping("/tcurrent")
			public ModelAndView showTcurrentMessage() {
				System.out.println("This is current method");
				message="Check your current status";
				return new ModelAndView("tcurrent", "msgTcu", message);		
		}
	}



