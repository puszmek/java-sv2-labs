package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(102.3, true);
        System.out.println("Distance " + distance.getDistanceInKm() + " is " + distance.isExact() + ".");

        int distanceCasting = (int) distance.getDistanceInKm();
        System.out.println(distanceCasting);

    }

}