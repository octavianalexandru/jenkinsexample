import org.junit.jupiter.api.Assertions;

/**
 * Created by aoctavian on 6/20/2017.
 */
public class HelloWorldTest {

    public void testHelloWorldReturnsString() throws Exception {

        HelloWorld helloWorld= new HelloWorld();
        String s = helloWorld.helloWorld();
        Assertions.assertEquals("Hello World!", s);

    }

}
