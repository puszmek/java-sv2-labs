package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testGetTodayReferringStudentWithIntParameter() {
        String name = classFiveA.getTodayReferringStudent(5);
        assertEquals("Tóth Janka", name);
    }

    @Test
    void testGetTodayReferringStudentWithNumberParameter() {
        String name = classFiveA.getTodayReferringStudent(Number.FIVE);
        assertEquals("Tóth Janka", name);
    }

    @Test
    void testGetTodayReferringStudentWithStringParameter() {
        String name = classFiveA.getTodayReferringStudent("five");
        assertEquals("Tóth Janka", name);
    }
}