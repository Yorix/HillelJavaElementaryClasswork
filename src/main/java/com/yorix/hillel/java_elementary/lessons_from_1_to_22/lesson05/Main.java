package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson05;

public class Main {
    public static void main(String[] args) {
        double len = MathModule.lenCircle(3);
        double sqr = MathModule.sqrCircle(3);

        System.out.println(len + "\n" + sqr);

        int i = 4;
        int k = i++ + ++i;
        System.out.println(k);
        System.out.println(i);
    }
}
