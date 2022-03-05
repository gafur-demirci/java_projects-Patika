import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Kullanıcıdan Girdi Alan Uygulama...");
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        a = input.nextInt();
        System.out.println("Girilen sayi: " + a);
    }
}
