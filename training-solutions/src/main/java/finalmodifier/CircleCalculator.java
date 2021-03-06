package finalmodifier;

public class CircleCalculator {

    public static final double PI = 3.14;

    public double calculatePerimeter(double r){
        return 2 * r * PI;
    }

    double calculateArea(double r) {
        return Math.pow(r, 2) * PI;
    }
}
