package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("We Are Our Brains");
        System.out.println(book.getTitle());
        book.setTitle("Our Creative Brains");
        System.out.println(book.getTitle());
    }
}
