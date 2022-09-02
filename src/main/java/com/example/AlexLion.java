package com.example;

import java.util.List;

public class AlexLion extends Lion {

    private Feline feline;
    boolean hasMane;

    public AlexLion(String sex, Feline feline) throws Exception {
        super(sex, feline);
        if("Самец".equals(sex)) {
            hasMane = true;
        } else {
            throw new Exception("Алекс может быть только самцом");
        }
    }

    public List<String> getFriends() {
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
