package collectionsset.physicaleducation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student actual : students) {
            heights.add(actual.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation pe = new PhysicalEducation();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kovács Péter", 171));
        students.add(new Student("Horti Dénes", 178));
        students.add(new Student("Ferenc Sára", 164));
        students.add(new Student("Torma Anna", 165));
        System.out.println(pe.getOrderInLessons(students));
    }
}
