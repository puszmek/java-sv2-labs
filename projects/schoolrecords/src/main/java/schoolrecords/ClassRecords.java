package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {      // magát a naplót reprezentálja, ahol felvehetők a diákok

    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        if (className == null || random == null) {
            throw new NullPointerException("Name of class and random must not be null!");
        }
        if (isEmpty(className)) {
            throw new IllegalArgumentException("Name of class must not be empty!");
        }
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {      // felvesz egy diákot az osztályba
        if (student == null) {
            throw new IllegalArgumentException("Student must not be null!");
        }
        for (Student actual : students) {
            if (student.getName().equals(actual.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {      // kivesz egy diákot az osztályból
        if (student == null) {
            throw new IllegalArgumentException("Student must not be null!");
        }
        for (Student actual : students) {
            if (student.getName().equals(actual.getName())) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {      // osztályátlagot számol, minden diákot figyelembe véve
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double count = 0;
        double sum = 0;
        for (Student actual : students) {
            if (actual.calculateAverage() == 0) {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += actual.calculateAverage();
            count++;
        }
        double result = Math.round(sum * 100 / count);
        return result / 100;
    }

    public double calculateClassAverageBySubject(Subject subject) {      // tantárgy szerinti osztályátlagot számol,
        // kihagyja azon diákokat, akiknek az adott tantárgyból nincs jegye
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double count = 0;
        double sum = 0;
        for (Student actual : students) {
            if (actual.calculateSubjectAverage(subject) != 0) {
                sum += actual.calculateSubjectAverage(subject);
                count++;
            }
        }
        double result = Math.round(sum * 100 / count);
        return result / 100;
    }

    public Student findStudentByName(String name) {       // név szerint megkeres egy diákot az osztályban
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        for (Student actual : students) {
            if (name.equals(actual.getName())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {      // felelethez a listából random módon kiválaszt egy diákot
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int index = random.nextInt(students.size());
        return students.get(index);
    }

    public List<StudyResultByName> listStudyResults() {      // a diákok nevét és tanulmányi átlagát egy-egy új objektumba viszi,
        List<StudyResultByName> result = new ArrayList<>();  // és azok listáját adja vissza
        for (Student actual : students) {
            StudyResultByName studyResultByName = new StudyResultByName(actual.getName(), actual.calculateAverage());
            result.add(studyResultByName);
        }
        return result;
    }

    public String listStudentNames() {       // kilistázza a diákok neveit, vesszővel elválasztva
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i).getName());
            if (i != (students.size() - 1)) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
