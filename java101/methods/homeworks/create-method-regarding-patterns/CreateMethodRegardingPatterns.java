import java.util.Scanner;

public class CreateMethodRegardingPatterns {
    static void pattern(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        pattern(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz: ");
        int n = input.nextInt();
        pattern(n);
        System.out.println();
        input.close();
    }
}
