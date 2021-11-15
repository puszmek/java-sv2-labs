package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    @Test
    void testVowel() {
        assertEquals('b', new ToConsonant().convertVowelToConsonant('a'));
        assertEquals('f', new ToConsonant().convertVowelToConsonant('e'));
        assertEquals('j', new ToConsonant().convertVowelToConsonant('i'));
        assertEquals('p', new ToConsonant().convertVowelToConsonant('o'));
        assertEquals('v', new ToConsonant().convertVowelToConsonant('u'));
    }

    @Test
    void testConsonant() {
        assertEquals('l', new ToConsonant().convertVowelToConsonant('l'));
        assertEquals('p', new ToConsonant().convertVowelToConsonant('p'));
    }
}
