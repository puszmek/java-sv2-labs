package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Song song = new Song();

        System.out.println("What is your favourite song's band?");
        Scanner scanner = new Scanner(System.in);
        song.band = scanner.nextLine();

        System.out.println("What is your favourite song's title?");
        song.title = scanner.nextLine();

        System.out.println("What is your favourite song's length (in minutes)?");
        song.length = scanner.nextInt();

        System.out.println("Your favourite song is: " + song.band + " - " + song.title + " (" + song.length + " minutes)" );


    }

}
