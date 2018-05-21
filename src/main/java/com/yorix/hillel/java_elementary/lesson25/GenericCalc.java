package com.yorix.hillel.java_elementary.lesson25;

@FunctionalInterface
public interface GenericCalc<T> {
    T process(T p1, T p2);
}
