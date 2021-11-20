package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy legfeljebb 5 betűs szót!");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("A megadott szó hosszabb mint 5!");
        }
        char[] chars = word.toCharArray();
        for (char actual: chars) {
            if (!Character.isAlphabetic(actual)) {
                throw new IllegalArgumentException("A megadott szó betűn kívül más karaktert is tartalmaz!!");
            }
        }
        System.out.println(word);
    }
}
