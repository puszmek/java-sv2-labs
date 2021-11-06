package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int numberOfNewDirections = 0;
        int angle = 0;
        for (int i = 10; angle < 360; i = i + 10 ) {
            angle += i;
            numberOfNewDirections += 1;
        }
        return numberOfNewDirections;
    }

    public static void main(String[] args) {

        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
