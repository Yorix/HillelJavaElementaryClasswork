package com.yorix.hillel.java_elementary.lesson23.sandbox;

public class Calculator {
    int add(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int mult(int x, int y) {
        return x * y;
    }

    int div(int x, int y) {
        if (y == 0)
            throw new MyCustomException();
        return x / y;
    }

    public int pow(int i) {
        return i * i;
    }
}
