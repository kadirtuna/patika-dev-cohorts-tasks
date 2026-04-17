import java.util.Scanner;

public class FindHarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();

        double harmonicSum = 0;
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println(n + ". harmonik seri toplami: " + harmonicSum);

        input.close();
    }
}
