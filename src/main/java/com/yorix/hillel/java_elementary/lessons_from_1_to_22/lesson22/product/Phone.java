package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson22.product;

public class Phone extends Product{
    private int displaySize;

    public Phone(int displaySize, String name, int price) {
        super(name, price);
        this.displaySize = displaySize;
    }
}
