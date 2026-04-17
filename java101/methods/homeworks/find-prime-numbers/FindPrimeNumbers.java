import java.util.Scanner;

public class FindPrimeNumbers {
    static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor > Math.sqrt(n)) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();

        if (isPrime(n, 2)) {
            System.out.println(n + " sayisi ASALDIR!");
        } else {
            System.out.println(n + " sayisi ASAL degildir!");
        }

        input.close();
    }
}
