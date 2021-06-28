package com.steadfast.sports;

public class CricketCoach implements Coach{

    private String email;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach no-args constructor created.");
    }


    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

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

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setFortuneService setter method");
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
