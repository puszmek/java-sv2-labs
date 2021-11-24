package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.List;

public class Underground {

    public static void main(String[] args) {

        Operations operations = new Operations();
        try {
            List<String> underground = operations.readFile();
            System.out.println(operations.getDailySchedule(underground));
        } catch (IOException ioe) {
            System.out.println("A fájl megnyitása sikertelen!");
        }
    }
}
