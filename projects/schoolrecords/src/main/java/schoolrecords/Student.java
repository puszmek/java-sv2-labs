package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {      // itt "tároljuk" a diákok jegyeit

    private String name;                            //  a diák neve
    private List<Mark> marks = new ArrayList<>();   // a diák jegyei

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark) {   // érdemjegy rögzítése
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {  // teljes átlag számolása
        if (isEmptyListOfMark()) {
            return 0;
        }
        double count = 0;
        double sum = 0;
        for (Mark actual : marks) {
            sum += actual.getMarkType().getMark();
            count++;
        }
        double result = Math.round(sum * 100 / count);
        return result / 100;
    }

    public double calculateSubjectAverage(Subject subject) {    // tantárgyhoz tartozó átlag számítása
        if (isEmptyListOfMark()) {
            return 0;
        }
        double count = 0;
        double sum = 0;
        for (Mark actual : marks) {
            if (subject.getSubjectName().equals(actual.getSubject().getSubjectName())) {
                sum += actual.getMarkType().getMark();
                count++;
            }
        }
        double result = Math.round(sum * 100 / count);
        return result / 100;
    }

    @Override
    public String toString() {  // diák szöveges reprezentációja
        StringBuilder sb = new StringBuilder(name).append(" marks: ");
        for (int i = 0; i < marks.size(); i++) {
            String nameOfSubject = marks.get(i).getSubject().getSubjectName();
            sb.append(nameOfSubject).append(": ").append(marks.get(i));
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    private boolean isEmptyListOfMark() {
        return marks.isEmpty();
    }
}
