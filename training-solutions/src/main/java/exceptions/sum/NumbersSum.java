package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter is not null!");
        }
        return sumNumbers(numbers);
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter is not null!");
        }
        int[] convertNumber;
        try {
            convertNumber = convertNumbers(numbers);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Invalid numbers!");
        }
        return sumNumbers(convertNumber);
    }

    private int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int actual : numbers) {
            sum += actual;
        }
        return sum;
    }

    private int[] convertNumbers(String[] numbers) {
        int[] convertNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            convertNumber[i] = Integer.parseInt(numbers[i]);
        }
        return convertNumber;
    }
}
