import java.util.Scanner;

public class CreateMethodByPattern {

    public static int add(int n){
        n += 5;
        return n;
    }
    public static int minus(int n){
        n -= 5;
        return n;
    }

    public static void main(String[] args) {

        int n,temp;
        boolean cond = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        n = input.nextInt();
        temp = n;
        System.out.print(n + " ");

        while (n > 0) {
            n -= 5;
            System.out.print(n + " ");
        }
        while (n <= 0 || n != temp){
            n += 5;
            System.out.print(n + " ");
            if (n == temp){
                break;
            }
        }
    }
}
