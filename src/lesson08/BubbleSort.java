package lesson08;


public class BubbleSort {
    public static void main(String[] args) {
        int[] items = {2, 3, 7, 5, 1, 4, 9};
        bubbleSort(items);
        printArray(items);
    }

    public static void bubbleSort(int[] items) {
        int len = items.length;
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len - j; i++) {
                if (items[i] < items[i - 1]) {
                    swap(items, i, i - 1);
                }
            }
        }
    }

    private static void swap(int[] items, int left, int right) {
        int tmp = items[left];
        items[left] = items[right];
        items[right] = tmp;
    }

    public static void printArray(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
