package com.steadfast.sports;

public class HockeyCoach implements Coach{

    private FortuneService fortuneService;

    public HockeyCoach(){
    }

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getMyDailyWorkout() {
        return "Some type of hockey practice move with skating";
    }

    @Override
    public String getMyDailyNutritionAdvise() {
        return "Hydrate!!!";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it!!! " + fortuneService.getFortune();
    }
}
