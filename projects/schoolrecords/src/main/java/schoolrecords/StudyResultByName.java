package schoolrecords;

public class StudyResultByName {      // Speciális osztály, a diák nevét és tantárgyi átlagát tartalmazza.

    private String studentName;    //  a diák neve
    private double studyAverage;   // az össztantárgyi átlaga

    public StudyResultByName(String studentName, double studyAverage) {
        if (studentName == null) {
            throw new NullPointerException("Name must not be null!");
        }
        if (isEmpty(studentName)) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
        this.studentName = studentName;
        this.studyAverage = studyAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }

    private boolean isEmpty (String str) {
        return str.isBlank();
    }
}
