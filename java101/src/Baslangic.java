public class Baslangic {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World");
        System.out.println("Tam Sayi Veri Tipleri: ");

        byte byte1 = 20;            // -128 ile 127                                   8 bit
        short short1 = 100;         // -32768 ile 32767                              16 bit
        int int1 = 5;               // -2147483648 ile 2147483647                    32 bit
        long long1 = 123569;        // -9223372036854775808 ile 9223372036854775807  64 bit

        System.out.println("Byte1 : " + byte1);
        System.out.println("Short1 : " + short1);
        System.out.println("Num1 : " + int1);
        System.out.println("Long1 : " + long1);

        System.out.println("Ondalıklı Sayı Veri Tipleri: ");

        float float1 = 125.579f;                  // 1.4*10^-45 ile 3.4*10^38        32 bit
        double double1 = 1235564.156789654d;      // 4.9*10^-324 ile 1.8*10^308      64 bit

        System.out.println("Float1 : " + float1);
        System.out.println("Double1 : " + double1);

        System.out.println("Char ve Boolean Veri Tipleri: ");

        char char1 = 'G';
        char char2 = 71;
        boolean bool1 = false;

        System.out.println("Char1 : " + char1);
        System.out.println("Char2 : " + char2);
        System.out.println("Bool1 : " + bool1);
        */
        int a = 5 , b = 8;
        boolean sonuc = a == b;
        System.out.println(sonuc);

        // ve -> &&  ,   veya -> ||  ,  değil -> !

        boolean karsilastirma1 = a > b;
        boolean karsilastirma2 = a == b;
        boolean sonuc2 = karsilastirma1 || karsilastirma2;
        System.out.println("Sonuc2 : " + sonuc2);

        String sonuc3 = (sonuc2) ? "Dogru" : "Yanlis";
        int result = sonuc2 ? 1 : 0;
        System.out.println("Sonuc3 : " + sonuc3);
        System.out.println("Result : " + result);

        byte b1 = 0;
        int a1 = b1++;
        System.out.print(a1);
    }
}