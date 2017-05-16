package com.beingjavaguys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.dao.CrudDaoImpl;

@Controller
public class CrudController {
String message = "Wellcome  Usaer Management!";

/*@Autowired*/
CrudDaoImpl crudDaoImpl = new CrudDaoImpl();

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
