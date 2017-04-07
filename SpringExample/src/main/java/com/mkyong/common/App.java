package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");  //bean creation
        HelloWorld helloBean = (HelloWorld) context.getBean("helloBean"); //getting bean from container
        helloBean.printHello();
    }
}
