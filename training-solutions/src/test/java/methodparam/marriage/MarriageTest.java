package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarriage(){
        Man man = new Man("Kiss Péter");
        Woman woman = new Woman("Deák Viola");
        new Marriage().getMarried(woman, man);

        assertEquals("Kissné Deák Viola", woman.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", woman.getRegisterDates().get(0).getDescription());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(0).getDate());
    }

    @Test
    void testGetMarriageWithInvalidNames(){
        Marriage marriage = new Marriage();
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> marriage.getMarried(null, null));
        assertEquals("Bride or groom is missing!", err.getMessage());
    }
}