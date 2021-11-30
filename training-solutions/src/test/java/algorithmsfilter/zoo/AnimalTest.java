package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testCreateAnimal() {
        Animal animal = new Animal("oroszlán", 4);
        assertEquals("ló", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }
}