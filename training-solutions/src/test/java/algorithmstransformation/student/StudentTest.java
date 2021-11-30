package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCreateStudent() {
        Student student = new Student("Kiss Péter", "6000 Kecskemét, Kerekes utca 28.");
        assertEquals("Kiss Péter", student.getName());
        assertEquals("6000 Kecskemét, Kerekes utca 28.", student.getAddress());
    }
}