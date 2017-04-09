package com.infy.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpringByApplicationContext
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");  //It loads bean definitions from XML files located in the classpath.
        //ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\sandbox\\trainee\\SpringExample\\src\\main\\resources\\spring-bean.xml"); //It loads bean definitions from XML files in the file system.
        //ApplicationContext ctx = new AnnotationConfigApplicationContext("com.infy.core.bean");  //It loads bean definitions from XML files located in the classpath.
    	ExampleBean exampleBean = (ExampleBean) ctx.getBean("exampleBean");
    	exampleBean.callExampleMethod();

        /*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                MyConfiguration.class);
        MyService service = ctx.getBean(MyService.class);
        service.currentDate();
        System.out.println("service hashcode="+service.hashCode());*/
    }
}
