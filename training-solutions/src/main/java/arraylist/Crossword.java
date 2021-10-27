package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("KULCS");
        words.add("KÁLYHA");
        words.add("LÓ");
        words.add("AJTÓ");
        words.add("CSERESZNYEFA");
        words.add("TEJ");
        words.add("FELHŐ");
        words.add("CIPŐ");
        words.add("MOSODA");
        words.add("KÁVÉTEJSZÍN");
        words.add("CITERA");
        words.add("BABA");

        for (String word: words) {
            if (word.length() == 6) {
                System.out.println(word);
            }
        }
    }
}
