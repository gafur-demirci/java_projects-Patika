import java.util.Scanner;

public class AverageOfNotes {
    public static void main(String[] args){

        System.out.println("Not Hesaplama Sistemine Hoşgeldiniz...");

        int vize1, vize2, finals, vizeSum;
        double vizeAvg, avg;
        String result, result2;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Vize notunuzu giriniz: ");
        vize1 = input.nextInt();

        System.out.print("2. Vize notunuzu giriniz: ");
        vize2 = input.nextInt();

        System.out.print("Final notunuzu giriniz: ");
        finals = input.nextInt();

        vizeSum = vize1 + vize2;
        vizeAvg = vizeSum / 2.0;

        avg = ((vizeAvg * 0.4) + (finals * 0.6));
        System.out.println("1. Vize notunuz : "+ vize1 +
                "\n2. Vize Notunuz : " + vize2 +
                "\nFinal Notunuz : " + finals +
                "\nSınav Notlarınızın Ortalaması : " + avg);

        result = (vize1 < 50 || vize2 < 50) || finals < 50 ? "Vize veya Finalden Kaldın" : "Tebrikler geçtin";
        result2 = avg < 60 || finals < 50 ? "Ortalaman veya Final notun düşük" : "Tebrikler geçtin";
        System.out.println("Vize / Final Durumu: " + result);
        System.out.println("Ortalama / Final Durumu : " + result2);

    }
}
