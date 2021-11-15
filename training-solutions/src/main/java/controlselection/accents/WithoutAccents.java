package controlselection.accents;

public class WithoutAccents {

    public char convertToCharWithoutAccents(char c) {
        String lettersWithAccents = "áÁéÉíÍóÓöÖőŐúÚüÜűŰ";
        String lettersWithoutAccents = "aAeEiIoOoOoOuUuUuU";
        if (lettersWithAccents.indexOf(c) >= 0) {
            return lettersWithoutAccents.charAt(lettersWithAccents.indexOf(c));
        } else {
            return c;
        }
    }
}
