package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void testContainsLongerWord() {
        List<String> words = Arrays.asList("apple", "peach", "pear", "blueberry");
        assertTrue(new Words().containsLongerWord(words, "orange"));
        assertFalse(new Words().containsLongerWord(words, "strawberry"));
        assertFalse(new Words().containsLongerWord(words, "blueberry"));
    }
}