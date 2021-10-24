package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a felhasználónevét!");
        String username = scanner.nextLine();
        System.out.println("Adja meg a jelszavát! (legalább 8 karakter hosszú)");
        String password1 = scanner.nextLine();
        System.out.println("Adja meg újra a jelszavát!");
        String password2 = scanner.nextLine();
        System.out.println("Adja meg az e-mail címét!");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator(username, password1, password2, email);

        System.out.println("A megadott felhasználónév helyes. " + userValidator.isValidUsername(username));

        System.out.println("A jelszó legalább 8 karakter hosszú, és a két megadott jelszó megegyezik. " + userValidator.isValidPassword(password1, password2));

        System.out.println("A megadott e-mail cím helyes. " + userValidator.isValidEmail(email));
    }
}
