package introdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance performance = new Performance("Bryan Adams", LocalDate.of(2021, 11, 6), LocalTime.of(20, 00), LocalTime.of(22, 30));

        System.out.println("Előadó: " + performance.getArtist());
        System.out.println("Fellépés dátuma: " + performance.getDate());
        System.out.println("Kezdési idő: " + performance.getStartTime());
        System.out.println("Befejezési idő: " + performance.getEndTime());
        System.out.println("\r\n" + "Az előadás adatai:" + "\r\n" + performance.getInfo());
    }
}
