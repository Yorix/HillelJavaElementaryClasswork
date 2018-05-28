package com.yorix.hillel.java_elementary.lesson31.muiltithreading;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyStoppableThread extends Thread {
    private boolean stop;

    @Override
    public void run() {
        while (!stop) {
            System.out.printf("%d\n", new Random().nextInt(10));

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void pleaseStop() {
        stop = true;
    }
}
