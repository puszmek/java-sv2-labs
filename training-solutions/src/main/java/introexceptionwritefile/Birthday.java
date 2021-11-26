package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg, hány embert szeretne rögzíteni!");
        int number = 0;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        List<String> birthdayList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Adja meg a nevet!");
            String name = scanner.nextLine();
            System.out.println("Adja meg a születési dátumot!");
            String birthday = scanner.nextLine();
            birthdayList.add(String.format("%s, %s", name, birthday));
        }
        try {
            Files.write(Paths.get("src/main/resources/birthday.txt"), birthdayList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
