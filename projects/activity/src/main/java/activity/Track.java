package activity;

import java.util.*;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double difference = trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            if (difference > 0) {
                sum += difference;
            }
        }
        return sum;
    }

    public double getFullDecrease() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double difference = trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            if (difference > 0) {
                sum += difference;
            }
        }
        return sum;
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double difference = trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
            sum += difference;
        }
        return sum;
    }

    public Coordinate findMinimumCoordinate() {
        List<Double> latitudes = trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate().getLatitude()).sorted().toList();
        List<Double> longitudes = trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate().getLongitude()).sorted().toList();
        double minLatitude = latitudes.get(0);
        double minLongitude = longitudes.get(0);
        Coordinate minimum = new Coordinate(minLatitude, minLongitude);
        return minimum;
    }

    public Coordinate findMaximumCoordinate() {
        List<Double> latitudes = trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate().getLatitude()).sorted().toList();
        List<Double> longitudes = trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate().getLongitude()).sorted().toList();
        double maxLatitude = latitudes.get(latitudes.size() - 1);
        double maxLongitude = longitudes.get(longitudes.size() - 1);
        Coordinate maximum = new Coordinate(maxLatitude, maxLongitude);
        return maximum;
    }

    public double getRectangleArea() {

    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
