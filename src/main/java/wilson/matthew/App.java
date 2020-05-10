package wilson.matthew;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        addAndPrintNumbers(System.in, System.out);
    }

    static void addAndPrintNumbers(InputStream in, PrintStream out) {
        Scanner reader = new Scanner(in);
        out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        out.println();
        out.print("Sum of the numbers: " + (firstNumber + secondNumber));
    }
}
