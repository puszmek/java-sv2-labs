package collectionsmap.casting;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int number = Integer.MAX_VALUE;
        for (Integer actual : applicants.keySet()) {
            if (actual > lastNumber && actual < number) {
                number = actual;
            }
        }
        return applicants.get(number);
    }
}
