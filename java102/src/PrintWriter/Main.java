package PrintWriter;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        String data = "Java 102";
        try {
            PrintWriter writer = new PrintWriter("src/PrintWriter/patika.txt");
            writer.print(data);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
