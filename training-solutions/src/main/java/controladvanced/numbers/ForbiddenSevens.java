package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot!");
        int number = scanner.nextInt();

        while ((number % 7 == 0) || !Integer.toString(number).contains("7")) {
            if (number % 7 == 0) {
                System.out.println("X");
            } else {
                System.out.println(number);
            }
            number++;
        }
//        for (int i = number; i >= number; i++) {
//            if (i % 7 == 0) {
//                System.out.println("X");
//                continue;
//            }
//            if (Integer.toString(i).contains("7")) {
//                break;
//            }
//            System.out.println(i);
//        }
    }
}
