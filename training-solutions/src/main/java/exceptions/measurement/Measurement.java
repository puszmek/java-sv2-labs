package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public List<String> validate(List<String> data) {
        List<String> incorrectLines = new ArrayList<>();
        for (String actual : data) {
            if (!isCorrectLine(actual)) {
                incorrectLines.add(actual);
            }
        }
        return incorrectLines;
    }

    private boolean isCorrectLine(String line) {
        String[] temp = line.split(",");
        try {
            return temp.length == 3 && isValidNumber(temp[0]) && isValidMeasuredValue(temp[1]) && isValidName(temp[2]);
        } catch (IndexOutOfBoundsException ioobe) {
            return false;
        }
    }

    private boolean isValidLength(String[] temp) {
        return temp.length == 3;
    }

    private boolean isValidNumber(String firstPart) {
        try {
            Integer.parseInt(firstPart);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isValidMeasuredValue(String secondPart) {
        try {
            Double.parseDouble(secondPart);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isValidName(String thirdPart) {
        return thirdPart.trim().split(" ").length > 1;
    }
}
