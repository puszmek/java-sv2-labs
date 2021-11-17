package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("egy", "kettő", "három", "", null);
        for (String word: words) {
            try {
                System.out.println(word.charAt(0));
            } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
                System.out.println(stringIndexOutOfBoundsException.getMessage());
            } catch (NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
        }
    }
}
