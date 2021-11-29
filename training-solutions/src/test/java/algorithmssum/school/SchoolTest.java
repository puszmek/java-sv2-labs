package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    School school = new School();

    @Test
    void testGetNumberOfStudents() {
        List<Integer> headcounts = Arrays.asList(27, 33, 30, 28, 29);
        List<Integer> headcounts0 = new ArrayList<>();
        assertEquals(147, school.getNumberOfStudents(headcounts));
        assertEquals(0, school.getNumberOfStudents(headcounts0));
    }
}