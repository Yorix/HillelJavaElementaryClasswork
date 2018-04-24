package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson06;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int res = i * j;
                System.out.printf("%d * %d = %d\n", i, j, res);
            }
            System.out.println();
        }
    }
}
