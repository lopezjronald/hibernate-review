package com.steadfast.sports;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    @Override
    public String getMyDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getMyDailyNutritionAdvise() {
        return "Get those greens and protein!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
