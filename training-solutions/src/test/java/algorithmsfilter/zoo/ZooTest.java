package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    List<Animal> animals = new ArrayList<>();
    Zoo zoo = new Zoo(animals);

    @Test
    void testAddAnimal(){
        zoo.addAnimal(new Animal("tigris", 4));
        assertEquals(1, animals.size());
        assertEquals("tigris", animals.get(0).getName());
        assertEquals(4, animals.get(0).getNumberOfLegs());
    }

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        List<Animal> animals = Arrays.asList(
                new Animal("oroszlán", 4),
                new Animal("zebra", 4),
                new Animal("kígyó", 0),
                new Animal("strucc", 2));
        zoo = new Zoo(animals);
        List<Animal> result = zoo.getAnimalsWithNumberOfLegsGiven(4);
        assertEquals(2, result.size());
        assertEquals("zebra", result.get(1).getName());
    }
}