import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayiyi giriniz: ");
            int num = input.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

        input.close();
    }
}
