import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        System.out.println("Vücut Kütle İndeksi Hesaplama Programına Hoşgeldiniz...");
        double height,weight,bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen metre cinsinden boyunuzu giriniz: ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextDouble();

        bmi = ((weight) / (height*height));

        if (bmi < 18.49)
        {
            System.out.println("BMİ değeriniz: " + bmi + "\nKilonuz, ideal kilonuzun altında.");
        }
        else if (bmi < 24.99d)
        {
            System.out.println("BMİ değeriniz: " + bmi + "\nKilonuz ideal.");
        }
        else if (bmi < 29.99d)
        {
            System.out.println("BMİ değeriniz: " + bmi + "\nKilonuz ideal kilonuzun üzerinde");
        }
        else
        {
            System.out.println("BMİ değeriniz: " + bmi + "\nKilonuz ideal kilonuzun çok üzerinde.");
        }
    }
}
