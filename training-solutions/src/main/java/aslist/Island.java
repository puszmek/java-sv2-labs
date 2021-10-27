package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("lighter", "knife", "water");

        System.out.println(importantThings);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hanyadik elemet szeretnéd kicserélni?");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("Mire?");
        String newThing = scanner.nextLine();

        importantThings.set(index, newThing);
        System.out.println(importantThings);
    }
}
