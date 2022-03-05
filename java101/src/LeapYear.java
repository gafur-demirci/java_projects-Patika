import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("artık");
            }else{
                System.out.println("artık değil");
            }
        }else if (year % 4 == 0){
            System.out.println("artık");
        }else{
            System.out.println("artık değil");
        }
    }
}