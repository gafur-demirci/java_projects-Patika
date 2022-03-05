package IO;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // ana dizine(proje) dosya açma
        /*
        File dosya = new File("patika2.txt");
        try {
            if (dosya.createNewFile()){
                System.out.println(dosya.getName() + " isimli dosya oluşturuldu.");
            }else{
                System.out.println(dosya.getName() + " dosyası zaten mevcut.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //tek dizin ve içine dosya oluşturma
        File dizin = new File("test");
        dizin.mkdir();

        File dosya = new File("test/patika2.txt");
        try {
            dosya.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //iç içe dizin oluşturma
        File dizin = new File("src/patika/dev");
        dizin.mkdir(); //ana dizini yoksa oluşturamaz çünkü sadece en sondaki klasörü oluşturur.
        dizin.mkdirs(); // olmayan ana klasörlerle beraber hepsini oluşturur.

        //dizindeki ögeleri listeleme
        File dizin = new File("src/Collections");
        String[] liste = dizin.list();
        for (String s : liste){
            System.out.println(s);
        }

        try {
            File dosya = new File("src/IO/patika2.txt");
            dosya.createNewFile();
            FileInputStream input = new FileInputStream(dosya);
//            System.out.println(input.read());   // ilk elemanın byte değerini getirir.
            input.skip(5); // 5 byte atlar.
            int i = input.read();
            while (i != -1){
                System.out.print((char) i);
                i = input.read();
            }
            System.out.println("kullanılabilir byte sayısı : " + input.available());
            input.read();
            input.read();
            input.read();
            System.out.println("kullanılabilir byte sayısı : " + input.available());
            input.close(); // hafızada boşa çalışmaması için işlem bittiğinde kapatılmalıdır.

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         */

        //Fileoutput Stream
        String yazi = "\nOutputstream öğreniyorum.\nPatika.dev ile";
        try {
            File dosya = new File("src/IO/patika2.txt");
            FileOutputStream output = new FileOutputStream(dosya,true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
