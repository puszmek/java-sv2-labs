package methodparam.sums;

public class Sums {

    private double sumOfPositiveNumbers;
    private double sumOfNegativeNumbers;

    public void addNumber(double number) {
        if (number > 0) {
            sumOfPositiveNumbers += number;
        } else {
            sumOfNegativeNumbers += number;
        }
    }

    public double getSumOfPositiveNumbers() {
        return sumOfPositiveNumbers;
    }

    public double getSumOfNegativeNumbers() {
        return sumOfNegativeNumbers;
    }
}
