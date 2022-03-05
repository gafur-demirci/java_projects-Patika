import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        int num,total=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        for(int i=1; i < num; i++){
            if(num % i == 0){
                total += i;
            }
        }
        if(num == total){
            System.out.println("Girilen "+ num + " sayısı mükemmel sayıdır.");
        }else{
            System.out.println("Girilen "+ num + " sayısı mükemmel sayı değildir.");
        }
    }



}
