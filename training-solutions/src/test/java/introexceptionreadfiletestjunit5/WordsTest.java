package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class WordsTest {

    @Test
    void testGetFirstWordWithA() {
        String word = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", word);
    }

    @Test
    void testNoWordWithA() {
        String word = new Words().getFirstWordWithA(Paths.get("src/test/resources/anotherwords.txt"));
        assertEquals("A", word);
    }

    @Test
    void testGetWordWithANotFound() {
        Path path = Paths.get("src/test/resources/filenotfound.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(path));
        assertEquals("Hiba a fájl megnyitásakor!", ise.getMessage());
    }
}
