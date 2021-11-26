package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ElectricityTest {

    Electricity electricity = new Electricity();

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("streets.txt");
        electricity.writeStreets(path);
        List<String> streets = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString(),
                "Kerekes utca", "Domb utca", "Déli utca"), streets);
        assertEquals(4, streets.size());
        assertEquals("Kerekes utca", streets.get(1));
    }

    @Test
    void testWriteStreetsInvalidPath() {
        Path path = Paths.get("/");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> electricity.writeStreets(path));
        assertEquals("Hiba a fájl létrehozásakor!", ise.getMessage());
    }
}
