import java.util.Scanner;

public class JointFoldAverage {
    public  static void main(String[] args) {

        int n,counter= -1;
        double total = 0.0d, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                counter++;
            }
        }

        result = total / counter;
        System.out.println("Total : " + total + "\nCounter : " + counter + "\nResult : " + result);

    }
}
