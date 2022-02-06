package activity;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint point) {   // egy másik ponttól vett távolságot adja vissza
        final double RADIUS = 6371; // Radius of the earth
        double latDistance = Math.toRadians(point.coordinate.getLatitude() - this.coordinate.getLatitude());
        double lonDistance = Math.toRadians(point.coordinate.getLongitude() - this.coordinate.getLongitude());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.coordinate.getLatitude())) * Math.cos(Math.toRadians(point.coordinate.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distanceInMeters = RADIUS * c * 1000;
        double height = this.elevation - point.elevation;
        distanceInMeters = Math.pow(distanceInMeters, 2) + Math.pow(height, 2);
        return Math.sqrt(distanceInMeters);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
}
