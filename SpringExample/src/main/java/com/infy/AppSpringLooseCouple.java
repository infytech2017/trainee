package com.infy;

import com.infy.impl.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ravi on 07/04/2017.
 */
public class AppSpringLooseCouple {
    public static void main( String[] args )
    {
    ApplicationContext context =
            new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});

    OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
    }
}
