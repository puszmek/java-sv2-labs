package introexceptiontrace.number;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {

        Change change = new Change();
        System.out.println(Arrays.toString(change.changeNumbers()));
    }
}
// ArrayIndexOutOfBoundsException kivétel keletkezik a RandomOperations osztály getNumber() metódusában.
// Ennek oka az, hogy a for ciklus fejében definiált i változó felveheti indexül a tömb hosszát, azonban olyan index már nincs a tömbben.