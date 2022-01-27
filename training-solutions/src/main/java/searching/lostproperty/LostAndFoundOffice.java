package searching.lostproperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> lostProperties = new ArrayList<>();

    public List<LostProperty> getLostProperties() {
        return lostProperties;
    }

    public void addProperty(LostProperty lostProperty) {
        lostProperties.add(lostProperty);
    }

    public LostProperty findLostProperty(LostProperty searched) {
        int index = Collections.binarySearch(lostProperties, searched);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return lostProperties.get(index);
    }
}
