import java.util.Scanner;

public class CalculatePowerOfNumbers {
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Us degerini giriniz: ");
        int exp = input.nextInt();

        System.out.println("Sonuc: " + power(base, exp));

        input.close();
    }
}
