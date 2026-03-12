import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testOutput() {
        String message = "Hello, Jenkins CI/CD!";
        assertEquals("Hello, Jenkins CI/CD!", message);
    }
}
