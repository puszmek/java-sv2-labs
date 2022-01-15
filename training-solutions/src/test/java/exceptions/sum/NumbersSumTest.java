package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void testGetSumInt() {
        int sum = numbersSum.getSum(new int[]{0, -5, 10, 15});
        assertEquals(20, sum);
    }

    @Test
    void testGetSumString() {
        int sum = numbersSum.getSum(new String[]{"0", "-5", "10", "15", "-1"});
        assertEquals(19, sum);
    }

    @Test
    void testGetSumIntWithNullParameter() {
        int[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Parameter is not null!", exception.getMessage());
    }

    @Test
    void testGetSumStringWithNullParameter() {
        String[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Parameter is not null!", exception.getMessage());
    }

    @Test
    void testGetSumStringWithIllegalNumbers() {
        String[] numbers = new String[]{"0", "j", "-2", "10"};
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Invalid numbers!", exception.getMessage());
    }
}