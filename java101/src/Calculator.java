import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Hesap Makinesine Hoşgeldiniz...");

        double sayi1,sayi2;
        int islem;

        Scanner input = new Scanner(System.in);
        System.out.println("İşlemler:\n1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Mod");

        System.out.print("İlk sayıyı giriniz: ");
        sayi1 = input.nextDouble();

        System.out.print("İkinci sayısı giriniz: ");
        sayi2 = input.nextDouble();

        System.out.print("İşlem türünüzü seçiniz: ");
        islem = input.nextInt();

        switch (islem) {
            case 1 -> System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
            case 2 -> System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
            case 3 -> System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
            case 4 -> System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
            case 5 -> System.out.println(sayi1 + " % " + sayi2 + " = " + (sayi1 % sayi2));
            default -> System.out.println("Hesap makinesinden çıkılıyor.");
        }

    }
}
