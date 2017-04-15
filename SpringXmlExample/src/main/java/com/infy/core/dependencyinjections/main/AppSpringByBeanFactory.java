package com.infy.core.dependencyinjections.main;

import com.infy.core.dependencyinjections.beans.ExampleBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppSpringByBeanFactory
{
    public static void main( String[] args )
    {
        Resource res = new ClassPathResource("spring-bean.xml"); //Not using now a days, mostly application context used.
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
    	ExampleBean exampleBean = (ExampleBean) factory.getBean("exampleBean");
    	exampleBean.callExampleMethod();
    }
}
