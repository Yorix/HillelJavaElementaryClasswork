package com.yorix.hillel.java_elementary.lesson26.lesson26.defaultMethods;

public interface MyInterface2 {
    default void sayChao() {
        System.out.println("Chao!");
    }

    default void sayHello() {
        System.out.println("Hello!");
    }
}
