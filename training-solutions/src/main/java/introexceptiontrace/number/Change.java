package introexceptiontrace.number;

import java.util.Arrays;

public class Change {

    public int[] changeNumbers() {
        int[] numbers = new RandomOperations().getNumbers();
//        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        return numbers;
    }
}
