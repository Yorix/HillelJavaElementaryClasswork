package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson09;

public class Cat extends Pet {
    private boolean canCatchMice;

    public boolean getCanCatchMice() {
        return canCatchMice;
    }

    @Override
    public void move() {
        System.out.println("Cat is jumping.");
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }
}
