package com.steadfast.sports;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getMyDailyWorkout() {
        return "Batting cage practice for 30 minutes";
    }

    @Override
    public String getMyDailyNutritionAdvise() {
        return "Get your lean proteins in!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
