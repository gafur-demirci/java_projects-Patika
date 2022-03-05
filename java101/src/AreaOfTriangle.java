import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        System.out.println("Üçgen Alanı Hesaplayan Programa Hoşgeldiniz...");

        int kenar1, kenar2, kenar3;
        double u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar: ");
        kenar1 = input.nextInt();

        System.out.print("İkinci kenar: ");
        kenar2 = input.nextInt();

        System.out.print("Üçüncü kenar: ");
        kenar3 = input.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2.0;
        alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        String result = kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1 ?
                "Geçerli Üçgen" : "Geçersiz Üçgen";

        String sonuc = result.equals("Geçerli Üçgen") ?
                "Üçgenin ilk kenarı: " + kenar1 +
                "\nÜçgenin ikinci kenarı: " + kenar2 +
                "\nÜçgenin üçüncü kenarı: " + kenar3 +
                "\nÜçgenin çevresi: " + 2*u +
                "\nÜçgenin alanı: " + alan :
                "Geçersiz değerler girdiniz.";

        System.out.println(result);
        System.out.println(sonuc);
        
    }
}
