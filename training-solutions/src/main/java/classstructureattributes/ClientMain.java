package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        client.name = scanner.nextLine();

        System.out.println("Year of birth:");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Address:");
        client.address = scanner.nextLine();

        System.out.println("Name: " + client.name);
        System.out.println("Year of birth: " + client.year);
        System.out.println("Address: " + client.address);

    }

}