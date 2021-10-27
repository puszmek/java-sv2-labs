package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {

        List<String> favouriteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg kedvenc énekesét!");
        String singer = scanner.nextLine();

        System.out.println("Adja meg kedvenc íróját!");
        String author = scanner.nextLine();

        System.out.println("Adja meg kedvenc színészét!");
        String actor = scanner.nextLine();

        favouriteThings.add(singer);
        favouriteThings.add(author);
        favouriteThings.add(actor);

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
