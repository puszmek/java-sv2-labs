package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Jack Doe");
        Student student2 = new Student("John Boe");
        Student student3 = new Student("Jane Foe");
        Student student4 = new Student("Jill Loe");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        student1.setActive(false);
        student3.setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student stud: students) {
            if (!(stud.isActive())) {
                studentsToRemove.add(stud);
            }
        }

        System.out.println("Hallgatók száma:" + students.size());
        students.removeAll((studentsToRemove));
        System.out.println("Aktív hallgatók száma: " + students.size());
    }
}
