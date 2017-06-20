import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by aoctavian on 6/20/2017.
 */
public class HelloUniverseTest {

    @Test
    public void testHelloUniverseReturnsString() throws Exception {
        HelloUniverse helloUniverse= new HelloUniverse();
        String s = helloUniverse.helloUniverse();
        Assertions.assertEquals("Hello Universe !", s);

    }
}
