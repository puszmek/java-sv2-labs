package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;                // a tanár neve
    private List<Subject> subjects;     // a tanított tantárgyak listája

    public Tutor(String name, List<Subject> subjects) {
        if (name == null || subjects == null) {
            throw new NullPointerException("Name and subjects must not be null!");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
        this.name = name;
        this.subjects = subjects;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject actual : subjects) {
            if (subject.getSubjectName().equals(actual.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    private boolean isEmpty (String str) {
        return str.isBlank();
    }
}
