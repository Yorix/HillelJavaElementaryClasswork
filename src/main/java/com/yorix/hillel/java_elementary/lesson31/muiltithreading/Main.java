package com.yorix.hillel.java_elementary.lesson31.muiltithreading;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        way1();
//        way2();
//        way3();
//        way4();
//        way5();

        way6();

    }

    private static void way6() {
        Runnable myStoppableTask = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.printf("<%d>\t\n", new Random().nextInt(10));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t = new Thread(myStoppableTask);
        t.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        t.interrupt();
    }

    private static void way5() {
        MyStoppableThread t = new MyStoppableThread();
        t.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        t.pleaseStop();
    }

    private static void way4() {
        Runnable myTask = () -> {
            for (int i = 0; i < 7; i++) {
                System.out.printf("%s :: %d\n", Thread.currentThread().getName(), i);
            }
        };

        Thread tLow = new Thread(myTask);
        Thread tMiddle = new Thread(myTask);
        Thread tHight = new Thread(myTask);

        tLow.setPriority(1);
        tHight.setPriority(10);

        tLow.start();
        tMiddle.start();
        tHight.start();
    }

    private static void way3() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " :: " + i);
                }
            }
        });

        Thread t2 = new Thread(new Task1());
        Thread t3 = new Thread(new Task1());


        t1.start();
        t1.join();

        t2.start();
        t3.start();
    }

    private static void way2() {
        Task1 task = new Task1();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(task);
            String name = String.format("T[%d]", i);
            t.setName(name);
            t.start();
        }
    }

    private static void way1() {
        Thread myThread1 = new MyTread();

        Thread myThread2 = new MyTread();

        myThread1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

        myThread2.start();
    }
}
