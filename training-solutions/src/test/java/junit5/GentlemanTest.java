package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testSayHello() {
//        Given
        Gentleman gentleman = new Gentleman();
//        When
        String text = gentleman.sayHello("John Doe");
//        Then
        assertEquals("Hello John Doe", text);
    }

    /*
    Hibás program:
    org.opentest4j.AssertionFailedError:
    Expected :Hello John Doe
    Actual   :Hell John Doe

    Hibás teszteset:
    org.opentest4j.AssertionFailedError:
    Expected :Helo John Doe
    Actual   :Hello John Doe
     */

    @Test
    void testAnonymous() {
//        Given
        Gentleman gentleman = new Gentleman();
//        When
        String text = gentleman.sayHello(null);
//        Then
        assertEquals("Hello Anonymous", text);
    }
}
