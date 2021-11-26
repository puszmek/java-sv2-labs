package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {


    public List<String> getListOfStreets() {
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("Kerekes utca");
        streets.add("Domb utca");
        streets.add("Déli utca");
        return streets;
    }

    public void writeStreets(Path path) {
        List<String> streets = getListOfStreets();
        try {
            Files.write(path, streets);
        } catch (IOException ioe) {
            throw new IllegalStateException("Hiba a fájl létrehozásakor!", ioe);
        }
    }
}
