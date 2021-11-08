package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();
        for (; scanner.hasNextInt(); ) {
            int number = scanner.nextInt();
            if (number > 100) {
                stringBuilder.append(number + ",");
            }
        }
        String result = stringBuilder.toString();
        if (result.length() == 0) {
            return result;
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {

        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
        System.out.println(intScanner.convertInts("200"));
        System.out.println(intScanner.convertInts("25;45"));
        System.out.println("");
    }
}
