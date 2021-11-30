package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        List<String> words = Arrays.asList("apple", "peach", "pear", "lemon");
        List<String> result = Arrays.asList("ap", "pe", "pe", "le");
        assertEquals(result, new TwoLetters().getFirstTwoLetters(words));
    }
}