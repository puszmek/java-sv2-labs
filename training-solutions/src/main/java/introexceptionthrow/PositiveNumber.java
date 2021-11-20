package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív számot!");
        String number = scanner.nextLine();
        char[] numberToCharacter = number.toCharArray();
        for (char actual: numberToCharacter) {
            if (!Character.isDigit(actual)) {
                throw new IllegalArgumentException("Nem pozitív szám: " + number);
            }
        }
    }
}
