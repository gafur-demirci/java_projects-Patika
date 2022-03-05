package BufferedReaderAndWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        // BufferedReader
        try {
            FileReader file = new FileReader("src/BufferedReaderAndWriter/patika.txt");
            BufferedReader input = new BufferedReader(file);

            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // BufferedWriter
        String data = "Java 102 Dersleri";

        try {
            FileWriter file = new FileWriter("src/BufferedReaderAndWriter/patika.txt");

            BufferedWriter output = new BufferedWriter(file);

            output.write(data);

            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
