package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg, hogy a Fibonacci sorozatnak hány elemét írja ki a konzolra");
        int number = scanner.nextInt();

        int[] fibonacci = new int[number + 2];
        fibonacci[1] = 1;
        for (int i = 0; i < number; i++) {
            fibonacci[i + 2] = fibonacci[i] + fibonacci[i + 1];
            System.out.print(fibonacci[i] + ", ");
        }
        System.out.println();

        int i = 0;
        do {
            fibonacci[i + 2] = fibonacci[i] + fibonacci[i + 1];
            System.out.print(fibonacci[i] + ", ");
            i++;
        } while (i < number);
        System.out.println();

        i = 0;
        while (i < number) {
            fibonacci[i + 2] = fibonacci[i] + fibonacci[i + 1];
            System.out.print(fibonacci[i] + ", ");
            i++;
        }
    }
}
