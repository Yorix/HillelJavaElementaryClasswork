package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson11;

public class BaseCalc {

    private int a;
    private int b;

    public BaseCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int mul() {
        return a * b;
    }

    public long pow(int a) {
        return a * a;
    }
}