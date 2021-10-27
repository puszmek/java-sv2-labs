package finalmodifier;

public class CylinderCalculator {

    public double calculateVolume(double r, double h) {
        return Math.pow(r, 2) * CircleCalculator.PI * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        return (2 * Math.pow(r, 2) * CircleCalculator.PI) + (h * 2 * r * CircleCalculator.PI);
    }
}
