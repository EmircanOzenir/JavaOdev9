import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, password2;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adiniz: ");
        userName = input.nextLine();
        System.out.print("Sifreniz: ");
        password = input.nextLine();

        if (userName.equals("learning") && password.equals("java123")){
            System.out.print("Basariyla Giris Yaptiniz!");
        } else if (userName.equals("learning") && !(password.equals("java123"))) {
            System.out.println("Sifreniz Yanlis!\nSifrenizi Sifirlamak Ister Misiniz?");
            System.out.print("Yeni Sifreniz: ");
            password2 = input.nextLine();
            if (password.equals(password2)) {
                System.out.print("Sifre olusturulamadi, Lutfen baska sifre giriniz.");
            } else {
                System.out.print("Sifre olusturuldu");
            }
        }
    }
}
