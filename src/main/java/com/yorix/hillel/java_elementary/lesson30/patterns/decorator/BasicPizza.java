package com.yorix.hillel.java_elementary.lesson30.patterns.decorator;

public class BasicPizza implements Item {

    @Override
    public void prepare() {
        makeBasicPizza();
    }

    private void makeBasicPizza() {
        System.out.println(" Basic Pizza");
    }
}
