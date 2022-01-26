package collectionsiterator.onlinelesson;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> onlineLessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return onlineLessons;
    }

    public void addNewLesson(OnlineLesson lesson) {
        int index = onlineLessons.size();
        for (int i = 0; i < index - 1; i++) {
            LocalDateTime startTimeBefore = onlineLessons.get(i).getStartTime();
            LocalDateTime startTimeAfter = onlineLessons.get(i + 1).getStartTime();
            LocalDateTime startTimeOfLesson = lesson.getStartTime();
            if (startTimeBefore.isBefore(startTimeOfLesson) && startTimeAfter.isAfter(startTimeOfLesson)) {
                index = i + 1;
            }
        }
        onlineLessons.add(index, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> lessonsByTitle = new ArrayList<>();
        for (Iterator<OnlineLesson> i = onlineLessons.iterator(); i.hasNext();) {
            OnlineLesson ol = i.next();
            if (ol.getLessonTitle().equals(title)) {
                lessonsByTitle.add(ol);
            }
        }
        return lessonsByTitle;
    }

    public void removeLesson(LocalDateTime startTime) {
        for (Iterator<OnlineLesson> i = onlineLessons.iterator(); i.hasNext();) {
            OnlineLesson ol = i.next();
            if (ol.getStartTime().equals(startTime)) {
                i.remove();
            }
        }
    }
}
