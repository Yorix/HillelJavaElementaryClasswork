package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson07;

import java.util.Arrays;

public class qwerty {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 2, 1};

        for (int i = 0, j = arr.length - 1, len = arr.length >> 1; i < len; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
