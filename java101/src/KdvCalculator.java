import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args){

        System.out.println("Kdv Hesaplama Sistemine Hoşgeldiniz...");

        double kdv1 = 0.18d, kdv2 = 0.08d , money , total , kdvMoney;

        Scanner input = new Scanner(System.in);
        System.out.print("Para tutarınızı giriniz: ");

        money = input.nextDouble();
        total = money > 0 && money < 1000 ? ((money * kdv1) + money) : ((money * kdv2) + money);
        kdvMoney = money > 0 && money < 1000 ? (money * kdv1) : (money * kdv2);

        System.out.println("Kdv'siz paranız: " + money);
        System.out.println("Kdv dahil paranız : " + total);
        System.out.println("Kdv tutarınız : " + kdvMoney);

    }
}
