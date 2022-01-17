package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {      // a katalógus tartalmazza a katalóguselemek listáját
    // ebben az osztályban lehet különböző lekérdezéseket végrehajtani
    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        List<CatalogItem> delete = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.getRegistrationNumber().equals(registrationNumber)) {
                delete.add(actual);
            }
        }
        catalogItems.removeAll(delete);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> catalogItemsFindByCriteria = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (searchByCriteria(actual, searchCriteria)) {
                catalogItemsFindByCriteria.add(actual);
            }
        }
        return catalogItemsFindByCriteria;
    }

    public int getAllPageNumber() {
        int sumAllPageNumber = 0;
        for (CatalogItem actual : catalogItems) {
            sumAllPageNumber += actual.numberOfPagesAtOneItem();
        }
        return sumAllPageNumber;
    }

    public int getFullLength() {
        int sumFullLength = 0;
        for (CatalogItem actual : catalogItems) {
            sumFullLength += actual.fullLengthAtOneItem();
        }
        return sumFullLength;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioLibraryItems = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasAudioFeature()) {
                audioLibraryItems.add(actual);
            }
        }
        return audioLibraryItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedLibraryItems = new ArrayList<>();
        for (CatalogItem actual : catalogItems) {
            if (actual.hasPrintedFeature()) {
                printedLibraryItems.add(actual);
            }
        }
        return printedLibraryItems;
    }

    public double averagePageNumberOver(int minNumberOfPages) {
        validateMinNumberOfPages(minNumberOfPages);
        double sum = 0;
        double count = 0;
        for (CatalogItem actual : catalogItems) {
            if (actual.numberOfPagesAtOneItem() >= minNumberOfPages) {
                sum += actual.numberOfPagesAtOneItem();
                count++;
            }
        }
        validateCount(count);
        return sum / count;
    }

    private boolean searchByCriteria(CatalogItem catalogItem, SearchCriteria searchCriteria) {
        if (!searchCriteria.hasTitle() || catalogItem.getTitles().contains(searchCriteria.getTitle())) {
            return true;
        }
        if (!searchCriteria.hasContributor() || catalogItem.getContributors().contains(searchCriteria.getContributor())) {
            return true;
        }
        return false;
    }

    private void validateMinNumberOfPages(int minNumberOfPages) {
        if (minNumberOfPages < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
    }

    private void validateCount(double count) {
        if (count < 1) {
            throw new IllegalArgumentException("No page");
        }
    }
}
