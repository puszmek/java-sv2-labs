package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy több tagmondatból álló mondatot, amely ugyanazzal a karaktersorozattal van elválasztva!");
        String sentence = scanner.nextLine();
        Scanner stringScanner = new Scanner(sentence);

        for(;stringScanner.hasNext();) {
            System.out.println(stringScanner.next());
        }
        System.out.println();

        System.out.println("Adjon meg egy több tagmondatból álló mondatot, amely ugyanazzal a karaktersorozattal van elválasztva!");
        sentence = scanner.nextLine();
        stringScanner = new Scanner(sentence).useDelimiter(", ");
        for(;stringScanner.hasNext();) {
            System.out.print(stringScanner.next());
            System.out.println(stringScanner.hasNext() ? ", " : "");
        }
    }
}
