package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.PI);
        System.out.println(circleCalculator.calculatePerimeter(5));
        System.out.println(circleCalculator.calculateArea(5));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(10, 5));
        System.out.println(cylinderCalculator.calculateSurfaceArea(10, 5));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(10, 5));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(10, 5));

    }
}
