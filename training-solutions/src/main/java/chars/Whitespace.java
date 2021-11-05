package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                chars[i] = '*';
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {

        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Gyakorlati feladat - Nem látható karakterek cseréje"));
    }
}
