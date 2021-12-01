package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers) {
        if (numbers.length > 0) {
            int[] temp = Arrays.copyOfRange(numbers, 1, numbers.length);
            return numbers[0] + getSum(temp);
        } else {
            return 0;
        }
    }
}
