import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanici Adiniz: ");
            String userName = input.nextLine();
            System.out.print("Parolaniz: ");
            String password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                do {
                    System.out.println("1- Para yatirma");
                    System.out.println("2- Para Cekme");
                    System.out.println("3- Bakiye Sorgula");
                    System.out.println("4- Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();
                    input.nextLine();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktari: ");
                            int deposit = input.nextInt();
                            input.nextLine();
                            balance += deposit;
                            System.out.println("Yeni bakiye: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktari: ");
                            int withdraw = input.nextInt();
                            input.nextLine();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdraw;
                                System.out.println("Yeni bakiye: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                        default:
                            System.out.println("Gecersiz secim. Tekrar deneyiniz.");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur, lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }

        input.close();
    }
}
