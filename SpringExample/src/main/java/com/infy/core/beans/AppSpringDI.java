package com.infy.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpringDI
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
    	ExampleBean exampleBean = (ExampleBean) ctx.getBean("exampleBean");
    	exampleBean.callExampleMethod();

        ExampleBeanBySetter exampleBeanBySetter = (ExampleBeanBySetter) ctx.getBean("exampleBeanBySetter");
        exampleBeanBySetter.callExampleMethod();

        ExampleBeanByCons exampleBeanByCons = (ExampleBeanByCons) ctx.getBean("exampleBeanByCons");
        exampleBeanByCons.callExampleMethod();
    }
}
