package arrayofarrays;

public class DailyValues {

    public void getValues() {

        int[][] values = new int[12][];
        int[] numberOfDaysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < numberOfDaysOfMonths.length; i++) {
            values[i] = new int[numberOfDaysOfMonths[i]];
        }
        printArrayOfArrays(values);
    }

    public void printArrayOfArrays(int[][] values) {
        for (int i[]: values) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }
}
