package com.yorix.hillel.java_elementary.lesson30.patterns.decorator;

public class Spicy extends PizzaDecorator {
    public Spicy(Item inner) {
        super(inner);
    }

    @Override
    public void prepare() {
        super.prepare();
        makeSpicy();
    }

    private void makeSpicy() {
        System.out.println(" + Spicy");
    }
}
