package autowiring.main;

import autowiring.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowiredByType {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_autowiredbytype.xml");
		EmployeeService employeeServiceByType = ctx.getBean("employeeServiceByType", EmployeeService.class);
		System.out.println("Autowiring byType. Employee Name="+employeeServiceByType.getEmployee().getName());
	}
}
