import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        try {
            assertNotNull("app should have a greeting", classUnderTest.getGreeting("Vincent", "Vega"));
        } catch(IOException e) {
            // nothing
        }
        
    }
}
