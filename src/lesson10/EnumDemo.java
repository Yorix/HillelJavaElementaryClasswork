package lesson10;

import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {
        Days mon = Days.MON;
        int number;

        System.out.println("Input your days number");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        Days yourChoice;
        switch (number) {
            case 1:
                yourChoice = Days.MON;
                break;
            case 2:
                yourChoice = Days.TUE;
                break;
            case 3:
                yourChoice = Days.WED;
                break;
            case 4:
                yourChoice = Days.THU;
                break;
            case 5:
                yourChoice = Days.FRI;
                break;
            case 6:
                yourChoice = Days.SAT;
                break;
            case 7:
                yourChoice = Days.SUN;
                break;
            default:
                System.out.println("Other day");
                return;
        }
        System.out.println(yourChoice.toString());
    }
}
