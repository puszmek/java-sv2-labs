package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {

    }

    public int numberOfTrackActivities() {
        return (int) activities.stream().
                filter(activity -> activity instanceof ActivityWithTrack).
                count();
//        int count = 0;
//        for (Activity actual : activities) {
//            if (actual instanceof ActivityWithTrack) {
//                count++;
//            }
//        }
//        return count;
    }

    public int numberOfWithoutTrackActivities() {
            return  activities.size() - numberOfTrackActivities();
    }
}
