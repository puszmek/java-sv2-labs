package interfacedefaultmethods.cloth;

public interface Square {

    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return getSide() * Math.sqrt(2);
    }

    default double getPerimeter() {
        double lengthOfSide = getSide();
        return lengthOfSide * 4;
    }

    default double getArea() {
        double lengthOfSide = getSide();
        return Math.pow(lengthOfSide, 2);
    }

    double getSide();
}
