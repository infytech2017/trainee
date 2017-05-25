package com.infy.dao;

import org.springframework.web.servlet.ModelAndView;

public interface UserRegistrationDao {
	
	public String addUser();
	public ModelAndView viewUser();
	public ModelAndView editUser();
	public ModelAndView deleteUser();
		
	

}
