package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson22.product;

public class Camera extends Product{
    private int pixels;


    public Camera(int pixels, String name, int price) {
        super(name, price);
        this.pixels = pixels;
    }
}
