package collectionsautoboxing.paper;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return paper;
    }

    public void putFurtherPaper(String className, int kilograms) {
        if (!paper.containsKey(className)) {
            paper.put(className, kilograms);
        } else {
            paper.put(className, paper.get(className) + kilograms);
        }
    }

    public String getWinnerClass() {
        String winner = "";
        int max = Integer.MIN_VALUE;
        for (String actual : paper.keySet()) {
            if (paper.get(actual) > max) {
                max = paper.get(actual);
                winner = actual;
            }
        }
        return winner;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (Integer actual : paper.values()) {
            sum += actual;
        }
        return sum;
    }
}
