package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {
        int min = temperatures.get(0);;
        for (int actual : temperatures) {
            if (actual < min) {
                min = actual;
            }
        }
        return min;
    }
}
