package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson15.hashtable;

public class Pair {
    private final String key;
    private final Book value;


    public Pair(String key, Book value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Book getValue() {
        return value;
    }

}
