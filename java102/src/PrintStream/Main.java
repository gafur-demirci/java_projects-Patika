package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        try {
            PrintStream output = new PrintStream("src/PrintStream/print.txt");
            output.print(123 + "152");
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
