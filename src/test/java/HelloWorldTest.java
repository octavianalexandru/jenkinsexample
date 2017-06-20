import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by aoctavian on 6/20/2017.
 */
public class HelloWorldTest {

    @Test
    public void testHelloWorldReturnsString() throws Exception {
        HelloWorld helloWorld= new HelloWorld();
        String s = helloWorld.helloWorld();
        Assertions.assertEquals("Hello World modified!", s);

    }

}
