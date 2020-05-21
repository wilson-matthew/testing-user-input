package wilson.matthew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(outContent);
    ByteArrayInputStream in;

    @Test
    public void testSuccess() {
        in = new ByteArrayInputStream(("6" + System.lineSeparator()
                + "2").getBytes());
        App.addAndPrintNumbers(in, out);
        assertEquals("Type a positive number: Type another positive number: \nSum of the" +
                " numbers: 8", outContent.toString());

        outContent.reset();

        in = new ByteArrayInputStream(("4" + System.lineSeparator() + "1").getBytes());
        App.addAndPrintNumbers(in, out);
        assertEquals("Type a positive number: Type another positive number: \nSum of the" +
                " numbers: 5", outContent.toString());
    }

    @Test
    public void testFailure() {
        in = new ByteArrayInputStream(("-5" + System.lineSeparator() + "7").getBytes());
        App.addAndPrintNumbers(in, out);
        assertEquals("Type a positive number: Number has to be positive", outContent.toString());

        outContent.reset();

        in = new ByteArrayInputStream(("10" + System.lineSeparator() + "-4").getBytes());
        App.addAndPrintNumbers(in, out);
        assertEquals("Type a positive number: Type another positive number: Number has" +
                " to be positive", outContent.toString());
    }
}
