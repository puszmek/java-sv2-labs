package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testCreateTrainer() {
        Trainer trainer = new Trainer("Balogh Ákos", 22);
        assertEquals("Balogh Ákos", trainer.getName());
        assertEquals(22, trainer.getAge());
    }
}