package com.steadfast.sports;

import java.util.ArrayList;

public class HappyFortuneService implements FortuneService{

    private ArrayList<String> randomFortune = new ArrayList<>();

    @Override
    public String getFortune() {
        this.randomFortune.add("Today is your lucky day!!!!");
        this.randomFortune.add("Crush it!!!!");
        this.randomFortune.add("Just do it!!!!");
        int num = (int) (Math.random() * randomFortune.size());
        return this.randomFortune.get(num);
    }
}
