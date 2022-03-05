package OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {

        String data = "ĞİÜŞ";

        try {
            // FileOutputStream
            FileOutputStream file = new FileOutputStream("src/OutputStreamWriter/patika.txt");

            // OutputStreamWriter
            OutputStreamWriter output = new OutputStreamWriter(file);

            output.write(data);

            output.close();
            file.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
