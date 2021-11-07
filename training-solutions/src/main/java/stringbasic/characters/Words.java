package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy szót!");
        String word = scanner.nextLine();

        System.out.println("Ezt a szót kell lebetűzni: " + word);
        System.out.println("Minden betű után nyomj egy entert.");

        char[] chars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            System.out.println((i + 1) + ". betű: ");
            String letter = scanner.nextLine();
            chars[i] = letter.toCharArray()[0];
        }
        System.out.println("A megadott betűk: " + Arrays.toString(chars));
        String typedWord = new String(chars);
        System.out.println("A megadott szó: " + typedWord);
        if (typedWord.equals(word)) {
            System.out.println("Helyes megoldás!");
        } else {
            System.out.println("Helytelen megoldás!");
        }
    }
}
