package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg öt számot!");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Add meg a/az " + (i + 1) + ". számot!");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("A megadott öt szám összege: " + sum);
    }
}
