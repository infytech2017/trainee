package com.infy.core.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringByApplicationContext
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctxAnn = new AnnotationConfigApplicationContext(
                MyConfiguration.class);
        CurrentDate currentDate1 = ctxAnn.getBean(CurrentDate.class);
        System.out.println("currentDate1 hashCode :"+currentDate1.hashCode());
        //currentDate1.currentDate("Today's Date");

        CurrentDate currentDate2 = ctxAnn.getBean(CurrentDate.class);
        System.out.println("currentDate2 hashCode :"+currentDate2.hashCode());
        //currentDate2.currentDate("Today's Date");


        Message  message1 = ctxAnn.getBean(Message.class);
        System.out.println("message1 hashCode :"+message1.hashCode());
        Message  message2 = ctxAnn.getBean(Message.class);
        System.out.println("message2 hashCode :"+message2.hashCode());
    }
}
