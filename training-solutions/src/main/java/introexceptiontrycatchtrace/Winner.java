package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> people = new ArrayList<>(Arrays.asList("Kiss Péter", "Kovács Dénes", "Nagy Anna", "Molnár Fanni", null));

    public void addPerson(String person) {
        people.add(person);
    }

    public String getWinner() {
        Random random = new Random();
        int indexOfWinner = random.nextInt(people.size());
        return people.get(indexOfWinner).toUpperCase();
    }
}
