import java.util.Arrays;
import java.util.Scanner;

public class MinMaxCalculator {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı girmek istiyorsunuz? : ");
        int counter = input.nextInt();
        int[] nums = new int[counter];

        for(int i = 1; i<= counter; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            num = input.nextInt();
            nums[i-1] = num;
        }

        int maksimum = Arrays.stream(nums).max().getAsInt();
        int minimum = Arrays.stream(nums).min().getAsInt();
        System.out.println("Girilen en küçük sayı : " + minimum);
        System.out.println("Girilen en büyük sayı : " + maksimum);
    }
}