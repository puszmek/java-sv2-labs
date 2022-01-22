package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {

    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        Object firstBook = books.get(0);
        if (firstBook instanceof Book) {
            return (Book) firstBook;
        }
        throw new ClassCastException("Not a book");
    }
}
