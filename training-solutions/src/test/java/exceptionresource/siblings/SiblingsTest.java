package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void testGetFullNames() {
        Path path = Paths.get("src/test/resources/siblings.txt");
        List<String> expected = Arrays.asList("Szabó Emese", "Szabó Ferenc");
        assertEquals(expected, siblings.getFullNames("Szabó", path));
    }

    @Test
    void testGetFullNamesWithWrongFile() {
        Exception exception = assertThrows(IllegalStateException.class,
                () -> siblings.getFullNames("Szabó", Paths.get("src/test/resources/sibling.txt")));
        assertEquals("Can not read file!", exception.getMessage());
    }
}