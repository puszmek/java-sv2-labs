package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    private List<String> readFile() throws IOException {
        Path path = Paths.get("src/main/resources/neptun.csv");
        return Files.readAllLines(path);
    }

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            List<String> namesAndCodes = neptun.readFile();
            List <String> neptunCodes = new ArrayList<>();
            for (String actual: namesAndCodes) {
                neptunCodes.add(actual.split(",")[1]);
            }
            System.out.println(neptunCodes);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
