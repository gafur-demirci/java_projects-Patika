import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i= 1; i <= n; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j<n; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
