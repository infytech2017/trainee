package autowiring.main;

import autowiring.service.EmployeeAutowiredByTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowiredAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_autowired_annotation.xml");
		//Testing @Autowired annotations
		EmployeeAutowiredByTypeService autowiredByTypeService = ctx.getBean("employeeAutowiredByTypeService",EmployeeAutowiredByTypeService.class);

		System.out.println("@Autowired byType. Employee Name="+autowiredByTypeService.getEmployee().getName());
	}
}
