package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az érkező csapat létszámát!");
        int numberOfPeople = scanner.nextInt();

        if ((numberOfPeople == 1) || (numberOfPeople == 2)) {
            System.out.println("A kétszemélyes csónakot vitték el, és még 8 főnek maradt hely.");
        }
        if (numberOfPeople == 3) {
            System.out.println("A háromszemélyes csónakot vitték el, és még 7 főnek maradt hely.");
        }
        if ((numberOfPeople == 4) || (numberOfPeople == 5)) {
            System.out.println("Az ötszemélyes csónakot vitték el, és még 5 főnek maradt hely.");
        }
        if ((numberOfPeople == 6) || (numberOfPeople == 7)) {
            System.out.println("A kétszemélyes és az ötszemélyes csónakot vitték el, és még 3 főnek maradt hely.");
        }
        if (numberOfPeople == 8) {
            System.out.println("A háromszemélyes és az ötszemélyes csónakot vitték el, és még 2 főnek maradt hely.");
        }
        if ((numberOfPeople == 9) || (numberOfPeople == 10)) {
            System.out.println("Mindhárom csónakot elvitték, nem maradt szabad hely.");
        }
        if (numberOfPeople > 10) {
            int number = numberOfPeople - 10;
            System.out.println("Mindhárom csónakot elvitték, és " + number + " ember maradt a parton.");
        }

//        int boat1Capacity = 5;
//        int boat2Capacity = 3;
//        int boat3Capacity = 2;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hány fős csoport érkezett?");
//        int numberOfPeople = scanner.nextInt();
//
//        int freePlaces = 10;
//        int freeBoats = 3;
//
//        if (numberOfPeople > 3) {
//            System.out.println("5-ös csónak");
//            numberOfPeople = numberOfPeople - 5;
//            freeBoats--;
//            freePlaces = freePlaces - 5;
//        }
//        if (numberOfPeople > 2) {
//            System.out.println("3-as csónak");
//            numberOfPeople = numberOfPeople - 3;
//            freeBoats--;
//            freePlaces = freePlaces - 3;
//        }
//        if (numberOfPeople > 0) {
//            System.out.println("2-es csónak");
//            numberOfPeople = numberOfPeople - 2;
//            freeBoats--;
//            freePlaces = freePlaces - 2;
//        }
//        if (numberOfPeople > 0) {
//            System.out.println("Sajnos nem fért el mindenki a hajókban.");
//        } else {
//            System.out.println("Üres helyek száma: " + freePlaces);
//            System.out.println("Üres csónakok száma: " + freeBoats);
//        }
    }
}
