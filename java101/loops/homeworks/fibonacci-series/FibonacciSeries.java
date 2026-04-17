import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayisini giriniz: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lutfen pozitif bir sayi giriniz.");
            return;
        }

        int first = 0, second = 1;

        System.out.print(n + " Elemanli Fibonacci Serisi : ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        input.close();
    }
}
