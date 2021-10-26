package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {

        List<String> people = new ArrayList<>();
        people.add("John Doe");
        people.add("Jack Doe");
        people.add("Jill Foe");
        people.add("Jane Loe");
        people.add("Jack Loe");
        people.add("Adam Boe");
        people.add("Thomas Soe");
        people.add("David Voe");
        people.add("Jane Soe");
        people.add("Peter Toe");

        Random random = new Random();
        int firstNumber = random.nextInt(5);
        int secondNumber = random.nextInt(5) + 5;
        System.out.println(people.get(firstNumber));
        System.out.println(people.get(secondNumber));
    }
}
