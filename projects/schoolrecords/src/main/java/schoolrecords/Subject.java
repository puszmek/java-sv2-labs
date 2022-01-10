package schoolrecords;

public class Subject {      // a tantárgy nevének tárolására

    private String subjectName;     // a tantárgy neve

    public Subject(String subjectName) {
        if (subjectName == null) {
            throw new NullPointerException("Name must not be null!");
        }
        if (isEmpty(subjectName)) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    private boolean isEmpty(String str) {
        return str.isBlank();
    }
}
