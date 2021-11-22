package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);
        boolean validRegistration = true;

        System.out.println("Üdvözöljük!");
        System.out.println("Adja meg a nevét!");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            validRegistration = false;
        }

        System.out.println("Adja meg az életkorát!");
        String ageString = scanner.nextLine();
        try {
            validation.validateAge(name);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            validRegistration = false;
        }

        System.out.println("\n" + "Az Ön által megadott adatok: ");
        System.out.println("Név: " + name);
        System.out.println("Életkor: " + ageString);
        if (validRegistration) {
            System.out.println("Sikeresen regisztrált!");
        } else {
            System.out.println("Sikertelen regisztráció!");
        }
    }
}
