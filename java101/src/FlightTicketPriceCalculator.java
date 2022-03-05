import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {

        double kilometers,total,ticketPrice,ageDiscount,pricePerKm = 0.10d;
        int age,type;

        Scanner input = new Scanner(System.in);
        System.out.print("Uçuş mesafenizi giriniz(km): ");
        kilometers = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Uçuş tipinizi giriniz\n1- Tek yön\n2- Gidiş-Dönüş\nTip: ");
        type = input.nextInt();

        ticketPrice = kilometers * pricePerKm;
        if ( kilometers > 0 && age > 0 ){
            if ( age < 12 ) {
                ageDiscount = ticketPrice * 0.5;
                total = ticketPrice - ageDiscount;
                if ( type == 2 ) {
                    total = 2* (total- (total*0.2));
                    System.out.println("Total bilet fiyatı : " + total);
                } else {
                System.out.println("Total bilet fiyatı : " + total);
                }
            }
            else if (age <= 24) {
                ageDiscount = ticketPrice * 0.1;
                total = ticketPrice - ageDiscount;
                if ( type == 2 ) {
                    total = 2* (total- (total*0.2));
                    System.out.println("Total bilet fiyatı : " + total);
                } else {
                    System.out.println("Total bilet fiyatı : " + total);
                }
            }
            else if ( age > 65 ) {
                ageDiscount = ticketPrice * 0.3;
                total = ticketPrice - ageDiscount;
                if ( type == 2 ) {
                    total = 2* (total- (total*0.2));
                    System.out.println("Total bilet fiyatı : " + total);
                } else {
                    System.out.println("Total bilet fiyatı : " + total);
                }
            } else {
                total = ticketPrice;
                if ( type == 2) {
                    total = 2* (total- (total*0.2));
                    System.out.println("Total bilet fiyatı : " + total);
                } else {
                    System.out.println("Total bilet fiyatı : " + total);
                }
            }
        }
        else {
            System.out.println("Hatalı veri girişi.");
        }
    }
}
