import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String username = "Gafur" , password = "123456";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String userPassword = input.nextLine();

        if ((username.equals(userName)) && (password.equals(userPassword))) {
            System.out.println("Giriş yapılıyor.");
        } else if ((!username.equals(userName)) && (password.equals(userPassword))){
            System.out.println("Kullanıcı adı hatalı");
        } else if (!(password.equals(userPassword))){
            System.out.print("Şifre hatalı!\nŞifrenizi sıfırlamak istermisiniz? : ");
            String reset = input.nextLine();
            if ((reset.equals("Y")) || (reset.equals("y"))) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Yeni şifre eskisi ile aynı olamaz.");
                }else {
                    System.out.println("Yeni şifre oluşturma başarılı.");
                }
            }else if ((reset.equals("N")) || (reset.equals("n"))) {
                System.out.println("Lütfen doğru şifre ile giriş yapınız.");
            }
        }
        else {
            System.out.println("Kullanıcı adı ve şifre hatalı.");
        }

    }
}
