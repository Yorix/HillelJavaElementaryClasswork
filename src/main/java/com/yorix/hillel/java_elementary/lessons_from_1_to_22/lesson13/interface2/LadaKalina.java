package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson13.interface2;

public class LadaKalina implements Car {
    @Override
    public void move() {

    }

    @Override
    public String getMark() {
        return "Lada Kalina";
    }

    @Override
    public boolean fix() {
        return true;
    }

    @Override
    public boolean check() {
        return true;
    }
}
