package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {

    public static void main(String[] args) {

        List<String> people = Arrays.asList("Kiss Péter", "Nagy László", "Molnár Ferenc", "Fehér Elek");
        for (String person : people) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!%n", person);
        }
    }
}
