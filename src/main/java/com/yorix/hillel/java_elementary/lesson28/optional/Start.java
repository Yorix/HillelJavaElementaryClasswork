package com.yorix.hillel.java_elementary.lesson28.optional;

import java.util.Optional;
import java.util.Random;

public class Start {
    public static void main(String[] args) {

        Optional<String> r = getNameNewStyle(0);

        r.ifPresent(System.out::println);

        String finalResult = r.orElse("Not done");
        System.out.println(finalResult);

        finalResult = r.orElseGet(() -> Character.toString((char)new Random().nextInt(255)));
        System.out.println(finalResult);


        r = Optional.ofNullable(getNameOldStyle(3));
        r.ifPresent(System.out::println);

    }

    private static Optional<String> getNameNewStyle(int i) {
//        if (i == 0)
//            return Optional.empty();
//        else
//            return Optional.of("Done");
        return Optional.ofNullable(getNameOldStyle(i));
    }

    private static String getNameOldStyle(int i) {
        return i == 0 ? null : "Done: " + i;
    }
}
