package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> habitants, int number) {
        boolean contains = false;
        for (int actual : habitants) {
            if (actual < number) {
                contains = true;
            }
        }
        return contains;
    }
}
