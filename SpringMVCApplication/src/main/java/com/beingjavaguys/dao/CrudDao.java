package com.beingjavaguys.dao;

import org.springframework.web.servlet.ModelAndView;

public interface CrudDao {
	
	public String addUser();
	public ModelAndView viewUser();
	public ModelAndView editUser();
	public ModelAndView deleteUser();
		
	

}
