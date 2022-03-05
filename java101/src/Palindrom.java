import java.util.Scanner;

public class Palindrom {

    static boolean isPalindorm(int n) {
        int temp, mod,reverseNum = 0;
        temp = n;

        while (temp != 0) {
            mod = temp % 10;
            reverseNum = (reverseNum * 10) + mod;
            temp /= 10;
        }
        return reverseNum == n;
    }

    public static  void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        if (isPalindorm(number)) {
            System.out.println("Girdiğiniz " + number +" sayısı bir palindrom sayıdır.");
        }
        else {
            System.out.println("Girdiğiniz " + number +" sayısı bir palindrom sayı değildir.");
        }

    }
}
