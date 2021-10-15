package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Enter two integers!");

        System.out.println("First integer:");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        System.out.println("Second integer:");
        int second = scanner.nextInt();

        System.out.println("Sum of two integers: ");
        System.out.println(first + " + " + second + " = ");
        System.out.println(first + second);

    }
}
