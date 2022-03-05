package ByteArrayIOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        byte[] dizi = {1,2,3,44,66,78, 6 ,12,55};
//        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        ByteArrayInputStream input = new ByteArrayInputStream(dizi,2,4);
        System.out.println("Kullanılabilir byte sayısı : " + input.available());
        int i = input.read();
        while(i != -1){
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        String data = "Java 102 Dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();
        try {
            output.write(dataByteArray);
            String streamStr = output.toString();
            System.out.println("Çıkış akışı : "+ streamStr);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
