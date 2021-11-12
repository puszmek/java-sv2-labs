package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void initWords() {
        words = new Words();
        words.addWord("felvesz");
        words.addWord("felszed");
        words.addWord("fejleszt");
        words.addWord("feled");
        words.addWord("veled");
        words.addWord("vezet");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expectedWords = Arrays.asList("felvesz", "felszed", "feled");
        words.getWordsStartWith("fel");
        assertEquals(expectedWords, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> expectedWords = Arrays.asList("feled", "veled", "vezet");
        words.getWordsWithLength(5);
        assertEquals(expectedWords, words.getWords());
    }
}
