package com.infy.dao;

import org.springframework.web.servlet.ModelAndView;

public class CrudDaoImpl implements CrudDao{

	
	@Override
	public String addUser(){
		String message = "Add User Successfully --ChandraShobha";
		return message;
	}

	@Override
	public ModelAndView viewUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView editUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView deleteUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
