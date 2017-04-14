package autowiring.main;

import autowiring.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainAutowiredByName {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring_autowiredbyname.xml");
		
		EmployeeService serviceByName = ctx.getBean("employeeServiceByName", EmployeeService.class);
		System.out.println("Autowiring byName. Employee Name="+serviceByName.getEmployee().getName());
		ctx.close();
	}

}
