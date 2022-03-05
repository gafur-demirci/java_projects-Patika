import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {

        double n,total = 0,temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        temp = n;
        while (n > 0) {
            total += (1/n);
            n--;
        }

        System.out.println("Girilen " + temp + " sayısının harmonik seri toplamı : " + total);
    }
}
