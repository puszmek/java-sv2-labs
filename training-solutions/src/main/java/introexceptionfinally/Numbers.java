package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("Adjon meg egy számot!");
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Nem számot adott meg!", nfe);
            } finally {
                System.out.println("End of round.");
            }
        } while (number % 2 != 0);
    }
}
