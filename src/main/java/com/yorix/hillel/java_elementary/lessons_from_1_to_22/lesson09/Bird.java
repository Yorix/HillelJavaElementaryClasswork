package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson09;

public class Bird extends Pet {
    private boolean canSpeak;

    public boolean getCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public void move() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void voice() {
        System.out.println("");
    }
}
