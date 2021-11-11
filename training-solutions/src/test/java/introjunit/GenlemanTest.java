package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GenlemanTest {

    @Test
    public void testSayHello() {
        Gentleman gentleman = new Gentleman();
        String text = gentleman.sayHello("John Doe");
        assertThat(text, equalTo("Hello John Doe"));
    }

/* Gyakorlati feladat - Hibás teszt

    Hibás program:
    java.lang.AssertionError:
    Expected: "Hello John Doe"
         but: was "Hell John Doe"
    Expected :Hello John Doe
    Actual   :Hell John Doe

    Hibás teszt:
    java.lang.AssertionError:
    Expected: "Hi John Doe"
         but: was "Hello John Doe"
    Expected :Hi John Doe
    Actual   :Hello John Doe
 */
}
