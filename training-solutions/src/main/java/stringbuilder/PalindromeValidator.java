package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        word = word.trim();
        StringBuilder stringBuilder = new StringBuilder(word).reverse();
        return stringBuilder.toString().equalsIgnoreCase(word);
    }

    public static void main(String[] args) {

        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("123f321"));
        System.out.println(palindromeValidator.isPalindrome("  abcdcBA "));
        System.out.println(palindromeValidator.isPalindrome("123"));
    }
}
