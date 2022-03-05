package BufferedStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //BufferedInputStream
        /*
        try {
            File dosya = new File("src/BufferedStream/patika2.txt");
            dosya.createNewFile();
            String yazi = "Outputstream ogreniyorum.\nPatika.dev ile";
            FileOutputStream output = new FileOutputStream(dosya,true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            FileInputStream fileInput = new FileInputStream("src/BufferedStream/patika2.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);
            int i = buffInput.read();
            while(i != -1){
                System.out.print((char) i);
                i = buffInput.read();
            }
            output.close();
            fileInput.close();
            buffInput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        //BufferedOutputStream
        String data = "Java 102 Patikasi";
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/BufferedStream/patika2.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput);
            byte[] byteArr = data.getBytes();
            buffOutput.write(byteArr);
            buffOutput.close();
            fileOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
