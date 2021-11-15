package controlselection.consonant;

public class ToConsonant {

    public char convertVowelToConsonant(char c) {
        if ("aeiou".indexOf(c) >= 0) {
            return (char) (c + 1);
        } else {
            return c;
        }
    }
}
