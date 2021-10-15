package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        System.out.println("Create New Account");

        System.out.println("Username:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("E-mail address:");
        String email = scanner.nextLine();

        System.out.println("Account Details: ");
        System.out.println("Username: " + userName);
        System.out.println("E-mail address: "+ email);

    }
}
