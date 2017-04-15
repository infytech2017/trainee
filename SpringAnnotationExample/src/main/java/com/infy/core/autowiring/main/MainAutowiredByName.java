package com.infy.core.autowiring.main;

import com.infy.core.autowiring.service.EmployeeService;
import com.infy.core.autowiring.service.EmployeeService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowiredByName {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_autowiredbyname.xml");
		EmployeeService serviceByName = ctx.getBean("employeeServiceByName", EmployeeService.class);
		System.out.println("Autowiring byName. Employee Name="+serviceByName.getEmployee().getName());

		EmployeeService1 serviceByName1 = ctx.getBean("employeeServiceByName1", EmployeeService1.class);
		System.out.println("Autowiring byName. Employee Name="+serviceByName1.getEmployee1().getName());
	}
}
