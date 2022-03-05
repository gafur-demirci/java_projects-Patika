public class Fibonacci {

    static int f(int n) {
        System.out.println("N => " + n);
        if (n == 1 ) {
            return 1;
        }
        int total = f(n-1) + n;
        System.out.println("Toplam : " + total);
        return total;

    }

    public static void main(String[] args) {

        f(3);
    }

}
