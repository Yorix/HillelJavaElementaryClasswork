package com.yorix.hillel.java_elementary.lesson31.muiltithreading;

public class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.printf("<%s> \t i = %d\n", Thread.currentThread().getName(), i);
            Thread.yield();
        }
    }
}
