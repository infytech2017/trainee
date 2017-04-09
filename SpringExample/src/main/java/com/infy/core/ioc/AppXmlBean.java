package com.infy.core.ioc;

import com.infy.core.ioc.domain.HelloWorld;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");  //domain creation
        HelloWorld helloBean = (HelloWorld) context.getBean("helloBean"); //getting domain from container
        helloBean.printHello();
    }
}
