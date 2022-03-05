import java.util.Scanner;

public class FactorialAndCombination {

    static int factorial(int n) {
        int total = 1;
        // n!
        for (int i = 1; i <= n; i++) {
            total *= i;

        }
        return total;
    }

    static int combination(int n, int r) {

        //C(n,r) = n! / (r! * (n-r)!)

        return factorial(n) / (factorial(r) * (factorial(n-r)));

    }

    public static void main(String[] args) {

        int n, r;

        Scanner input = new Scanner(System.in);

        System.out.print("N = ");
        n = input.nextInt();

        System.out.print("R = ");
        r = input.nextInt();

        if ( n > r ) {
            double comb;
            comb = combination(n,r);
            System.out.println(n + "'in " + r + "'li combination : " + comb);
        }
    }
}
