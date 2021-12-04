package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    Woman woman;

    @BeforeEach
    void init() {
        woman = new Woman("Deák Viola");
    }

    @Test
    void testCreateWoman() {
        assertEquals("Deák Viola", woman.getName());
    }

    @Test
    void testCreateWomanWithNullName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Woman(null));
        assertEquals("Name is invalid!", iae.getMessage());
    }

    @Test
    void testCreateWomanWithInvalidName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Woman("  DeákViola   "));
        assertEquals("Name is invalid!", iae.getMessage());
    }

    @Test
    void testAddGetRegisterDates() {
        woman.addRegisterDate(new RegisterDate("születés ideje", LocalDate.parse("1983-10-22")));
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.parse("2021-11-15")));
        assertEquals(2, woman.getRegisterDates().size());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(1).getDescription());
        assertEquals("2021-11-15", woman.getRegisterDates().get(1).getDate().toString());
    }
}