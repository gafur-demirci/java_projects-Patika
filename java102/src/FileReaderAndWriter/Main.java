package FileReaderAndWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // File Reader
        try {
            FileReader input = new FileReader("src/FileReaderAndWriter/patika.txt");

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        String data = "Patika Java102 Dersleri";
        // File Writer
        try {
            FileWriter output = new FileWriter("src/FileReaderAndWriter/patika.txt");
            output.write(data);

            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }


    }
}
