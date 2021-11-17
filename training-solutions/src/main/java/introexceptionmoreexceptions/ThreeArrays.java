package introexceptionmoreexceptions;

import java.util.Arrays;

public class ThreeArrays {

    public static void main(String[] args) {

        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 2, 1, 42};
        int[] third = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            third[i] = first[i] / second[i];
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
    }
//    A 14. sorban keletkezik kivétel, amikor i = 10, mert a second változónak értékül adott tömb eggyel kevesebb elemet tartalmaz, mint a first változóhoz tartozó.
//    A second változónak értékül adott tömbnek nincs 10-es indexű eleme, ezért ArrayIndexOutOfBoundsException kivétel keletkezik.
}
