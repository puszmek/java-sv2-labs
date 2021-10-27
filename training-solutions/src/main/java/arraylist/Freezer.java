package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> foodsInFreezer = new ArrayList<>();

        foodsInFreezer.add("nuggets");
        foodsInFreezer.add("chicken breast");
        foodsInFreezer.add("peas");
        foodsInFreezer.add("blueberry");
        foodsInFreezer.add("ice cream");

        System.out.println(foodsInFreezer);
        System.out.println(foodsInFreezer.size());

        foodsInFreezer.remove("nuggets");
        foodsInFreezer.remove("peas");

        System.out.println(foodsInFreezer);
        System.out.println(foodsInFreezer.size());
    }
}
