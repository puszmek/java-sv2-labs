package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oldd meg a következő feladatot! A megoldást 4 tizedes pontosággal add meg tizedesvesszőt használva!");
        System.out.println("5 * (7 - 2) + 8 / 3");
        double result = 5 * (7 - 2) + (double)8 / 3;
        double answer = scanner.nextDouble();

        if (Math.abs(result - answer) < 0.0001) {
            System.out.println("Helyes megoldás!");
        } else {
            System.out.println("Helytelen megoldás!");
        }
    }
}
