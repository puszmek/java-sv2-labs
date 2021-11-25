package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readTrackPoints() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("A fájl megnyitása sikertelen!", ioe);
        }
    }

    public void getHeightData(List<String> trackPoints) {
        List<Integer> heightData = new ArrayList<>();
        for (String actual: trackPoints) {
            heightData.add(Integer.parseInt(actual.split(";")[2]));
        }
        printHeightDifferences(heightData);
    }

    private void printHeightDifferences(List<Integer> heightData) {
        for (int i = 1; i < heightData.size(); i++) {
            System.out.println(heightData.get(i) - heightData.get(i - 1));
        }
    }
}
