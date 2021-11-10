package meetingrooms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();

    public void runMenu() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdja meg a kiválasztott menüpont számát!");
        int numberOfMenu = scanner.nextInt();
        scanner.nextLine();
        selectMenu(numberOfMenu);
    }

    public void printMenu() {
        List<String> menu = Arrays.asList(
                "1. Tárgyaló rögzítése",
                "2. Tárgyalók sorrendben",
                "3. Tárgyalók visszafele sorrendben",
                "4. Minden második tárgyaló",
                "5. Területek",
                "6. Keresés pontos név alapján",
                "7. Keresés névtöredék alapján",
                "8. Keresés terület alapján",
                "9. Kilépés");
        for (String m: menu) {
            System.out.println(m);
        }
    }

    private void selectMenu(int number) {
        /* Hajtsa végre a számhoz tartozó funkciót!
        A funkció végrehajtása után írja ki újra a menüt!
        A Kilépés menüpontra lépjen ki.

        A runMenu() kiírja a menüt a printMenu() meghívásával,
        és bekéri a felhasználótól a menüpont számát,
        majd egy elágazás alapján meghívja az Office megfelelő metódusát.
        Ha annak kell paraméter, akkor azt ez a metódus kéri be a felhasználótól.

        Az egyes menüpont kiválasztásakor meghívja a readOffice() metódust.
        Ez bekéri egy tárgyalót,
        majd az addMeetingRoom() metódussal beteszi az Office példányba.
         */
    }

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a tárgyaló nevét!");
        String name = scanner.nextLine();
        System.out.println("Adja meg a tárgyaló szélességét méterben, egész számként!");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a tárgyaló hosszát méterben, egész számként!");
        int length = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
