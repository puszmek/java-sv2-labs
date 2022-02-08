package activity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
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

    public List<Report> distancesByTypes() {
        Map<ActivityType, Double> mapResult = new LinkedHashMap<>();
        fillMapWithActivityTypes(mapResult);
        fillMapWithDistances(mapResult);
        List<Report> result = mapResult.entrySet().stream()
                .map(m -> new Report(m.getKey(), m.getValue()))
                .toList();
        return result;
    }

    private void fillMapWithActivityTypes(Map<ActivityType, Double> mapResult) {
        for (ActivityType actual : ActivityType.values()) {
            mapResult.put(actual, 0d);
        }
    }

    private void fillMapWithDistances(Map<ActivityType, Double> mapResult) {
        for (Activity actual : activities) {
            double distance = mapResult.get(actual.getType()) + actual.getDistance();
            mapResult.put(actual.getType(), distance);
        }
    }
}
