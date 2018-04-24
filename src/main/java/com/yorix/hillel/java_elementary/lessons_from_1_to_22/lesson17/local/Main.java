package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson17.local;

public class Main {
    public static void main(String[] args) {
        Pair myPair = new Local().getPair();

        System.out.println(myPair.getData());
        System.out.println(myPair.getName());
    }
}
