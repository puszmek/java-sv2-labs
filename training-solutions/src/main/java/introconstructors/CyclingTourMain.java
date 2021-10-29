package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {

    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour("Mountaineering", LocalDate.of(2022, 06, 18));
        System.out.println("Description: " + cyclingTour.getDescription());
        System.out.println("Start time: " + cyclingTour.getStartTime());
        System.out.println("Number of people: " + cyclingTour.getNumberOfPeople());
        System.out.println("Km: " + cyclingTour.getKms());

        cyclingTour.registerPerson(4);
        cyclingTour.registerPerson(6);
        cyclingTour.ride(100);
        cyclingTour.ride(80.5);

        System.out.println("Description: " + cyclingTour.getDescription());
        System.out.println("Start time: " + cyclingTour.getStartTime());
        System.out.println("Number of people: " + cyclingTour.getNumberOfPeople());
        System.out.println("Km: " + cyclingTour.getKms());
    }
}
