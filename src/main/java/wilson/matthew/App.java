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

        out.print("Type a positive number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        if (firstNumber < 0) {
            out.print("Number has to be positive");
            return;
        }

        out.print("Type another positive number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        if (secondNumber < 0) {
            out.print("Number has to be positive");
            return;
        }

        out.println();
        out.print("Sum of the numbers: " + (firstNumber + secondNumber));
    }
}
