package com.yorix.hillel.java_elementary.lesson26;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String s = "57";
        Function<String, Integer> func = Integer::valueOf;
        System.out.println(func.apply(s));
    }
}
