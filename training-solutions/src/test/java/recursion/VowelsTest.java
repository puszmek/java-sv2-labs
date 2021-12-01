package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testIsPalindrome() {
        Vowels vowels = new Vowels();
        assertEquals(0, vowels.getNumberOfVowels(""));
        assertEquals(1, vowels.getNumberOfVowels("o"));
        assertEquals(0, vowels.getNumberOfVowels("bcd"));
        assertEquals(5, vowels.getNumberOfVowels("teherautó"));
    }
}