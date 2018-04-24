package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson09;

public class Dog extends Pet {
    private boolean speciality;

    public boolean getSpeciality() {
        return speciality;
    }

    public void setSpeciality(boolean speciality) {
        this.speciality = speciality;
    }

    @Override
    public void move() {
        System.out.println("Dog is running.");
    }

    @Override
    public void voice() {
        System.out.println("Bark-Bark!");
    }
}
