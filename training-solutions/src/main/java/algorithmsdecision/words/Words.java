package algorithmsdecision.words;

import java.util.List;

public class Words {

    public boolean containsLongerWord(List<String> words, String word) {
        boolean contains = false;
        for (String actual : words) {
            if (actual.length() > word.length()) {
                contains = true;
            }
        }
        return contains;
    }
}
