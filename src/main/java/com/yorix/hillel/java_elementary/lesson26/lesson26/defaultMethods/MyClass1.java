package com.yorix.hillel.java_elementary.lesson26.lesson26.defaultMethods;

public class MyClass1 implements MyInterface1, MyInterface2 {
    @Override
    public void say(String s) {
        System.out.println(s);
    }

    @Override
    public void sayHello() {
        System.out.println("");
    }
}
