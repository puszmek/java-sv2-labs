package collectionsmap.classtrip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> inpayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }

    public void loadInpayments(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String actual :lines) {
                String[] temp = actual.split(": ");
                inpayments.put(temp[0], Integer.parseInt(temp[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
}
