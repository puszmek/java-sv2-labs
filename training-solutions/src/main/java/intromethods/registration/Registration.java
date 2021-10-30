package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String surname, String forename) {
        return surname + " " + forename;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {

        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a vezetéknevét!");
        String surname = scanner.nextLine();
        System.out.println("Adja meg a keresztnevét!");
        String forename = scanner.nextLine();

        String name = registration.getFullName(surname, forename);

        System.out.println("Adja meg születési évét!");
        int year = scanner.nextInt();
        System.out.println("Adja meg születési hónapját!");
        int month = scanner.nextInt();
        System.out.println("Adja meg születési napját!");
        int day = scanner.nextInt();
        scanner.nextLine();

        LocalDate dateOfBirth = registration.getDateOfBirth(year, month, day);

        System.out.println("Adja meg az e-mail címét!");
        String email = scanner.nextLine();

        Person person = new Person(name, dateOfBirth, email);
        System.out.println("Az Ön regisztrációs adatai:" + System.lineSeparator() + person);
    }
}
