package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFile() {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return floatingNumbers.get(0);
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found!", ioe);
        }
    }

    public Sums sum(String floatingNumbers) {
        String[] numbers = floatingNumbers.replace(",", ".").split(";");
        Sums sums = new Sums();
        for (String actual : numbers) {
            sums.addNumber(Double.parseDouble(actual));
        }
        return sums;
    }
}
