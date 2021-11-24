package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    private Student student = new Student();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddNote() {
        assertEquals(0, student.getGrades().size());
        student.addNote(5);
        assertEquals(1, student.getGrades().size());
        student.addNote(4);
        assertEquals(2, student.getGrades().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNote0() {
        student.addNote(0);
    }

    @Test
    public void testAddNoteRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Note must be between 1 and 5!");
        student.addNote(6);
    }

    @Test
    public void testAddNoteAssertThrows() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(-1));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}
