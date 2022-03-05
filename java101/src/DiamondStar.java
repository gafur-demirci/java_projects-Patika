import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int a = 0; a < n; a++) {
            for (int c = 1; c <= (2 * a + 1); c++) {
                System.out.print(" ");
            }
            /*
            for (int b =0; b <= (n - a); b++) {
                System.out.print("*");
            }
             */
            System.out.println("*");
        }
        /*
        for (int a = 0; a < n; a++) {
            for (int c = 1; c <= (2 * a + 1); c++) {
                System.out.print(" ");
            }
            for (int b =0; b <= (n - a + 1); b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
----------
        for (int l = 0; l <= n; l++) {
            for (int m = l; m <= (n - l - 1); m--) {
                System.out.print("*");
            }

            for (int p = 0; p< (2 * l - 1); p--) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }*/
    }
}
