import java.util.Scanner;

public class ExponentialCalculus {

    public static void main(String[] args) {

        int n,k,result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban degerini giriniz: ");
        n = input.nextInt();

        System.out.print("Üs degerini giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <=k; i++) {
            result *= n;
        }

        System.out.println("Tabanı : " + n + " Üssü : " + k + " olan sayı : " + result);
    }
}
