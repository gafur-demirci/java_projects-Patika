import java.util.Scanner;

public class SumStepNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        int n = input.nextInt();
        int tempNumber = n;
        int basValue;
        int result = 0;

        tempNumber = n;
        while (tempNumber != 0) {

            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println("Basamakların toplamı : " + result);
    }
}
