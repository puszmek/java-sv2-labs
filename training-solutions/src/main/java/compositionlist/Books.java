package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        if (titles.contains(title)) {
            titles.indexOf(title);
            String bookAndAuthor =  author + ": " + title;  // author + ": " + titles.get(titles.indexOf(title));
            titles.set(titles.indexOf(title), bookAndAuthor);
        }
    }

    public List<String> getTitles() {
        return titles;
    }
}
