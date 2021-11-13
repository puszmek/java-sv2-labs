package meetingrooms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();

    public void runMenu() {
        System.out.println();
        printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdja meg a kiválasztott menüpont számát: ");
        int numberOfMenu = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
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
        Scanner scanner = new Scanner(System.in);
        switch (number) {
            case 1:
                readOffice();
                runMenu();
                break;
            case 2:
                office.printNames();
                runMenu();
                break;
            case 3:
                office.printNamesReverse();
                runMenu();
                break;
            case 4:
                office.printEvenNames();
                runMenu();
                break;
            case 5:
                office.printAreas();
                runMenu();
                break;
            case 6:
                System.out.print("Adja meg a tárgyaló nevét: ");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
                runMenu();
                break;
            case 7:
                System.out.print("Adja meg a névtöredéket: ");
                String part = scanner.nextLine();
                office.printMeetingRoomsContains(part);
                runMenu();
                break;
            case 8:
                System.out.print("Adja meg a tárgyaló területét, egséz számként: ");
                int area = scanner.nextInt();
                scanner.nextLine();
                office.printAreasLargerThan(area);
                runMenu();
                break;
            case 9: break;
        }
    }

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a tárgyaló nevét: ");
        String name = scanner.nextLine();
        System.out.print("Adja meg a tárgyaló szélességét méterben, egész számként: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Adja meg a tárgyaló hosszát méterben, egész számként: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
