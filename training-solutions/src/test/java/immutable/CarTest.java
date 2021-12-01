package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreateCar() {
        Car car = new Car("Ford", "Fiesta", 2020);
        assertEquals("Ford", car.getBrand());
        assertEquals("Fiesta", car.getModel());
        assertEquals(2020, car.getYearOfProduction());
    }

    @Test
    void testCreateCarWithNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Car(null, "Fiesta", 2020));
        assertEquals("A márka nem lehet üres!", exception.getMessage());
    }

    @Test
    void testCreateCarWithEmptyName() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Car("", "Fiesta", 2020));
        assertEquals("A márka nem lehet üres!", exception.getMessage());
    }

    @Test
    void testCreateCarWithYearInTheFuture() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Car("Ford", "Fiesta", 2030));
        assertEquals("A gyártási év nem lehet a jelenleginél későbbi év!", exception.getMessage());
    }
}