package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson12.test;

public class SuperCalc {
    private BaseCalc baseCalc;
    private ExtCalc extCalc;

    public SuperCalc(int a, int b) {
        this.baseCalc = new BaseCalc(a, b);
        this.extCalc = new ExtCalc(a, b);
    }

    public int add() {
        return baseCalc.add();
    }

    public int sub() {
        return baseCalc.sub();
    }

    public int mul() {
        return extCalc.mul();
    }

    public int div() {
        return extCalc.div();
    }

    public int power() {
        return baseCalc.power();
    }
}
