package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public static void main(String[] args) {

        try {
            List<String> poem = Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
            for (String actual: poem) {
                System.out.print(actual.charAt(0));
                System.out.println();
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("A fájl megnyitása sikertelen!");
        }
    }
}
