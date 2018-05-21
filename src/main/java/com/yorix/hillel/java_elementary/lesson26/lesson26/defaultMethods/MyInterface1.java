package com.yorix.hillel.java_elementary.lesson26.lesson26.defaultMethods;

public interface MyInterface1 {
    void say(String s);

    default void sayHello() {
        System.out.println("Hello!");
    }

    static void sayBye() {
        System.out.println("Bye");
    }
}
