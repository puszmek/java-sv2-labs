package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
        double minLatitude = findMinimumCoordinate().getLatitude();
        double maxLatitude = findMaximumCoordinate().getLatitude();
        double minLongitude = findMinimumCoordinate().getLongitude();
        double maxLongitude = findMaximumCoordinate().getLongitude();
        double sizeA = maxLatitude - minLatitude;
        double sizeB = maxLongitude - minLongitude;
        return sizeA * sizeB;
    }

    public void loadFromGpx(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            Coordinate coordinate = null;
            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("<trkpt")) {
                    double latitude = Double.parseDouble(line.substring(15, 25));
                    double longitude = Double.parseDouble(line.substring(32, 42));
                    coordinate = new Coordinate(latitude, longitude);
                } else if (line.trim().startsWith("<ele")) {
                    double elevation = Double.parseDouble(line.substring(9, 14));
                    trackPoints.add(new TrackPoint(coordinate, elevation));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found!", ioe);
        }
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
