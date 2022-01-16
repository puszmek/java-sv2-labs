package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> list = Files.readAllLines(path);
            for (String actual : list) {
                String[] temp = actual.split(" ");
                int numberOfPeople = Integer.parseInt(temp[1]);
                int aidForOnePerson = amount / numberOfPeople;
                result.add(temp[0] + " " + aidForOnePerson);
            }
        } catch (NullPointerException | IOException | ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException exceptions) {
            throw new IllegalStateException("Something went wrong while counting.", exceptions);
        }
        return result;
    }

    public int getAmount() {
        return amount;
    }
}
