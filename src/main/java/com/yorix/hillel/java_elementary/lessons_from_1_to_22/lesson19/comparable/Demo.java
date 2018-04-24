package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson19.comparable;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Car[] arr = new Car[] {
                new Car(1999, "aa"),
                new Car(1998, "bb"),
                new Car(1997, "cc"),
                new Car(1996, "ee"),
                new Car(1995, "ff"),
                new Car(2012, "gg"),
                new Car(2014, "hh"),
        };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
