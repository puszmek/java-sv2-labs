package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students) {
        for (String student: students) {
            if (student.length() <= 10) {
                System.out.println(student + " - 1-es tanulócsoport");
            } else {
                System.out.println(student + " - 2-es tanulócsoport");
            }
        }
    }

    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        List<String> students = Arrays.asList("Jonathan Doe", "Jackson Doe", "Jane Boe", "Jill Foe");
        studyGroup.printStudyGroups(students);
    }
}
