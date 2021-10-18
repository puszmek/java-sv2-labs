package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy egész számot!");
        int number = scanner.nextInt();

        System.out.println(number % 3 == 0 ? "osztható 3-mal" : "nem osztható" + " 3-mal");

    }

}