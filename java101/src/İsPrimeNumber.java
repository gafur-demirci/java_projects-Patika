import java.util.Scanner;

public class İsPrimeNumber {
    public static void main(String[] args) {

        int n,counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i=1; i<= n; i++){
            if(n % i == 0){
                counter++;
            }
        }
        if(counter == 2){
            System.out.println("Girilen " + n + " sayısı asal sayıdır.");
        }else{
            System.out.println("Girilen " + n + " sayısı asal sayı değildir.");
        }
    }
}
