package collectionscomp.student;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student firstStudent = new Student("Kovács Ferenc", 172);
        Student secondStudent = new Student("Lázár Tímea", 165);
        Student thirdStudent = new Student("Szép Helga", 163);
        Student fourthStudent = new Student("Szerda Rita", 164);
        Student fifthStudent = new Student("Magyar Tibor", 169);
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);
        System.out.println(students);

        Map<String, Integer> studentsMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        for (Student actual : students) {
            studentsMap.put(actual.getName(), actual.getHeight());
        }
        System.out.println(studentsMap);
    }
}
