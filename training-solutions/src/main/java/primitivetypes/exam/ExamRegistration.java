package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Exam exam = new Exam();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét: ");
        String name = scanner.nextLine();

        System.out.println("Adja meg a születési dátumának évét: ");
        String yearInString = scanner.nextLine();
        System.out.println("Adja meg a születési dátumának hónapját: ");
        String monthInString = scanner.nextLine();
        System.out.println("Adja meg a születési dátumának napját: ");
        String dayInString = scanner.nextLine();
        int year = Integer.parseInt(yearInString);
        int month = Integer.parseInt(monthInString);
        int day = Integer.parseInt(dayInString);
        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        System.out.println("Adja meg a lakhelye irányítószámát: ");
        String zipCodeInString = scanner.nextLine();
        int zipCode = Integer.parseInt(zipCodeInString);

        System.out.println("Adja meg a tanfolyamon szerzett osztályzatainak átlagát: ");
        String averageInString = scanner.nextLine();
        double average = Double.parseDouble(averageInString);

        Person person = new Person(name, dateOfBirth, zipCode, average);
        exam.addPerson(person);
        System.out.println(exam.getPeople());
    }
}
