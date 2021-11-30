package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        MaxAgeCalculator calculator = new MaxAgeCalculator();
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Kiss Péter", 35),
                new Trainer("Varga Irén", 52),
                new Trainer("Balogh Ákos", 22));
        assertEquals("Varga Irén", calculator.getTrainerWithMaxAge(trainers).getName());
        assertEquals(52, calculator.getTrainerWithMaxAge(trainers).getAge());
    }
}