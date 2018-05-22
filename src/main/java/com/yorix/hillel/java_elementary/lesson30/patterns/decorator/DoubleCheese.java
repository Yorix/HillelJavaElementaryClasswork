package com.yorix.hillel.java_elementary.lesson30.patterns.decorator;

public class DoubleCheese extends PizzaDecorator {
    public DoubleCheese(Item inner) {
        super(inner);
    }

    @Override
    public void prepare() {
        super.prepare();
        makeDoubleCheese();
    }

    private void makeDoubleCheese() {
        System.out.println(" + Double Cheese");
    }
}
