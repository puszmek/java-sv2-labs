package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét!");
        String name = scanner.nextLine();
        System.out.println("Adja meg a film címét!");
        String title = scanner.nextLine();
        System.out.println("Adja meg a vásárolandó jegyek számát!");
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        System.out.println("Adja meg, melyik sorba kéri a jegyeket!");
        String lineOfSeats = scanner.nextLine();

        StringBuilder sb = new StringBuilder("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: " + "\n");
        sb.append("Vásárló neve: ").append(name)
                .append("\n" + "Film címe: ").append(title)
                .append("\n" + "Lefoglalt helyek: ");
        for (int i = 1; i <= numberOfTickets; i++) {
            sb.append(lineOfSeats).append(". sor ").append(i).append(". szék");
            if (i < numberOfTickets) {
                sb.append(", ");
            }
        }
        sb.append("\n" + "Jó szórakozást!");
        System.out.println(sb);
    }
}
