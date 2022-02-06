package activity;

public class Coordinate {       // immutable osztály

    private double latitude;    // szélességi fok, értéke a [-90,90] intervallumon mozoghat
    private double longitude;   // hosszúsági fok, értéke a [-180,180] intervallumon mozoghat

    public Coordinate(double latitude, double longitude) {
        validateLatitude(latitude);
        validateLongitude(longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private void validateLatitude(double latitude) {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude must be from interval [-90, 90]!");
        }
    }

    private void validateLongitude(double longitude) {
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude must be from interval [-180, 180]!");
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
