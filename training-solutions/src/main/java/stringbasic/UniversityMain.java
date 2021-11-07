package stringbasic;

import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {

        Person firstPerson = new Person("Kiss Péter", "kisspeter@gmail.com", "4567-8900", "111111-222222-333333", "+36309876543");
        Student firstStudent = new Student(firstPerson, "QWE123", "11223344");

        Person secondPerson = new Person("Molnár Nagy Rebeka", "mnrebeka@gmail.com", "1234-1111", "222222-333333-444444", "+36301472580");
        Student secondStudent = new Student(secondPerson, "QAE789", "99887766");

        Person thirdPerson = new Person("Nagy Rebeka", "nagyrebi@gmail.com", "9865-7410", "333333-444444-555555", "+36303692587");
        Student thirdStudent = new Student(thirdPerson, "QAE789", "99887766");

        University university = new University();
        university.addStudent(firstStudent);
        university.addStudent(secondStudent);
        university.addStudent(thirdStudent);

        System.out.println(university.areEqual(firstStudent, secondStudent));
        System.out.println(university.areEqual(firstStudent, thirdStudent));
        System.out.println(university.areEqual(secondStudent, thirdStudent));

        firstStudent.setEntranceCardNumber("ABC-654");
        System.out.println(firstStudent.getEntranceCardNumber());
        secondStudent.setEntranceCardNumber("DEF-654");
        System.out.println(secondStudent.getEntranceCardNumber());
    }
}
