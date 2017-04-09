package com.infy.core.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppSpringByBeanFactory
{
    public static void main( String[] args )
    {
        Resource res = new ClassPathResource("spring-bean.xml"); //Not using now a days, mostly application context used.
        BeanFactory factory = new XmlBeanFactory(res);
    	ExampleBean exampleBean = (ExampleBean) factory.getBean("exampleBean");
    	exampleBean.callExampleMethod();
    }
}
