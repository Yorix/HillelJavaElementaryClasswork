package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson12.test;

public class ExtCalc {
    private int a;
    private int b;

    public ExtCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int mul() {
        return a * b;
    }

    public int div() {
        return a / b;
    }

    public int power() {
        return b * b;
    }
}
