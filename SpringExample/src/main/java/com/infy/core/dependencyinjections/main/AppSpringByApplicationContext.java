package com.infy.core.dependencyinjections.main;

import com.infy.core.dependencyinjections.beans.ExampleBean;
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
    }
}
