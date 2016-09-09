/**
 * Created by Robin on 09/09/2016.
 */
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class TriangleTest {
    private Triangle triangle;
    private ByteArrayOutputStream outputStream;


    @Before
    public void beforeEach(){
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        triangle = new Triangle();
    }

    @Test
    public void printAsteriskPrintsAsterik (){
        triangle.printAsterisk();
        assertEquals("*",outputStream.toString());
    }

}
