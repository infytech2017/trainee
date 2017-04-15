package com.infy.core.loosecouple;

import com.infy.core.loosecouple.util.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ravi on 07/04/2017.
 */
public class AppLooseCouple {
    public static void main( String[] args )
    {
    ApplicationContext context =
            new ClassPathXmlApplicationContext(new String[] {"spring-common.xml"});

    OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
    }
}
