package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {      // katalóguselem

    private List<Feature> features = new ArrayList<>();      // jellemzők listája (nyomtatott vagy audio)
    private int price;                                      // ár
    private String registrationNumber;                      // regisztrációs szám

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = Arrays.asList(features);
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature actual : features) {
            if (actual instanceof AudioFeatures) {
                fullLength += ((AudioFeatures) actual).getLength();
            }
        }
        return fullLength;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature actual : features) {
            contributors.addAll(actual.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature actual : features) {
            titles.add(actual.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature actual : features) {
            if (actual instanceof AudioFeatures)
                return true;
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature actual : features) {
            if (actual instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int sumNumberOfPages = 0;
        for (Feature actual : features) {
            if (actual instanceof PrintedFeatures) {
                sumNumberOfPages += ((PrintedFeatures) actual).getNumberOfPages();
            }
        }
        return sumNumberOfPages;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
