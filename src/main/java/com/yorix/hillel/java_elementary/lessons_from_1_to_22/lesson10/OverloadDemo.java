package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson10;

public class OverloadDemo {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(2.5, 1.5));
    }
}
