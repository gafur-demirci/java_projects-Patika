import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {

        double Km, tlToKm, total;
        tlToKm = 2.20d;
        int taximeterOpen = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Ne kadar gittiğinizi giriniz(km) : ");
        Km = input.nextDouble();

        total = (Km * tlToKm) + taximeterOpen;

        String result = total < 20 ? "Toplam tutarınız 20 tl'dir." :
                "Ödemeniz gereken toplam ücret: " + total;

        System.out.println(result);


    }
}
