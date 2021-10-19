package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First time");
        System.out.println("Hours: ");
        int hours = scanner.nextInt();
        System.out.println("Minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Seconds: ");
        int seconds = scanner.nextInt();

        System.out.println("Second time");
        System.out.println("Hours: ");
        int hours2 = scanner.nextInt();
        System.out.println("Minutes: ");
        int minutes2 = scanner.nextInt();
        System.out.println("Seconds: ");
        int seconds2 = scanner.nextInt();

        Time time = new Time(hours, minutes, seconds);
        System.out.println("First time " + time.toString() + " = " + time.getInMinutes() + " minutes");

        Time time2 = new Time(hours2, minutes2, seconds2);
        System.out.println("Second time " + time2.toString() + " = " + time2.getInSeconds() + " seconds");

        System.out.println("First time is earlier than second time: " + time.earlierThan(time2));

    }

}