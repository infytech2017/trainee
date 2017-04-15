package autowiring.service;

import autowiring.model.Employee;

public class EmployeeService1 {

	private Employee employee1;

	// constructor is used for autowiring by constructor
	public EmployeeService1(Employee emp) {
		System.out.println("Autowiring by constructor used");
		this.employee1 = emp;
	}

	// default constructor to avoid BeanInstantiationException for autowiring
	// byName or byType
	public EmployeeService1() {
		System.out.println("Default Constructor used");
	}

	// used for autowire byName and byType
	public void setEmployee1(Employee emp) {
		this.employee1 = emp;
	}

	public Employee getEmployee1() {
		return this.employee1;
	}
}
