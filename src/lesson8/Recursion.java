package lesson8;

public class Recursion {
    public static void main(String[] args) {
        int num = 5, num2 = 6;
        System.out.println(factorial(num));
        System.out.println(fibonachi(num2));
    }

    private static long factorial(int num) {
        if (num == 1) {
            return num;
        }
        return  num * factorial(num - 1);
    }

    private static long fibonachi(long num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        return fibonachi(num - 1) + fibonachi(num - 2);
    }
}
