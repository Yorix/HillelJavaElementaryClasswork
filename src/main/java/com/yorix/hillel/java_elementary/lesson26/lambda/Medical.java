package com.yorix.hillel.java_elementary.lesson26.lambda;

@FunctionalInterface
public interface Medical<T, U, R> {
    R estimate(T r, U d);
}
