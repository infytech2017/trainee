package com.infy.core.autowiring.service;

import com.infy.core.autowiring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeAutowiredByTypeService {

	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired
	private Employee employee;

/*
//OR
@Autowired
	public void setEmployee(Employee emp){
		this.employee=emp;
	}*/
	
	public Employee getEmployee(){
		return this.employee;
	}
}
