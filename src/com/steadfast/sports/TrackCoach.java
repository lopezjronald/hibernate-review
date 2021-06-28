package com.steadfast.sports;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getMyDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getMyDailyNutritionAdvise() {
        return "Eat your greens!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanUpStuffYOYO() {
        System.out.println("TrackCoach: inside method doMyCleanUpStuffYOYO");
    }
}
