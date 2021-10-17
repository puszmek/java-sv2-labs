package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Oliver Sacks", "Hallutinations");
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());

        Book regNumber = new Book("Oliver Sacks", "Hallutinations");
        regNumber.register("1524963201ab");
        System.out.println("Registration number: " + regNumber.getRegNumber());

    }

}
