package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive best = pendrives.get(0);
        for (Pendrive actual : pendrives) {
            if (best.comparePricePerCapacity(actual) == 1) {
                best = actual;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = pendrives.get(0);
        for (Pendrive actual : pendrives) {
            if (!cheapest.isCheaperThan(actual)) {
                cheapest = actual;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive actual : pendrives) {
            if (actual.getCapacity() == capacity) {
                actual.risePrice(percent);
            }
        }
    }
}
