package com.steadfast;

import com.steadfast.sports.Coach;
import com.steadfast.sports.HockeyCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve baseballCoach bean from spring container specified in applicationContext.xml file
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);

        // call methods on the bean for baseball players
        System.out.println(baseballCoach.getMyDailyWorkout());
        System.out.println(baseballCoach.getMyDailyNutritionAdvise());

        // call new method for fortunes
        System.out.println(baseballCoach.getDailyFortune());

        // retrieve trackCoach bean from spring container specified in applicationContext.xml file
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        // call methods on the bean for track athletes
        System.out.println(trackCoach.getMyDailyWorkout());
        System.out.println(trackCoach.getMyDailyNutritionAdvise());
        System.out.println(trackCoach.getDailyFortune());

        // retrieve hockeyCoach bean from spring container specified in applicationContext.xml file
        Coach hockeyCoach = context.getBean("hockeyCoach", Coach.class);

        // call methods on the bean for hockey players
        System.out.println(hockeyCoach.getMyDailyWorkout());
        System.out.println(hockeyCoach.getMyDailyNutritionAdvise());
        System.out.println(hockeyCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
