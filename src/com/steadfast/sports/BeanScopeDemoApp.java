package com.steadfast.sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach baseballCoachAlpha = context.getBean("baseballCoach", Coach.class);
        // scope - singleton
        System.out.println("Scope: Singleton Example");
        System.out.println(baseballCoach == baseballCoachAlpha);

        // scope - prototype
        System.out.println("Scope: Prototype Example");
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        Coach trackCoachAlpha = context.getBean("trackCoach", Coach.class);
        System.out.println(trackCoach == trackCoachAlpha);
    }
}
