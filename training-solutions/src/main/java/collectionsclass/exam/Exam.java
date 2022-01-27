package collectionsclass.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    private List<ExamResult> examResults = new ArrayList<>();

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> results = new ArrayList<>(examResults);
        if (places > results.size()) {
            places = results.size();
        }
        results.sort(new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return Integer.valueOf(o1.getResult()).compareTo(o2.getResult());
            }
        });
        Collections.reverse(results);
        return getListOfNames(results, places);
    }

    private List<String> getListOfNames(List<ExamResult> results, int places) {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < places; i++) {
            names.add(results.get(i).getName());
        }
        return names;
    }
}
