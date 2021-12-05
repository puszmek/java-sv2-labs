package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    private List<FieldPoint> fieldPoints = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Time of logging must not be null!");
        }
        for (FieldPoint actual : fieldPointsToLog) {
            actual.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(actual);
        }
    }

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }
}
