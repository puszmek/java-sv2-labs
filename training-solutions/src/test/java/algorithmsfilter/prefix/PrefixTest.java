package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {
        List<String> words = Arrays.asList("apple", "pear", "peach", "lemon", "orange");
        List<String> result = Arrays.asList("pear", "peach");
        assertEquals(result, new Prefix().getWordsStartWith(words, "p"));
        assertEquals(2, result.size());
        assertEquals("pear", result.get(0));
        assertTrue(result.contains("peach"));
    }
}