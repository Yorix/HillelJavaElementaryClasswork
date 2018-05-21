package com.yorix.hillel.java_elementary.lesson27.lambda3;

public class Starter {
    public static void main(String[] args) {
        UserBuilder userCreator = User::new;

        userCreator.create("");
    }
}
