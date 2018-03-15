package lesson08;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] items = {8, 5, 3, 9, 0};

        for (int i = 1, len = items.length; i < len; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (items[i] < items[j]) {
                    int tmp = items[i];
                    items[i] = items[j];
                    items[j] = tmp;
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(items));
    }
}
