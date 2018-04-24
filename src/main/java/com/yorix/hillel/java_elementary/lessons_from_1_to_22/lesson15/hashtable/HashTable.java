package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson15.hashtable;

public interface HashTable {
    void push(String key, Book book);

    boolean delete(String key);

    Book get(String key);
}
