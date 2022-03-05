package InputReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src/InputReader/patika2.txt");
//            InputStreamReader ınputReader = new InputStreamReader(fileInput,"Big5");
            InputStreamReader ınputReader = new InputStreamReader(fileInput, Charset.forName("GB2312"));

            System.out.println(ınputReader.getEncoding());
            int i = ınputReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = ınputReader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
