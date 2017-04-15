package com.infy.core.dependencyinjections.main;

import com.infy.core.dependencyinjections.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppXmlBean
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");  //domain creation
        HelloWorld helloBean = (HelloWorld) context.getBean("helloBean"); //getting domain from container
        helloBean.printHello();
    }
}
