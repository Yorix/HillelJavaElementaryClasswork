package com.yorix.hillel.java_elementary.lesson30.patterns.decorator;

public class DeepFried extends PizzaDecorator {
    public DeepFried(Item inner) {
        super(inner);
    }

    @Override
    public void prepare() {
        super.prepare();
        makeDeepFried();
    }

    private void makeDeepFried() {
        System.out.println(" + Deep Fried");
    }
}
