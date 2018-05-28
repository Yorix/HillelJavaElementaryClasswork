package com.yorix.hillel.java_elementary.lesson31.muiltithreading;

public class MyTread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
