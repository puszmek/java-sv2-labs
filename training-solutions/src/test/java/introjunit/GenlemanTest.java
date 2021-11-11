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
}
