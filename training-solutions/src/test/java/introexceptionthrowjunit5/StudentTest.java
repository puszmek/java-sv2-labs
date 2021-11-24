package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student student = new Student();

    @Test
    void testAddNote() {
        assertEquals(0, student.getGrades().size());
        student.addNote(5);
        assertEquals(1, student.getGrades().size());
        student.addNote(4);
        assertEquals(2, student.getGrades().size());
    }

    @Test
    void testAddNoteAssertThrows() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(-1));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}
