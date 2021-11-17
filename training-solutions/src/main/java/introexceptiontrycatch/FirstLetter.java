package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("egy", "kettő", "három", null);

        try {
            for (String word : words) {
                System.out.println(word.charAt(0));
            }
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }
}
