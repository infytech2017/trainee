package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infy.dao.UserRegistrationDaoImpl;

@Controller
public class UserRegistrationController {
String message = "Wellcome  Usaer Management!";

/*@Autowired*/
UserRegistrationDaoImpl crudDaoImpl = new UserRegistrationDaoImpl();

@RequestMapping("/AddUser")
public ModelAndView addUser(){
    message = crudDaoImpl.addUser();
	return new ModelAndView("AddUser","msgAdd",message);
}
	
@RequestMapping("/ViewUser")
public ModelAndView viewUser(){
message = "View User Successfully";
	return new ModelAndView("ViewUser","msgView",message);
}
@RequestMapping("/EditUser")
	public ModelAndView editUser(){
	message = "Edit User Successfully";
		return new ModelAndView("EditUser","msgEdit",message);
	}
@RequestMapping("/DeleteUser")
	public ModelAndView deleteUser(){
	message = "Delete User Successfully";
		return new ModelAndView("DeleteUser","msgDelete",message);
	}
	//---------------------------------------------------------------//



}
