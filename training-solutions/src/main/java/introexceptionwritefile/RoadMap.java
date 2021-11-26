package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {

        List<String> road = Arrays.asList("Mórahalom", "Balástya", "Kistelek", "Kecskemét");
        try {
            Files.write(Paths.get("src/main/resources/roadmap.txt"), road);
        } catch (IOException ioe) {
            ioe.getMessage();
            ioe.printStackTrace();
        }
    }
}
