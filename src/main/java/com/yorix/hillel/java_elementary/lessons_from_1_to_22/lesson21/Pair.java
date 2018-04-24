package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson21;


public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    Pair<T, V> getPair() {
        return new Pair<T, V>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
