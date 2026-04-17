import java.util.Scanner;

public class AdvancedCalculator {

    static void plus(Scanner scan) {
        int result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi (0 ile bitir): ");
            int number = scan.nextInt();
            if (number == 0) break;
            result += number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void minus(Scanner scan) {
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = scan.nextInt();
        int result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi: ");
            int number = scan.nextInt();
            if (i == 1) result = number;
            else result -= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void times(Scanner scan) {
        int result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi (1 ile bitir): ");
            int number = scan.nextInt();
            if (number == 1) break;
            if (number == 0) { result = 0; break; }
            result *= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void divided(Scanner scan) {
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = scan.nextInt();
        double result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi: ");
            double number = scan.nextDouble();
            if (i != 1 && number == 0) { System.out.println("Bolen 0 olamaz."); continue; }
            if (i == 1) result = number;
            else result /= number;
        }
        System.out.println("Sonuc: " + result);
    }

    static void power(Scanner scan) {
        System.out.print("Taban: ");
        int base = scan.nextInt();
        System.out.print("Us: ");
        int exp = scan.nextInt();
        int result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        System.out.println("Sonuc: " + result);
    }

    static void factorial(Scanner scan) {
        System.out.print("Sayi: ");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        System.out.println("Sonuc: " + result);
    }

    static void mod(Scanner scan) {
        System.out.print("Birinci sayi: ");
        int a = scan.nextInt();
        System.out.print("Ikinci sayi: ");
        int b = scan.nextInt();
        System.out.println("Sonuc: " + (a % b));
    }

    static void rectangleAreaPerimeter(Scanner scan) {
        System.out.print("En: ");
        double width = scan.nextDouble();
        System.out.print("Boy: ");
        double height = scan.nextDouble();
        System.out.println("Alan: " + (width * height));
        System.out.println("Cevre: " + (2 * (width + height)));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme\n5- Uslu Sayi\n6- Faktoriyel\n7- Mod Alma\n8- Dikdortgen Alan ve Cevre\n0- Cikis";

        do {
            System.out.println(menu);
            System.out.print("Islem seciniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1: plus(scan); break;
                case 2: minus(scan); break;
                case 3: times(scan); break;
                case 4: divided(scan); break;
                case 5: power(scan); break;
                case 6: factorial(scan); break;
                case 7: mod(scan); break;
                case 8: rectangleAreaPerimeter(scan); break;
                case 0: System.out.println("Cikis yapiliyor."); break;
                default: System.out.println("Gecersiz secim.");
            }
        } while (select != 0);

        scan.close();
    }
}
