package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    private List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("A fájl megnyitása sikertelen!", ioe);
        }
    }

    private void writeNames(List<String> names) {
        for (String actual: names) {
            if (actual.contains("Nemecsek")) {
                System.out.println(actual.toLowerCase());
            } else {
                System.out.println(actual);
            }
        }
    }

    public static void main(String[] args) {

        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        paulStreetBoys.writeNames(paulStreetBoys.readNames());
    }
}
