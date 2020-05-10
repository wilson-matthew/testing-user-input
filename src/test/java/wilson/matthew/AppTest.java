package wilson.matthew;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest
{

    @Test
    public void Test() {
        ByteArrayInputStream in = new ByteArrayInputStream(("6" + System.lineSeparator()
        + "2").getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outContent);
        App.addAndPrintNumbers(in, out);
        assertEquals("Type a number: Type another number: \nSum of the" +
                " numbers: 8", outContent.toString());
    }
}
