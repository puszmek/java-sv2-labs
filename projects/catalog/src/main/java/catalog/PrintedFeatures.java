package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {      // egy katalóguselemet jellemez, ha az nyomtatott tulajdonságokkal rendelkezik

    private String title;           // cím
    private int numberOfPages;      // oldalszám
    private List<String> authors = new ArrayList<>();   // szerzők

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        validateTitle(title);
        validateNumberOfPages(numberOfPages);
        validateAuthors(authors);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public List<String> getContributors() {      // a szerzőket adja vissza listaként
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private void validateTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void validateNumberOfPages(int numberOfPages) {
        if (numberOfPages < 1) {
            throw new IllegalArgumentException("Invalid number of pages");
        }
    }

    private void validateAuthors(List<String> authors) {
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("List of authors is empty.");
        }
    }
}
