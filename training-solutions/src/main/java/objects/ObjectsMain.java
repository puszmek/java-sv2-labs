package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();

        System.out.println(new Book());     // objects.Book@eed1f14   ezt írja ki

        Book emptyBook;
//        System.out.println(emptyBook);     nem lehet

        emptyBook = null;
        System.out.println(emptyBook);     //  null    ezt írja ki

        System.out.println(emptyBook == null);     // true

        Book book = new Book();

        System.out.println(book);        // objects.Book@7229724f    ezt írja ki

        book = null;
        System.out.println(book);      // null

        book = new Book();
        System.out.println(book);      // objects.Book@4c873330

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);      // false

        anotherBook = book;
        System.out.println(anotherBook);       // objects.Book@4c873330

        System.out.println(book == anotherBook);       // true

        Book[] books = {new Book(), new Book(), new Book()};

        System.out.println();

        List<Book> books0 = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(books0);

        List<Book> books1 = new ArrayList<>();
        books1.add(new Book());
        books1.add(new Book());
        books1.add(new Book());
        System.out.println(books1);
    }
}
