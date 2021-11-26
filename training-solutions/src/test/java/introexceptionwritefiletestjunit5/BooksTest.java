package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testCreateReadableList() throws IOException {
        Path path = temporaryFolder.toPath().resolve("books.txt");
        new Books().createReadableList(path);
        List<String> expected = Arrays.asList(
                "Gárdonyi Géza: Egri csillagok",
                "Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár",
                "Jókai Mór: Kőszívű ember fiai");
        assertEquals(expected, Files.readAllLines(path));
    }
}
