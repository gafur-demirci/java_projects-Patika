import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {

        System.out.println("Manav Kasa Programına Hoşgeldiniz...");

        double pearKilo, appleKilo, tomatoKilo, bananaKilo, aubergineKilo,
               pearPrice = 2.14d, applePrice = 3.67d, tomatoPrice = 1.11d,
               bananaPrice = 0.95d, auberginePrice = 5.00d;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo armut almak istiyorsunuz? : ");

        pearKilo = input.nextDouble();
        double totalPearPrice = pearPrice * pearKilo;

        System.out.print("Kaç kilo elma almak istiyorsunuz? : ");

        appleKilo = input.nextDouble();
        double totalApplePrice = applePrice * appleKilo;

        System.out.print("Kaç kilo domates almak istiyorsunuz? : ");

        tomatoKilo = input.nextDouble();
        double totalTomatoPrice = tomatoPrice * tomatoPrice;

        System.out.print("Kaç kilo muz almak istiyorsunuz? : ");

        bananaKilo = input.nextDouble();
        double totalBananaPrice = bananaPrice * bananaKilo;

        System.out.print("Kaç kilo patlıcan almak istiyorsunuz? : ");

        aubergineKilo = input.nextDouble();
        double totalAuberginePrice = auberginePrice * aubergineKilo;

        double totalPrice = totalPearPrice + totalApplePrice + totalTomatoPrice + totalBananaPrice +totalAuberginePrice;

        System.out.println("Yaptığınız alışveriş : " +
                "\nArmut kilosu: " + pearKilo + " , Tutarı: " + totalPearPrice +
                "\nElma kilosu: " + appleKilo + " , Tutarı: " + totalApplePrice +
                "\nDomates kilosu: " + tomatoKilo + " , Tutarı: " + totalTomatoPrice +
                "\nMuz kilosu: " + bananaKilo + " , Tutarı: " + totalBananaPrice +
                "\nPatlıcan kilosu: " + aubergineKilo + " , Tutarı: " + totalAuberginePrice +
                "\nTüm alışverişiniz : " + totalPrice + " TL" +
                "\nBizi tercih ettiğiniz için teşekkürler yine bekleriz.");
    }

}
