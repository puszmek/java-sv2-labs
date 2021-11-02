package compositionlist;

import java.util.Scanner;

public class BooksMain {

    public static void main(String[] args) {

        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány könyvcímet szeretne eltárolni?");
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.println("Adja meg a/az " + (i + 1) + ". könyvcímet!");
            String title = scanner.nextLine();
            books.addBook(title);
        }
        System.out.println(books.getTitles());

        System.out.println("Könyvcím, melyhez szerzőt is tátsítana.");
        String titleOfBook = scanner.nextLine();
        System.out.println("Adja meg a szerző nevét:");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(titleOfBook, author);
        System.out.println(books.getTitles());
    }
}
