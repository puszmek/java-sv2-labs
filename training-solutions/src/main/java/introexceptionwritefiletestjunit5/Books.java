package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> readFile() {
        try {
            return Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Hiba a fájl beolvasásakor!", ioe);
        }
    }

    private void writeFile(Path path, List<String> readable) {
        try {
            Files.write(path, readable);
        } catch (IOException ioe) {
            throw new IllegalStateException("Hiba a fájl létrehozásakor!", ioe);
        }
    }

    public void createReadableList(Path path) {
        List<String> books = readFile();
        List<String> readable = new ArrayList<>();
        for (String actual : books) {
            String[] parts = actual.split(";");
            readable.add(parts[2] + ": " + parts[1]);
        }
        writeFile(path, readable);
    }
}
