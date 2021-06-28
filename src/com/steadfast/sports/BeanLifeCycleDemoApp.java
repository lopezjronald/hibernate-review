package com.steadfast.sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        System.out.println(trackCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
