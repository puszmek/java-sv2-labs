package collectionsiterator.christmas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> christmasPresents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return christmasPresents;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for (Iterator<ChristmasPresent> i = christmasPresents.iterator(); i.hasNext();) {
            int number = i.next().getPrice();     // ChristmasPresent cp = i.next();
            if (number > maxPrice) {              // if (cp.getPrice() > maxPrice)
                i.remove();
            }
        }
    }
}
